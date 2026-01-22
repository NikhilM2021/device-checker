package com.nikhil.devicechecker.plugin;

// import com.getcapacitor.Logger;

import com.getcapacitor.*;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.nikhil.devicecheckerlibrary.DeviceChecker;

@CapacitorPlugin(name = "DeviceChecker")
class DeviceCheckerPlugin : Plugin() {

    @PluginMethod
    fun getDeviceDetail(call: PluginCall) {
        val checker = DeviceChecker(context)  // Use your library
        val result = checker.getDeviceDetail()

        // Convert result to JSObject to return to Ionic
        val ret = JSObject().apply {
            put("isEmulator", result.isEmulator)
            put("isRooted", result.isRooted)
            put("isSecure", result.isSecure)
        }

        call.resolve(ret)
    }
}