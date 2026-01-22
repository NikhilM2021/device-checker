import { WebPlugin } from '@capacitor/core';

import type { DeviceCheckerPluginPlugin } from './definitions';

export class DeviceCheckerPluginWeb extends WebPlugin implements DeviceCheckerPluginPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
