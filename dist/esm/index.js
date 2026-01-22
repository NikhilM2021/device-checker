import { registerPlugin } from '@capacitor/core';
// const DeviceCheckerPlugin = registerPlugin<DeviceCheckerPluginPlugin>('DeviceCheckerPlugin', {
//   web: () => import('./web').then((m) => new m.DeviceCheckerPluginWeb()),
// });
export * from './definitions';
// export { DeviceCheckerPlugin };
export const DeviceChecker = registerPlugin('DeviceChecker');
//# sourceMappingURL=index.js.map