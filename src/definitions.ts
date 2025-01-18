export interface VideoDataBridgePlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
