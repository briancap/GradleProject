package com.example.Brian.myapplication.backend;

import com.example.JokeEngine;

/**
 * The object model for the data we are sending through endpoints
 */
public class MyBean {

    private String myData;

    private String joke;

    public String getData() {
        return myData;
    }

    public void setData(String data) {
        myData = data;
    }

    public String getJoke(){
        return joke;
    }

    public void setJoke(){
        joke = JokeEngine.tellJoke();
    }
}