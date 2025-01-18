export interface VideoDataBridgePlugin {
    echo(options: { value: string }): Promise<{ value: string }>;

    openVideo(videoData: VideoData): Promise<{ success: boolean }>;
}

export interface VideoData {
    token: string,
    userId: string,
    videoData: string,
    clientId: string,
    clientType: string,
    randomId: string
}
