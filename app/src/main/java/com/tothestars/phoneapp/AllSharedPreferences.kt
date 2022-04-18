package com.tothestars.phoneapp

import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

object AllSharedPreferences {
    private const val NAME = "devices"
    private const val MODE = Context.MODE_PRIVATE

    private lateinit var sharedPreferences: SharedPreferences

    fun init(context: Context) {
        sharedPreferences = context.getSharedPreferences(NAME, MODE)
    }

    private inline fun SharedPreferences.edit(operation: (SharedPreferences.Editor) -> Unit) {
        val editor = edit()
        operation(editor)
        editor.apply()
    }

    var devices: MutableMap<String, List<PhoneModel>>
        get() = toMap(sharedPreferences.getString(NAME, toStr(Devices.devices))!!)
        set(value) = sharedPreferences.edit {
            it.putString(NAME, toStr(value))
        }

    private fun toMap(gsonString: String): MutableMap<String, List<PhoneModel>> {
        val type = object : TypeToken<Map<String, List<PhoneModel>>>() {}.type
        return Gson().fromJson(gsonString, type)
    }

    private fun toStr(map: MutableMap<String, List<PhoneModel>>): String = Gson().toJson(map)
}