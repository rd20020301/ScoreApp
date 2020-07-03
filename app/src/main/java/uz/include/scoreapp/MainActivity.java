package uz.include.scoreapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int aochko = 0;
    int bochko = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(aochko);
        displayForTeamB(bochko);
    }

    /**
     * A jamoa ning tuzilishi
     */
    public void displayForTeamA(int score) {
        TextView mScoreViewA = (TextView) findViewById(R.id.ScoreA);
        mScoreViewA.setText(String.valueOf(score));
    }

    /**
     * B jamoa ning  tuzulishi
     */
    public void displayForTeamB(int score) {
        TextView mScoreViewB = (TextView) findViewById(R.id.ScoreB);
        mScoreViewB.setText(String.valueOf(score));
    }

    /**
     * A jamoa 6 ball
     */
    public void oltiballTeamA(View v) {
        aochko += 6;
        displayForTeamA(aochko);
    }

    /**
     * B jamoa 6 ball
     */
    public void oltiballTeamB(View v) {
        bochko += 6;
        displayForTeamB(bochko);
    }

    /**
     * A jamoa 1 ball
     */
    public void birballTeamA(View v) {
        aochko += 1;
        displayForTeamA(aochko);
    }

    /**
     * B jamoa 1 ball
     */
    public void birballTeamB(View v) {
        bochko += 1;
        displayForTeamB(bochko);
    }

    /**
     * A jamoa 2 ball
     */
    public void ikkiballTeamA(View v) {
        aochko += 2;
        displayForTeamA(aochko);
    }

    /**
     * B jamoa 2 ball
     */
    public void ikkiballTeamB(View v) {
        bochko += 2;
        displayForTeamB(bochko);
    }

    /**
     * A jamoa 3 ball
     */
    public void uchballTeamA(View v) {
        aochko += 3;
        displayForTeamA(aochko);
    }

    /**
     * B jamoa 3 ball
     */
    public void uchballTeamB(View v) {
        bochko += 3;
        displayForTeamB(bochko);
    }

    /**
     * Reset tugmasi
     */
    public void resetScores(View view){
        aochko = 0;
        bochko = 0;
        displayForTeamA(aochko);
        displayForTeamB(bochko);
    }

    /**
     * Exit Close App
     */
    public void Exit(View v){
        finish();
        System.exit(0);
    }

}