package com.example.usmankhan.workoutadvisor;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.usmankhan.workoutadvisor.Bounding.LocalBinder;

public class Bound extends AppCompatActivity {

    public void btn_click(View view) {
        String currenttime = bounding.getCurrentTime();
        TextView mytext = (TextView) findViewById( R.id.text_service );
        mytext.setText( currenttime );
    }

    Bounding bounding;
    boolean isBound = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_bound );

        Intent i = new Intent( this, Bounding.class );
        bindService( i, serviceConnection, Context.BIND_AUTO_CREATE );

    }

    private ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            LocalBinder bound = (LocalBinder) service;
            bounding = bound.getBounding();
            isBound = true;
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            isBound = false;

        }
    };

}
