package com.juaracoding.oop;

import java.util.Date;

public class MainAppOOP {

    public static void main(String[] args) {

        // instance object
        Fruit apel = new Fruit();
        apel.gram = 100;
        apel.calsPerGram = 52;
        System.out.println(apel.totalCalories());

        Fruit mangga = new Fruit();
        mangga.gram = 100;
        mangga.calsPerGram = 60;
        System.out.println(mangga.totalCalories());

        // clean code
        Kotak kotak = new Kotak(10);
        kotak.draw();

        Car car = new Car("Pertalite", 2010);
        car.warna();
        car.mesin();
        System.out.println(car.getBahanBakar());
        System.out.println(car.getTahunPembuatan());

        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getDay());


    }

}
