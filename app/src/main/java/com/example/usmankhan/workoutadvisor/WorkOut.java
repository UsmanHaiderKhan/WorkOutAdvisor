package com.example.usmankhan.workoutadvisor;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class WorkOut extends Activity {
    private WorkOutExpert expert = new WorkOutExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_work_advisor );
    }

    public void onClickfindWorkOut(View view) {
        TextView textView = (TextView) findViewById( R.id.workAt );
        Spinner spinner = (Spinner) findViewById( R.id.workoutype );
        String work = String.valueOf( spinner.getSelectedItem() );
        //textView.setText(work);
        List<String> stringList = expert.GetWorkOuts( work );
        StringBuilder builder = new StringBuilder();
        for (String workdone : stringList) {
            builder.append( workdone ).append( '\n' );
        }
        textView.setText( builder );
    }
}
