import { VideoDataBridge } from '@svssdeva/video-data-bridge';

window.testEcho = () => {
    const inputValue = document.getElementById("echoInput").value;
    VideoDataBridge.echo({ value: inputValue })
}
