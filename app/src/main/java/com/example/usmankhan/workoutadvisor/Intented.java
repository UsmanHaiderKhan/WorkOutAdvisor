package com.example.usmankhan.workoutadvisor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Intented extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_intented );
    }

    public void onMoveClick(View view) {
        Intent i=new Intent( this,Redirected.class );
       final EditText first_input=(EditText) findViewById( R.id.first_input );
        String usermessage=first_input.getText().toString();
        i.putExtra( "Messanger",usermessage );
        startActivity( i );
    }
}
