package com.juaracoding.oop;

public class Car {

    private String bahanBakar;
    private int tahunPembuatan;

    Car(String bahanBakar, int tahunPembuatan){
        this.bahanBakar = bahanBakar;
        this.tahunPembuatan = tahunPembuatan;
    }

    void warna(){
        System.out.println("Berwarna merah");
    }

    void mesin(){
        System.out.println("Bermesin 1800cc");
    }

    int getTahunPembuatan() {
        return tahunPembuatan;
    }

    String getBahanBakar() {
        return bahanBakar;
    }

}
