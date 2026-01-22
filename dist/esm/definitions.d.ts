export interface DeviceCheckerPlugin {
    getDeviceDetail(): Promise<{
        isEmulator: boolean;
        isRooted: boolean;
        isSecure: boolean;
    }>;
}
