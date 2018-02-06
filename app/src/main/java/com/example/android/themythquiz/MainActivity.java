package com.example.android.themythquiz;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        setContentView(R.layout.activity_main);


        Button btn1 = (Button) findViewById(R.id.five7_button);
        btn1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                five7(v);
            }
        });

        Button btn2 = (Button) findViewById(R.id.four9_button);
        btn2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                four9(v);
            }
        });

        Button btn3 = (Button) findViewById(R.id.five2_button);
        btn3.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                five2(v);
            }
        });

        RadioButton btn4 = (RadioButton) findViewById(R.id.radio1A);
        btn4.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                onRadioButtonClicked(v);
            }
        });

        CheckBox btn5 = (CheckBox) findViewById(R.id.checkbox1);
        btn5.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                checkboxChecked(v);
            }
        });

        CheckBox btn6 = (CheckBox) findViewById(R.id.checkbox2);
        btn6.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                checkboxChecked(v);
            }
        });

        CheckBox btn7 = (CheckBox) findViewById(R.id.checkbox3);
        btn7.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                checkboxChecked(v);
            }
        });

    }

    /**
     * QUESTION 1.
     */

    /**
     * This method is called when the 5 foot 7 answer is clicked.
     */

    public void five7(View view) {

        Toast.makeText(getBaseContext(), "Well done! Contrary to popular belief Napolean was actually taller than the average Frenchman of his time.", Toast.LENGTH_LONG).show();

        score = (score + 1);

        return;

    }

    /**
     * This method is called when the 4 foot 9 answer is clicked.
     */

    public void four9(View view) {

        Toast.makeText(getBaseContext(), "At 5'7\", Napoleon Bonaparte was actually taller than the average Frenchman of his time.", Toast.LENGTH_LONG).show();

        return;

    }

    /**
     * This method is called when the 4 foot 2 answer is clicked.
     */

    public void five2(View view) {

        Toast.makeText(getBaseContext(), "At 5'7\", Napoleon Bonaparte was actually  taller than the average Frenchman of his time.", Toast.LENGTH_LONG).show();

        return;

    }

    /**
     * QUESTION 2
     * This method is called when the checkboxes are clicked
     */

    public void checkboxChecked(View view) {

        // Is the button now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.checkbox1:
                if (checked)


                    Toast.makeText(getBaseContext(), "You're right! Bulls are actually colour blind to Red and are enraged by the matadors who they see as a threat.", Toast.LENGTH_LONG).show();

                score = (score + 1);

                break;


        }


        switch (view.getId()) {

            case R.id.checkbox2:
                if (checked)

                    Toast.makeText(getBaseContext(), "Sorry - this one is actually true and not a myth.", Toast.LENGTH_LONG).show();

                break;


        }
        switch (view.getId()) {

            case R.id.checkbox3:
                if (checked)

                    Toast.makeText(getBaseContext(), "Well done! Flies can actually live up to 30 days.", Toast.LENGTH_LONG).show();

                score = (score + 1);
                break;


        }

    }


    /**
     * QUESTION 3. This method is called when the radio buttons are selected
     */


    public void onRadioButtonClicked(View view) {

        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio1A:
                if (checked)

                    Toast.makeText(getBaseContext(), "Close! Seasons are actually caused by Earth's 23.4-degree axial tilt..", Toast.LENGTH_LONG).show();


                break;


        }

        switch (view.getId()) {

            case R.id.radio1B:
                if (checked)

                    Toast.makeText(getBaseContext(), "Well done! You are correct.", Toast.LENGTH_LONG).show();

                score = (score + 1);
                break;
        }

    }


    /**
     * This method marks question 4 and displays the updated score.
     */

    public void submitScore (View view) {
        EditText answerTextField = (EditText) findViewById(R.id.four_answer);
        String answer = answerTextField.getText().toString();

        if(answer.equals("No")) {

            Toast.makeText(getBaseContext(), "You're right! While about 70 percent of bat species, mainly in the microbat family, use echolocation to navigate, all bat species have eyes and are capable of sight.", Toast.LENGTH_LONG).show();

            score = score + 1;
        }

        if(answer.equals("Yes")) {

            Toast.makeText(getBaseContext(), "Afraid not! While about 70 percent of bat species, mainly in the microbat family, use echolocation to navigate, all bat species have eyes and are capable of sight.", Toast.LENGTH_LONG).show();

        }

        EditText nameTextField = (EditText) findViewById(R.id.name_text_field);
        //nameTextField.setText("");
        String name = nameTextField.getText().toString();

        String scoreMessage = createScoreSummary(score, name);

    }

    /**
     * This method creates the score feedback.
     */
    private String createScoreSummary(int score, String name) {

        String scoreMessage = name +" you've scored " + score +" out of 5!";
        displayMessage(scoreMessage);
        return scoreMessage;

    }


        /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView scoreSummaryTextView = (TextView) findViewById(R.id.score_summary_text_view);
        scoreSummaryTextView.setText(message);
    }



}
