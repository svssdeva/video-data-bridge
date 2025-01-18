import {WebPlugin} from '@capacitor/core';

import type {VideoData, VideoDataBridgePlugin} from './definitions';
import * as console from "node:console";

export class VideoDataBridgeWeb extends WebPlugin implements VideoDataBridgePlugin {
    async echo(options: { value: string }): Promise<{ value: string }> {
        console.log('ECHO', options);
        return options;
    }

    async openVideo(videoData: VideoData): Promise<{ success: boolean }> {
        console.log(videoData);
        return {success: true};
    }
}
