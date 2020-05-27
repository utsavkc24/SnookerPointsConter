package com.example.snooker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int a = 0;
    int b = 0;
    int totalA = 147;
    int totalB = 147;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*
    Display the score of Team A
     */
    public void displayTeamA(int points){
        TextView textView = (TextView)findViewById(R.id.team_a_score);
        textView.setText(String.valueOf(points));
    }

    /*
   Display the score of Team B
    */
    public void displayTeamB(int points){
        TextView textView = (TextView)findViewById(R.id.team_b_score);
        textView.setText(String.valueOf(points));
    }

    /*
    Team A pot points
     */
    public void potA(View view){
        a = a + 1;
        pointLeftA(totalA - a);
        displayTeamA(a);
    }
    /*
    Team B pot points
     */
    public void potB(View view){
        b = b + 1;
        pointLeftB(totalB - b);
        displayTeamB(b);
    }
    /*
   Team A points left
    */
    public void pointLeftA(int total){
        if(total > 147 || total < 0)
            return;
        TextView textView = (TextView)findViewById(R.id.point_left_A);
        textView.setText(String.valueOf(total));
    }
    /*
    Team B points left
     */
    public void pointLeftB(int total){
        if(total > 147 || total < 0)
            return;
        TextView textView = (TextView)findViewById(R.id.point_left_B);
        textView.setText(String.valueOf(total));
    }

    /*
 Team A foul points
  */
    public void foulA(View view){
        a = a - 1;
        pointLeftA(totalA + 1);
        displayTeamA(a);
    }
    /*
    Team B foul points
     */
    public void foulB(View view){
        b = b - 1;
        pointLeftB(totalB + 1);
        displayTeamB(b);
    }

    public void frame(View view){
        a = 0;
        b = 0;
        totalA = 147;
        totalB = 147;
        displayTeamB(b);
        displayTeamA(a);
        pointLeftA(totalA);
        pointLeftB(totalB);
    }

}
