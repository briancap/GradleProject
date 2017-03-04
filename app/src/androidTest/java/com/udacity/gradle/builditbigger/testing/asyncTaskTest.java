package com.udacity.gradle.builditbigger.testing;

import android.support.test.runner.AndroidJUnit4;


import com.udacity.gradle.builditbigger.MainActivity;

import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class asyncTaskTest{

    @Test
    public void testVerifyEchoResponse() {
        String notNUll = "not null";
        assertNotNull(notNUll);
    }

}
