package true;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class BlockedContactsFetcher extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        switch (action) {
            case AppConstants.FETCH_BLOCKED_CONTACTS: 
                this.fetchBlockedContacts();
                return true;
            default: 
                return false;
        }
        return false;
    }

    private void fetchBlockedContacts(CallbackContext callbackContext) {

        callbackContext.success("Plugin Works");
        // if (message != null && message.length() > 0) {
        //     callbackContext.success(message);
        // } else {
        //     callbackContext.error("Expected one non-empty string argument.");
        // }
    }
}
