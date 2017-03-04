package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;

import com.example.JokeEngine;
import com.example.brian.displayjoke.JokeActivity;


public class EndpointAsyncTask extends AsyncTask<Void, Void, String> {
    Context context;

    public EndpointAsyncTask(Context context){
        this.context = context; //context from MainActivity
    }

    @Override
    protected String doInBackground(Void... params) {
        return JokeEngine.tellJoke();
    }

    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);

        //setAndDisplayJoke(result);

        Intent intent = new Intent(context, JokeActivity.class);
        intent.putExtra(context.getString(R.string.joke_tag), JokeEngine.tellJoke());
        context.startActivity(intent);
    }


}