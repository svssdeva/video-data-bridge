import { registerPlugin } from '@capacitor/core';

import type { VideoDataBridgePlugin } from './definitions';

const VideoDataBridge = registerPlugin<VideoDataBridgePlugin>('VideoDataBridge', {
  web: () => import('./web').then((m) => new m.VideoDataBridgeWeb()),
});

export * from './definitions';
export { VideoDataBridge };
