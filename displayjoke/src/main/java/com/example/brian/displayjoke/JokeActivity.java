package com.example.brian.displayjoke;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static String JOKE_TAG = "JOKE_TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joke_activity_main);

        TextView displayJokeTV = (TextView) findViewById(R.id.display_joke_tv);

        Intent receiveIntent = getIntent();
        if(receiveIntent != null){
            String joke = receiveIntent.getStringExtra(JOKE_TAG);
            displayJokeTV.setText(joke);
        } else {
            displayJokeTV.setText(getString(R.string.joke_error));
        }
    }
}
