
package com.devfather;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.mixpanel.android.mpmetrics.MixpanelAPI;

public class DFMixpanelModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    MixpanelAPI mixpanel;

    public DFMixpanelModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;

        // Flush when app lifecycle has ended
        reactContext.addLifecycleEventListener(this);
    }

    @Override
    public String getName() {
        return "DFMixpanel";
    }

    @ReactMethod
    public void sharedInstanceWithToken(final String token) {
        mixpanel = MixpanelAPI.getInstance(reactContext, token);
    }
}
