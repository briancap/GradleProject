package com.udacity.gradle.builditbigger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    String joke = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {
        /*
        //pass jokes to Button + Toast message (STEP 1)
        Toast.makeText(this, JokeEngine.tellJoke(), Toast.LENGTH_LONG).show();
        */

        /*
        //pass joke to android library display (STEP 2)
        Intent intent = new Intent(this, JokeActivity.class);
        intent.putExtra(getString(R.string.joke_tag), joke);
        startActivity(intent);
        */

        //pass joke to android library thorugh AsyncTask on Google App Engine
        EndpointAsyncTask jokeTask = new EndpointAsyncTask(this);
        jokeTask.execute();
      }

}
