package com.example;


import java.util.ArrayList;
import java.util.Random;

public class JokeEngine {

    public static String tellJoke(){
        ArrayList<String> jokes = new ArrayList<>();
        Random randomInt = new Random();

        // jokes from http://onelinefun.com/
        jokes.add("Today a man knocked on my door and asked for a small donation towards the local swimming pool. I gave him a glass of water.");
        jokes.add("Hospitality: making your guests feel like they\'re at home, even if you wish they were.");
        jokes.add("A recent study has found that women who carry a little extra weight live longer than the men who mention it.");
        jokes.add("I find it ironic that the colors red, white, and blue stand for freedom until they are flashing behind you.");
        jokes.add("Team work is important; it helps to put the blame on someone else.");
        jokes.add("My wife and I were happy for twenty years. Then we met.");
        jokes.add("If i had a dollar for every girl that found me unattractive, they would eventually find me attractive.");
        jokes.add("I used to think I was indecisive, but now I\'m not too sure.");
        jokes.add("Relationships are a lot like algebra. Have you ever looked at your X and wondered Y?");
        jokes.add("Life is all about perspective. The sinking of the Titanic was a miracle to the lobsters in the ship\'s kitchen.");

        //returns random selection from array list. nextInt(int i) includes zero but does not include the upper limit number
        //so using size() wis perfect and avoids off by 1 error
        return jokes.get(randomInt.nextInt(jokes.size()));
    }
}
