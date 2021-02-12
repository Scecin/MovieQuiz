package com.example.android.moviequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.moviequiz.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswer(View view) {
        int scoreTotal = 0;

        //first question
        RadioButton dannyRadioButton = (RadioButton) findViewById(R.id.danny_sandy_radio_button);
        boolean hasDanny = dannyRadioButton.isChecked();

        if (hasDanny) {
            scoreTotal += 1;
        }

        //secondQuestion
        EditText nameOfDirectorEditText = (EditText) findViewById(R.id.name_edit_text);
        String editNameEditText = nameOfDirectorEditText.getText().toString();

        if (editNameEditText.equals(getString(R.string.name_director_tarantino))) {
            scoreTotal += 1;
        }

        // thirdQuestion
        CheckBox etCheckBox = (CheckBox) findViewById(R.id.et_check_box);
        boolean hasEt = etCheckBox.isChecked();

        CheckBox jawsCheckBox = (CheckBox) findViewById(R.id.jaws_check_box);
        boolean hasJaws = jawsCheckBox.isChecked();

        CheckBox readyPlayerOneCheckBox = (CheckBox) findViewById(R.id.ready_player_one_check_box);
        boolean hasReadyPlayerOne = readyPlayerOneCheckBox.isChecked();

        CheckBox avatarCheckBox = (CheckBox) findViewById(R.id.avatar_check_box);
        boolean hasAvatar = avatarCheckBox.isChecked();

        CheckBox theWolfOfWallStreetCheckBox = (CheckBox) findViewById(R.id.the_wolf_of_wall_street_check_box);
        boolean hasTheWolfOfWallStreet = theWolfOfWallStreetCheckBox.isChecked();

        CheckBox theLordOfTheRingCheckBox = (CheckBox) findViewById(R.id.the_lord_of_the_ring_check_box);
        boolean hasTheLordOfTheRing = theLordOfTheRingCheckBox.isChecked();

        int thirdQuestionScore = 0;

        if (hasEt) {
            thirdQuestionScore += 1;
        }
        if (hasJaws) {
            thirdQuestionScore += 1;
        }
        if (hasReadyPlayerOne) {
            thirdQuestionScore += 1;
        }
        if (hasAvatar) {
            thirdQuestionScore -= 1;
        }
        if (hasTheWolfOfWallStreet) {
            thirdQuestionScore -= 1;
        }
        if (hasTheLordOfTheRing) {
            thirdQuestionScore -= 1;
        }
        if (thirdQuestionScore == 3) {
            scoreTotal += 1;
        }

        //fourthQuestion
        EditText nameOfFilmQuestionFour = (EditText) findViewById(R.id.name_of_film_question_four);
        String editNameFilmQuestionFourEditText = nameOfFilmQuestionFour.getText().toString();

        if (editNameFilmQuestionFourEditText.equals(getString(R.string.name_movie_the_princess_bride))) {
            scoreTotal += 1;
        }

        //fifthQuestion
        RadioButton twoRadioButton = (RadioButton) findViewById(R.id.two_radio_button);
        boolean hasTwo = twoRadioButton.isChecked();

        if (hasTwo) {
            scoreTotal += 1;
        }

        //sixthQuestion
        RadioButton allThreeRadioButton = (RadioButton) findViewById(R.id.all_three_radio_button);
        boolean hasAllThree = allThreeRadioButton.isChecked();

        if (hasAllThree) {
            scoreTotal += 1;
        }

        //seventhQuestion
        CheckBox manhattanCheckBox = (CheckBox) findViewById(R.id.manhattan_check_box);
        boolean hasManhattan = manhattanCheckBox.isChecked();

        CheckBox vickyCristinaBarcelonaCheckBox = (CheckBox) findViewById(R.id.vicky_cristina_barcelona_check_box);
        boolean hasVickyCristinaBarcelona = vickyCristinaBarcelonaCheckBox.isChecked();

        CheckBox midnightInParisCheckBox = (CheckBox) findViewById(R.id.midnight_in_paris_check_box);
        boolean hasMidnightInParis = midnightInParisCheckBox.isChecked();

        CheckBox romaCheckBox = (CheckBox) findViewById(R.id.roma_check_box);
        boolean hasRoma = romaCheckBox.isChecked();

        CheckBox laLaLandCheckBox = (CheckBox) findViewById(R.id.la_la_lan_check_box);
        boolean hasLaLaLand = laLaLandCheckBox.isChecked();

        CheckBox parasiteCheckBox = (CheckBox) findViewById(R.id.parasite_check_box);
        boolean hasParasite = parasiteCheckBox.isChecked();

        int seventhQuestionScore = 0;

        if (hasManhattan) {
            seventhQuestionScore += 1;
        }
        if (hasVickyCristinaBarcelona) {
            seventhQuestionScore += 1;
        }
        if (hasMidnightInParis) {
            seventhQuestionScore += 1;
        }
        if (hasRoma) {
            seventhQuestionScore -= 1;
        }
        if (hasLaLaLand) {
            seventhQuestionScore -= 1;
        }
        if (hasParasite) {
            seventhQuestionScore -= 1;
        }
        if (seventhQuestionScore == 3) {
            scoreTotal += 1;
        }

        //eighthQuestion
        EditText nameOfFilmQuestionSeven = (EditText) findViewById(R.id.name_of_film_question_seven);
        String editNameFilmQuestionSevenEditText = nameOfFilmQuestionSeven.getText().toString();

        if (editNameFilmQuestionSevenEditText.equals(getString(R.string.name_movie_the_godfather))) {
            scoreTotal += 1;
        }

        if (scoreTotal == 8) {
            Toast.makeText(this, getString(R.string.perfect_answer), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, getString(R.string.toast_message), Toast.LENGTH_SHORT).show();
        }

        String scoreMessage = getString(R.string.solution) + " " + scoreTotal + '\n' + getString(R.string.well_done);
        displayMessage(scoreMessage);
    }

    //private String createScoreMessage() { return getString(R.string.well_done);}

    @SuppressLint("SetTextI18n")
    private void displayMessage(String numberOfCorrectAnswersMessage) {
        TextView solutionTextView = (TextView) findViewById(R.id.solution);
        solutionTextView.setText("" + numberOfCorrectAnswersMessage);
    }

}
