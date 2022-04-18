package com.tothestars.phoneapp

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tothestars.phoneapp.databinding.ActivityManufacturerBinding


class ManufacturerActivity : AppCompatActivity(), ManufacturerAdapterCallback {
    private lateinit var binding: ActivityManufacturerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityManufacturerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        AllSharedPreferences.init(this)
        title = "Brands"

    }

    override fun onResume() {
        super.onResume()
        Selected.devices = AllSharedPreferences.devices
        updateRecycler()
    }


    private fun updateRecycler() {
        binding.rvManufacturer.layoutManager =
            LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        binding.rvManufacturer.adapter =
            ManufacturerAdapter(Selected.devices!!.keys.toList(), this)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.manufacturer_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val editTextField = EditText(this)

        val dialog: AlertDialog = AlertDialog.Builder(this)
            .setTitle("Manufacturer")
            .setView(editTextField)
            .setPositiveButton("Add") { _, _ ->
                val manufacturer = editTextField.text.toString()
                Selected.devices!![manufacturer] = mutableListOf()
                AllSharedPreferences.devices = Selected.devices!!
                updateRecycler()
            }
            .setNegativeButton("Cancel", null)
            .create()

        dialog.show()
        return super.onOptionsItemSelected(item)
    }

    override fun onClickItem(item: String) {
        Selected.manufacturer = item
        startActivity(Intent(this, DevicesActivity::class.java))
    }


}

