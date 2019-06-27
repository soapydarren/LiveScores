package com.example.livescores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Tracks score, fouls and corner kicks for Man Utd.
    int scoreManUtd = 0;
    int foulsManUtd = 0;
    int cornersManUtd = 0;

    // Tracks score, fouls and corner kicks for Man Utd.
    int scoreLiv = 0;
    int foulsLiv = 0;
    int cornersLiv = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when score is clicked for Man Utd.
     */

    public void addScoreForManUtd (View view) {
        scoreManUtd = scoreManUtd + 1;
        displayScoreManUtd(scoreManUtd);
    }

    /**
     * This method is called when fouls is clicked for Man Utd.
     */

    public void addFoulForManUtd (View view) {
        foulsManUtd = foulsManUtd + 1;
        displayFoulManUtd(foulsManUtd);
    }

    /**
     * This method is called when corner kicks is clicked for Man Utd.
     */

    public void addCornerForManUtd (View view) {
        cornersManUtd = cornersManUtd + 1;
        displayCornerManUtd(cornersManUtd);
    }

    /**
     * This method is called when score is clicked for Liverpool.
     */

    public void addScoreForLiv (View view) {
        scoreLiv = scoreLiv + 1;
        displayScoreLiv(scoreLiv);
    }

    /**
     * This method is called when fouls is clicked for Liverpool.
     */

    public void addFoulForLiv (View view) {
        foulsLiv = foulsLiv + 1;
        displayFoulsLiv(foulsLiv);
    }

    /**
     * This method is called when corner kicks is clicked for Man Utd.
     */

    public void addCornerForLiv (View view) {
        cornersLiv = cornersLiv + 1;
        displayCornersLiv(cornersLiv);
    }

    /**
     * Displays the given score for Man U.
     */
    public void displayScoreManUtd(int score) {
        TextView scoreView = (TextView) findViewById(R.id.man_u_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given fouls for Man U.
     */
    public void displayFoulManUtd(int foul) {
        TextView foulView = (TextView) findViewById(R.id.man_u_fouls);
        foulView.setText(String.valueOf(foul));
    }

    /**
     * Displays the given corner kicks for Man U.
     */
    public void displayCornerManUtd(int corner) {
        TextView cornerView = (TextView) findViewById(R.id.man_u_corners);
        cornerView.setText(String.valueOf(corner));
    }

    /**
     * Displays the given score for Liverpool.
     */
    public void displayScoreLiv(int score) {
        TextView scoreView = (TextView) findViewById(R.id.liv_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given fouls for Liverpool.
     */
    public void displayFoulsLiv(int foul) {
        TextView foulView = (TextView) findViewById(R.id.liv_fouls);
        foulView.setText(String.valueOf(foul));
    }

    /**
     * Displays the given corner kicks for Liverpool.
     */
    public void displayCornersLiv(int corner) {
        TextView cornerView = (TextView) findViewById(R.id.liv_corners);
        cornerView.setText(String.valueOf(corner));
    }

    /**
     * This method is called when reset button is clicked.
     */

    public void resetAll(View view) {
        int scoreManUtd = 0;
        int foulsManUtd = 0;
        int cornersManUtd = 0;
        int scoreLiv = 0;
        int foulsLiv = 0;
        int cornersLiv = 0;
        displayScoreManUtd(scoreManUtd);
        displayFoulManUtd(foulsManUtd);
        displayCornerManUtd(cornersManUtd);
        displayScoreLiv(scoreLiv);
        displayFoulsLiv(foulsLiv);
        displayCornersLiv(cornersLiv);
    }

}
