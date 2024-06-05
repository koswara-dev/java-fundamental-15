package com.juaracoding.oop;

public class Segitiga extends BidangDatar {

    private int sisi;

    public Segitiga(int sisi){
        this.sisi = sisi;
    }

    @Override
    public void draw() {
        for (int i = 0; i < sisi; i++) { // baris pertama
            for (int j = 0; j <= i; j++) { // 0-4 <= 4
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Override
    public void luas() {
        double luas = 1/2*sisi*sisi;
        System.out.println("Luas = "+luas);
    }
}
