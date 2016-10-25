package com.example.owen.indecisiondecider;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.indecisiondecider.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, Randomizer.class);
        EditText editText1 = (EditText) findViewById(R.id.edit_message1);
        EditText editText2 = (EditText) findViewById(R.id.edit_message2);
        String message;

        Random RandomGen = new Random();
        //Random Number Between 0 and 1
        int RandomNumber = RandomGen.nextInt(2);
        if(RandomNumber == 0)
        {
            message = editText1.getText().toString();
        }
        else
        {
            message = editText2.getText().toString();
        }

        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

}
