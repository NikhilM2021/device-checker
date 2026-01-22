package com.nikhil.devicechecker.plugin;

// import com.getcapacitor.Logger;

import com.getcapacitor.*;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.nikhil.devicecheckerlibrary.DeviceChecker;

@CapacitorPlugin(name = "DeviceChecker")
public class DeviceCheckerPlugin : Plugin() {

    @PluginMethod
     @PluginMethod
    public void getDeviceDetail(PluginCall call) {
        Context context = getContext();
        DeviceChecker checker = new DeviceChecker(context);
        DeviceDetail result = checker.getDeviceDetail();

        JSObject ret = new JSObject();
        ret.put("isEmulator", result.isEmulator());
        ret.put("isRooted", result.isRooted());
        ret.put("isSecure", result.isSecure());

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