package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Team A.
     */
    int scoreteamA;
    public void increment3(View view)
    {
        scoreteamA=scoreteamA+3;
        displayForTeamA(scoreteamA);
    }
    public void increment2(View view)
    {
        scoreteamA=scoreteamA+2;
        displayForTeamA(scoreteamA);
    } public void increment1(View view)
    {
        scoreteamA=scoreteamA+1;
        displayForTeamA(scoreteamA);
    }
    public void resetscore(View view)
    {
        scoreteamA=0;
        scoreteamb=0;
        displayForTeamA(scoreteamA);
        displayForTeamB(scoreteamb);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    int scoreteamb;
    public void increment3b(View view)
    {
        scoreteamb=scoreteamb+3;
        displayForTeamB(scoreteamb);
    }
    public void increment2b(View view)
    {
        scoreteamb=scoreteamb+2;
        displayForTeamB(scoreteamb);
    } public void increment1b(View view)
    {
        scoreteamb=scoreteamb+1;
        displayForTeamB(scoreteamb);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
