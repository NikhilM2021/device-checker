import { registerPlugin } from '@capacitor/core';

// import type { DeviceCheckerPluginPlugin } from './definitions';
import type { DeviceCheckerPlugin } from './definitions'

// const DeviceCheckerPlugin = registerPlugin<DeviceCheckerPluginPlugin>('DeviceCheckerPlugin', {
//   web: () => import('./web').then((m) => new m.DeviceCheckerPluginWeb()),
// });

export * from './definitions';
// export { DeviceCheckerPlugin };



export const DeviceChecker = registerPlugin<DeviceCheckerPlugin>(
  'DeviceChecker'
);
