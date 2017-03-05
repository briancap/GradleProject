package com.udacity.gradle.builditbigger.testing;

import android.test.AndroidTestCase;
import android.util.Log;

import com.udacity.gradle.builditbigger.EndpointAsyncTask;

public class asyncTaskTest extends AndroidTestCase{ //alternative for AndroidTestCase? need this for getContext call
    private String LOG_TAG = getClass().getSimpleName();

    public void testVerifyEchoResponse() {
        String hopefullyNotNull = null;
        EndpointAsyncTask endpointAsyncTask = new EndpointAsyncTask(getContext());
        endpointAsyncTask.execute();

        try {
            hopefullyNotNull = endpointAsyncTask.get();
        } catch (Exception e) {
            Log.e(LOG_TAG, e.toString());
        }

        assertNotNull(hopefullyNotNull);
    }

}
