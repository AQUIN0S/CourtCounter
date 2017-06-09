package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA = 0;
    private int scoreTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Scoring methods for Team A
     */
    public void threePointerTeamA(View view) {

        this.scoreTeamA += 3;
        displayForTeamA(this.scoreTeamA);

    }

    public void basketTeamA(View view) {

        this.scoreTeamA += 2;
        displayForTeamA(this.scoreTeamA);

    }

    public void freeThrowTeamA(View view) {

        this.scoreTeamA += 1;
        displayForTeamA(this.scoreTeamA);

    }

    private void displayForTeamA(int score) {

        TextView scoreTeamA = (TextView) findViewById(R.id.team_A_score);
        scoreTeamA.setText(String.valueOf(score));

    }


    /**
     * Scoring methods for Team B
     */
    public void threePointerTeamB(View view) {

        this.scoreTeamB += 3;
        displayForTeamB(this.scoreTeamB);

    }

    public void basketTeamB(View view) {

        this.scoreTeamB += 2;
        displayForTeamB(this.scoreTeamB);

    }

    public void freeThrowTeamB(View view) {

        this.scoreTeamB += 1;
        displayForTeamB(this.scoreTeamB);

    }

    private void displayForTeamB(int score) {

        TextView scoreTeamB = (TextView) findViewById(R.id.team_B_score);
        scoreTeamB.setText(String.valueOf(score));

    }

}
