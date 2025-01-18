package svssdeva.video.data.bridge;

import android.util.Log;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

import org.json.JSONException;

@CapacitorPlugin(name = "VideoDataBridge")
public class VideoDataBridgePlugin extends Plugin {

    private final VideoDataBridge implementation = new VideoDataBridge();

     @PluginMethod
        public void openVideo(PluginCall call) throws JSONException {
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
     }
}
