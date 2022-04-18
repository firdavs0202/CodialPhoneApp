package com.tothestars.phoneapp

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tothestars.phoneapp.databinding.ActivityDevicesBinding

class DevicesActivity : AppCompatActivity(), DevicesAdapterCallback {
    private lateinit var binding: ActivityDevicesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDevicesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "${Selected.manufacturer} phones"
        binding.rvDevices.layoutManager = LinearLayoutManager(
            this,
            RecyclerView.VERTICAL,
            false
        )
    }

    override fun onResume() {
        super.onResume()
        binding.rvDevices.adapter =
            DevicesAdapter(Selected.devices!![Selected.manufacturer!!]!!, this)
    }

    override fun onClickItem(item: PhoneModel) {
        Selected.phone = item
        startActivity(Intent(this, PhoneActivity::class.java))
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.devices_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        startActivity(Intent(this, AddDeviceActivity::class.java))
        return super.onOptionsItemSelected(item)
    }
}