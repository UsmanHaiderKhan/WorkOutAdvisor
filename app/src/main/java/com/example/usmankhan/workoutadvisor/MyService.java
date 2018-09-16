package com.example.usmankhan.workoutadvisor;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    private static String TAG = "com.example.usmankhan.workoutadvisor";

    public MyService() {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i( TAG, "OnStartCommand" );

        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    long futuretime = System.currentTimeMillis() + 5000;
                    while (System.currentTimeMillis() < futuretime) {
                        synchronized (this) {
                            try {
                                wait( futuretime - System.currentTimeMillis() );
                                Log.i( TAG, "Service is Started" );
                            } catch (Exception e) {

                            }
                        }
                    }
                }
            }
        };
        Thread myThread = new Thread( r );
        myThread.start();
        return Service.START_STICKY;
    }


    @Override
    public void onDestroy() {
        Log.i( TAG, "ON DESTROY COMMAND" );
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
