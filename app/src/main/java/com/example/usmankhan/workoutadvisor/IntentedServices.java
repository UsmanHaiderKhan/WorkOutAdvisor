package com.example.usmankhan.workoutadvisor;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

public class IntentedServices extends IntentService {
    private static String TAG = "com.example.usmankhan.workoutadvisor";

    public IntentedServices() {
        super( "IntentedServices" );
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.i( TAG, "Service has been started" );
    }
}
