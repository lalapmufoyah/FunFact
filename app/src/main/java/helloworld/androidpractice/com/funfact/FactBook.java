package helloworld.androidpractice.com.funfact;

import java.util.Random;

public class FactBook {
    //Fields or Member variable - Properties about thw object
    String[] facts = {"Ants stretch when they wake up",
            "Ostriches can run faster than horses",
            "Olympic gold medals are made of mainly silver",
            "The state of Florida is bigger than England",
            "On the moon you feel weightless",
            "The sun is a star"};

    //Methods - Actions the object can take
    public String getFact() {
        //Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);
        return facts[randomNumber];
    }
}
