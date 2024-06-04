package com.juaracoding.object;

import com.juaracoding.oop.Fruit;

public class Utils {

    public static void main(String[] args) {

        // instance object
        Fruit apel = new Fruit();
        apel.gram = 100;
        apel.calsPerGram = 52;
        System.out.println(apel.totalCalories());

    }

}
