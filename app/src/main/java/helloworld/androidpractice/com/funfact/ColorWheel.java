package helloworld.androidpractice.com.funfact;

import android.graphics.Color;

import java.util.Random;

public class ColorWheel {
    //Fields or Member variable - Properties about thw object
    String[] colors = {
            "#39add1",//light blue
            "#3079ab",//dark blue
            "#c25975",//mauve
            "#7d669e",//purple
            "#e0ab18",//mustard
            "#f092b0" //pink
    };

    //Methods - Actions the object can take
    int getColor() {
        //Randomly select a color
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(colors.length);
        int color = Color.parseColor(colors[randomNumber]);
        return color;
    }
}