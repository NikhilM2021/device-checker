// package com.nikhil.devicechecker.plugin;

// import com.getcapacitor.JSObject;
// import com.getcapacitor.Plugin;
// import com.getcapacitor.PluginCall;
// import com.getcapacitor.PluginMethod;
// import com.getcapacitor.annotation.CapacitorPlugin;

// @CapacitorPlugin(name = "DeviceCheckerPlugin")
// public class DeviceCheckerPluginPlugin extends Plugin {

//     private DeviceCheckerPlugin implementation = new DeviceCheckerPlugin();

//     @PluginMethod
//     public void echo(PluginCall call) {
//         String value = call.getString("value");

//         JSObject ret = new JSObject();
//         ret.put("value", implementation.echo(value));
//         call.resolve(ret);
//     }
// }
