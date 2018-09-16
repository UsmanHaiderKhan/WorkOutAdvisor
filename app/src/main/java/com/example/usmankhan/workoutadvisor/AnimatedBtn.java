package com.example.usmankhan.workoutadvisor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class AnimatedBtn extends AppCompatActivity {
   ViewGroup group;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_animated_btn );

        group= findViewById( R.id.myLayout );
        group.setOnTouchListener(
                new RelativeLayout.OnTouchListener(){
                    public boolean onTouch(View view, MotionEvent event){
                         moveButton();
                         return true;
                    }
                }
        );
    }
    public void moveButton(){
        TransitionManager.beginDelayedTransition(group);
        View mybtn=findViewById( R.id.mybtn );
        RelativeLayout.LayoutParams buttonDetail= new RelativeLayout.LayoutParams(
                 RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        buttonDetail.addRule( RelativeLayout.ALIGN_PARENT_BOTTOM,RelativeLayout.TRUE );
        mybtn.setLayoutParams( buttonDetail );
       // Set the Size of Layout Perametters
        ViewGroup.LayoutParams sizeRules=mybtn.getLayoutParams();
        sizeRules.width=450;
        sizeRules.height=300;
        mybtn.setLayoutParams( sizeRules );


    }
}
