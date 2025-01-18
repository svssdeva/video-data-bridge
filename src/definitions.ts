export interface VideoDataBridgePlugin {
    openVideo(videoData: VideoData): Promise<{ success: boolean }>;

    openDownloadsPage(): Promise<{ success: boolean }>;
}

export interface VideoData {
    token: string,
    userId: string,
    videoData: string,
    clientId: string,
    clientType: string,
    randomId: string
}
