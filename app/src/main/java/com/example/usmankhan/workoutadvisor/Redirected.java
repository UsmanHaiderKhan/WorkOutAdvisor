package com.example.usmankhan.workoutadvisor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Redirected extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_redirected );
        Bundle firstdata=getIntent().getExtras();
        if (firstdata==null){
            return;
        }
        String first_message=firstdata.getString( "Messanger" );
        final TextView textView=findViewById( R.id.second_text );
        textView.setText( first_message );
    }

    public void onClickBack(View view) {
        Intent v=new Intent( this,Intented.class );
        startActivity( v );
    }
}
