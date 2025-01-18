export interface VideoDataBridgePlugin {
    echo(options: { value: string }): Promise<{ value: string }>;

    openVideo(videoData: VideoData): Promise<void>;
}

export interface VideoData {
    token: string,
    userId: string,
    videoData: any,
    clientId: string,
    clientType: string,
    randomId: string
}
