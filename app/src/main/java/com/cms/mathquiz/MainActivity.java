package com.cms.mathquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    String message;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkQ1(View view)
    {
        RadioButton rb1 = findViewById(R.id.q1RB1);
        RadioButton rb2 = findViewById(R.id.q1RB2);
        RadioButton rb3 = findViewById(R.id.q1RB3);

        if(rb3.isChecked())              //radioButton3 is the correct answer
        {
            message = "Congratulations! 9.5 is the correct answer.";
            Toast toast = Toast.makeText(this, message, Toast.LENGTH_LONG);
            toast.setGravity(Gravity.TOP,0,10);
            toast.show();
        }
        else if (rb1.isChecked() || rb2.isChecked())           //radioButton1 or radioButton2 is checked
        {
            message = "Sorry, your answer is not correct.";
            Toast toast = Toast.makeText(this, message, Toast.LENGTH_LONG);
            toast.setGravity(Gravity.TOP,0,10);
            toast.show();
        }
        else                                                  //no radio button is checked
        {
            message = "Please choose one answer.";
            Toast toast = Toast.makeText(this, message, Toast.LENGTH_LONG);
            toast.setGravity(Gravity.TOP, 0, 10);
            toast.show();
        }
    }
}
