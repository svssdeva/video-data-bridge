import {WebPlugin} from '@capacitor/core';

import type {VideoData, VideoDataBridgePlugin} from './definitions';


export class VideoDataBridgeWeb extends WebPlugin implements VideoDataBridgePlugin {

    async openVideo(videoData: VideoData): Promise<{ success: boolean }> {
        console.log(videoData);
        return {success: true};
    }

    async openDownloadsPage(): Promise<{ success: boolean }> {
        console.log('navigating to downloads page');
        return {success: true};
    }
}
