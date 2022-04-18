package com.tothestars.phoneapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tothestars.phoneapp.databinding.ActivityPhoneBinding

@SuppressLint("SetTextI18n")
class PhoneActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPhoneBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPhoneBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = Selected.manufacturer
        binding.tvPhoneName.text = Selected.phone!!.model
        binding.tvPhoneYear.text = Selected.phone!!.year.toString()
        binding.tvPhoneChipset.text = Selected.phone!!.chipset
        binding.tvPhoneOS.text = Selected.phone!!.os
        binding.tvPhoneStorage.text =
            "RAM: " + Selected.phone!!.ram + " Gb | ROM: " + Selected.phone!!.storage
        binding.tvPhoneWeight.text = Selected.phone!!.weight.toString() + " g"
        binding.tvPhoneDisplayType.text = Selected.phone!!.displayType
        binding.tvPhoneDisplay.text =
            "Size: " + Selected.phone!!.displaySize.toString() + "\" | Resolution: " + Selected.phone!!.displayResolution
        binding.tvPhoneBattery.text = Selected.phone!!.battery.toString() + " mAh"
        binding.tvPhonePrice.text = Selected.phone!!.price.toString() + "$"
    }
}