package com.example.usmankhan.workoutadvisor;

import java.util.ArrayList;
import java.util.List;

public class WorkOutExpert  {

    List<String> GetWorkOuts(String workouttypes){
        List<String> workout=new ArrayList<String>();
        if (workouttypes.equals("Chest")){
            workout.add("hahahahha Do Some Thing");
            workout.add("Soki Hoi Chest tu Mera Ja");

        }
        else if(workouttypes.equals("Shoulder")){
            workout.add("Maama Kity Shoulder na Terwa Lyna ");
            workout.add("Fuck the Shoulder");
        }
        else if(workouttypes.equals("Biceps")){
            workout.add("Do Hand Job for Biceps");
            workout.add("Do Hande Job Day And Night");
        }
        else if(workouttypes.equals("triceps")){
            workout.add("Making Triceps for Good Looking");
            workout.add("Mutal Don't Get the triceps");
        }
        else if(workouttypes.equals("SixEbbs")){
            workout.add("Make Harder Work Out for Six Packs");
            workout.add("Ding Dong Daily Khana");
        }

           return workout;

    }

}
