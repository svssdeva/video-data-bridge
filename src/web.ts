import { WebPlugin } from '@capacitor/core';

import type { VideoDataBridgePlugin } from './definitions';

export class VideoDataBridgeWeb extends WebPlugin implements VideoDataBridgePlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
