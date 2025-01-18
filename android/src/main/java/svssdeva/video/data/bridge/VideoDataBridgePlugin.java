package svssdeva.video.data.bridge;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "VideoDataBridge")
public class VideoDataBridgePlugin extends Plugin {

    private VideoDataBridge implementation = new VideoDataBridge();

    @PluginMethod
    public void echo(PluginCall call) {
        String value = call.getString("value");

        JSObject ret = new JSObject();
        ret.put("value", implementation.echo(value));
        call.resolve(ret);
    }
     @PluginMethod
        public void openVideo(PluginCall call) {
            try {
                String token = call.getString("token");
                String userId = call.getString("userId");
                String videoData = call.getString("videoData"); // Assuming this is passed as JSON
                String clientId = call.getString("clientId");
                String clientType = call.getString("clientType");
                String randomId = call.getString("randomId");

                Log.d("VideoDataBridgePlugin", "Token: " + token);
                Log.d("VideoDataBridgePlugin", "UserId: " + userId);
                Log.d("VideoDataBridgePlugin", "VideoData: " + videoData);
                Log.d("VideoDataBridgePlugin", "ClientId: " + clientId);
                Log.d("VideoDataBridgePlugin", "ClientType: " + clientType);
                Log.d("VideoDataBridgePlugin", "RandomId: " + randomId);

                // Add custom logic for using video data here

                call.resolve(new JSObject().put("success", true));
            } catch (JSONException e) {
                call.reject("Invalid video data", e);
            }
        }
}
