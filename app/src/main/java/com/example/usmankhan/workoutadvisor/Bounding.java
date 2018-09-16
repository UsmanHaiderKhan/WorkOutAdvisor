package com.example.usmankhan.workoutadvisor;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Bounding extends Service {
    private final IBinder binder = new LocalBinder();

    public Bounding() {

    }

    public class LocalBinder extends Binder {
        Bounding getBounding() {
            return Bounding.this;
        }
    }

    public String getCurrentTime() {
        SimpleDateFormat df = new SimpleDateFormat( "hh:mm:ss", Locale.CANADA );
        return (df.format( new Date() ));
    }

    @Override
    public IBinder onBind(Intent intent) {
        return binder;
    }
}
