package com.nikhil.devicechecker.plugin;

// import com.getcapacitor.Logger;

import com.getcapacitor.*;


import com.nikhil.devicecheckerlibrary.DeviceChecker;

import com.nikhil.devicecheckerlibrary.DeviceDetail;


import android.content.Context;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.annotation.PluginMethod;

@CapacitorPlugin(name = "DeviceChecker")
public class DeviceCheckerPlugin extends Plugin {

     @PluginMethod
    public void getDeviceDetail(PluginCall call) {
        // Get Android context safely
        Context context = getActivity().getApplicationContext();

        // Use your AAR library
        DeviceChecker checker = new DeviceChecker(context);
        DeviceDetail result = checker.getDeviceDetail();

        // Convert result to JSObject to return to Ionic
        JSObject ret = new JSObject();
        ret.put("isEmulator", result.isEmulator());
        ret.put("isRooted", result.isRooted());
        ret.put("isSecure", result.isSecure());

        // Return result to Capacitor
        call.resolve(ret);
    }
    // fun getDeviceDetail(call: PluginCall) {
    //     val checker = DeviceChecker(context)  // Use your library
    //     val result = checker.getDeviceDetail()

    //     // Convert result to JSObject to return to Ionic
    //     val ret = JSObject().apply {
    //         put("isEmulator", result.isEmulator)
    //         put("isRooted", result.isRooted)
    //         put("isSecure", result.isSecure)
    //     }

    //     call.resolve(ret)
    // }
}