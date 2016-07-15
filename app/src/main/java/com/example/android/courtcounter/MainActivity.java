package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA=0;
    int scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //click  3A
    public void point3A(View view)
    {
        scoreA=scoreA + 3;
        displayForTeamA(scoreA);
    }

    //click  2A
    public void point2A(View view)
    {
        scoreA=scoreA + 2;
        displayForTeamA(scoreA);
    }
    //click  1A
    public void point1A(View view)
    {
        scoreA=scoreA + 1;
        displayForTeamA(scoreA);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));

    }

    //click  3B
    public void point3B(View view)
    {
        scoreB=scoreB + 3;
        displayForTeamB(scoreB);
    }

    //click  2B
    public void point2B(View view)
    {
        scoreB=scoreB + 2;
        displayForTeamB(scoreB);
    }
    //click  1B
    public void point1B(View view)
    {
        scoreB=scoreB + 1;
        displayForTeamB(scoreB);
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    public void reset(View view)
    {
        scoreA=0;
        scoreB=0;
        displayForTeamA( scoreA);
        displayForTeamB( scoreB);
    }
}
