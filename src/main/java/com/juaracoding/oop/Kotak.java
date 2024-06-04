package com.juaracoding.oop;

public class Kotak {

    private int sisi; // = 10

    Kotak(int sisi){
        this.sisi = sisi;
    }

    void draw(){
        for (int i = 0; i < sisi; i++) { // 10 < 10 false
            for (int j = 0; j < sisi; j++) { // 10 < 10 false
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
