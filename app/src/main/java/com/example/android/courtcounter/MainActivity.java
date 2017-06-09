package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void noteThreePointer(View view) {

        displayForTeamA(3);

    }

    public void noteBasket(View view) {

        displayForTeamA(2);

    }

    public void noteFreeThrow(View view) {

        displayForTeamA(1);

    }

    private void displayForTeamA(int score) {

        TextView scoreTeamA = (TextView) findViewById(R.id.team_A_score);
        scoreTeamA.setText(String.valueOf(score));

    }
}
