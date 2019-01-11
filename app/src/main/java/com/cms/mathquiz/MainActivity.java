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

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void submit_Click(View view)
    {
        int totalMark = 0;

        //Check question 1
        RadioButton q1RB3 = findViewById(R.id.q1RadioButton3);
        if(q1RB3.isChecked())
        {
            totalMark += 25;
        }

        //Check question 2
        EditText q2Result = findViewById(R.id.q2EditText);
        if(q2Result.getText().toString().equals("286"))
        {
            totalMark += 30;
        }

        //Check question 3
        CheckBox q3CB1 = findViewById(R.id.q3CheckBox1);
        CheckBox q3CB2 = findViewById(R.id.q3CheckBox2);
        CheckBox q3CB3 = findViewById(R.id.q3CheckBox3);
        CheckBox q3CB4 = findViewById(R.id.q3CheckBox4);
        CheckBox q3CB5 = findViewById(R.id.q3CheckBox5);
        if(!q3CB1.isChecked() && q3CB2.isChecked() && q3CB3.isChecked()&& !q3CB4.isChecked()&& !q3CB5.isChecked())
        {
            totalMark += 15;
        }

        //Check question 4
        EditText q4Result = findViewById(R.id.q4EditText);
        if(q4Result.getText().toString().equals("38"))
        {
            totalMark += 30;
        }

        String message = "You get " + totalMark + " marks out of 100.";
        Toast toast = Toast.makeText(this, message, Toast.LENGTH_LONG);
        toast.setGravity(Gravity.TOP,0,10);
        toast.show();
    }



}
