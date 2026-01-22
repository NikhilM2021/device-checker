// export interface DeviceCheckerPluginPlugin {
//   echo(options: { value: string }): Promise<{ value: string }>;
// }

export interface DeviceCheckerPlugin {
  getDeviceDetail(): Promise<{
    isEmulator: boolean;
    isRooted: boolean;
    isSecure: boolean;
  }>;
}