package com.cms.mathquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    String message;
    Toast toast;

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
        }
        else if (rb1.isChecked() || rb2.isChecked())           //radioButton1 or radioButton2 is checked
        {
            message = "Sorry, your answer is incorrect.";
        }
        else                                                  //no radio button is checked
        {
            message = "Please answer the question first.";
        }
        toast = Toast.makeText(this, message, Toast.LENGTH_LONG);
        toast.setGravity(Gravity.TOP,0,10);
        toast.show();
    }

    public void checkQ2(View view)
    {
        EditText q2Result = findViewById(R.id.q2EditText);
        if(q2Result.getText().toString().equals("286"))
        {
            message = "Congratulations! 286 is the correct answer.";
        }
        else if (q2Result.getText().toString().equals(""))
        {
            message = "Please answer the question first.";
        }
        else
        {
            message = "Sorry, your answer is incorrect.";
        }
        toast = Toast.makeText(this, message, Toast.LENGTH_LONG);
        toast.setGravity(Gravity.TOP,0,10);
        toast.show();
    }


    public void checkQ3(View view)
    {
        CheckBox q3CB1 = findViewById(R.id.q3CheckBox1);
        CheckBox q3CB2 = findViewById(R.id.q3CheckBox2);
        CheckBox q3CB3 = findViewById(R.id.q3CheckBox3);
        CheckBox q3CB4 = findViewById(R.id.q3CheckBox4);
        CheckBox q3CB5 = findViewById(R.id.q3CheckBox5);

        if(!q3CB1.isChecked() && q3CB2.isChecked() && q3CB3.isChecked()&& !q3CB4.isChecked()&& !q3CB5.isChecked())
        {
            message = "Congratulations! 59 and 499 are the only 2 prime numbers among them.";
        }
        else
        {
            message = "Sorry, your answer is incorrect.";
        }
        toast = Toast.makeText(this, message, Toast.LENGTH_LONG);
        toast.setGravity(Gravity.TOP,0,10);
        toast.show();
    }


}
