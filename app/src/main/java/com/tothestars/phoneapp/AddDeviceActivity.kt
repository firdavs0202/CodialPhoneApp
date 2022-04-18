package com.tothestars.phoneapp

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.tothestars.phoneapp.databinding.ActivityAddDeviceBinding


class AddDeviceActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddDeviceBinding
    private lateinit var editTexts: List<EditText>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddDeviceBinding.inflate(layoutInflater)
        title = "Add ${Selected.manufacturer} phone"
        setContentView(binding.root)
        editTexts = listOf(
            binding.etAddModel,
            binding.etAddYear,
            binding.etAddOS,
            binding.etAddChipset,
            binding.etAddRAM,
            binding.etAddStorage,
            binding.etAddWeight,
            binding.etAddDisplayType,
            binding.etAddDisplaySize,
            binding.etAddDisplayResolution,
            binding.etAddBattery,
            binding.etAddPrice
        )
    }

    fun addPhone(view: View) {
        for (et in editTexts)
            if (et.text.isEmpty()) {
                et.error = "${et.hint} required"
                return
            }

        val phone = PhoneModel(
            binding.etAddModel.text.toString(),
            binding.etAddYear.text.toString().toInt(),
            binding.etAddOS.text.toString(),
            binding.etAddChipset.text.toString(),
            binding.etAddRAM.text.toString(),
            binding.etAddStorage.text.toString(),
            binding.etAddWeight.text.toString().toInt(),
            binding.etAddDisplayType.text.toString(),
            binding.etAddDisplaySize.text.toString().toDouble(),
            binding.etAddDisplayResolution.text.toString(),
            binding.etAddBattery.text.toString().toInt(),
            binding.etAddPrice.text.toString().toDouble()
        )

        val manufacturerDevices =
            Selected.devices!![Selected.manufacturer]!!.toMutableList()

        manufacturerDevices.add(phone)
        Selected.devices!![Selected.manufacturer!!] = manufacturerDevices
        AllSharedPreferences.devices = Selected.devices!!

        finish()
    }


}