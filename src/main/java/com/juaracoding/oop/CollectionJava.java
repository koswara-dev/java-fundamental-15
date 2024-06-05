package com.juaracoding.oop;

import java.util.ArrayList;

public class CollectionJava {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        System.out.println("Jumlah data = "+cars.size());

    }

}
