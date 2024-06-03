package com.juaracoding;

import java.util.Scanner;

public class ArrayJava {

    public static void main(String[] args) {

        int[] angka = {1,2,3,4,5};
        System.out.println(angka[2]); // panggil index ke-2

        int[] grades = new int[4];
        grades[0] = 85;
        grades[1] = 86;
        grades[2] = 87;
        grades[3] = 88;
        grades[0] = 89;
        System.out.println(grades[0]);

        System.out.println(angka.length);

        boolean isLogin = false;
        isLogin = true;
        System.out.println(isLogin);

        for (int i = 0; i < angka.length; i++) {
            System.out.println(angka[i]);
        }

        //foreach
        for (int grade : grades){
            System.out.println(grade);
        }

        String[] cars = {"Volvo", "BMW", "Toyota", "Ford", "Mazda"};
        for (String car : cars) {
            System.out.println(car);
        }

        int[][] angkaKu = {{1,2,3,4},{5,6,7}};
        System.out.println(angkaKu[1][2]);
        System.out.println(angkaKu[0][3]);

        for (int i = 0; i < angkaKu.length; i++) { // 2 baris
            for (int j = 0; j < angkaKu[i].length; j++) { // 3 < 3
                System.out.println(angkaKu[i][j]); //[0][0] [0][1] [0][2] [0][3]
            }
        }

        // System.out.println(angkaKu[2][1]); // element 3 out of bounds for length 3

        Scanner scanner = new Scanner(System.in);
        int totalData = 2;
        double sum = 0;
        double[] prices = new double[totalData];

        for (int i = 0; i < totalData; i++) {
            // variable = scanner
            System.out.print("Masukan Harga: ");
            prices[i] = scanner.nextDouble();
        }

        for (int i = 0; i < totalData; i++) {
            System.out.println(prices[i]);
        }

        // a = a + b // a += b

        // mencari data array
        // input == dataArray[i], tambah keyword break jika data ketemu
        System.out.print("Cari data mobil: ");
        String search = scanner.next();
        boolean isFound = false;
        for (int i = 0; i < cars.length; i++) {
            if(search == cars[i]){ // Ford == Ford
                isFound = true;
                break;
            }
        }

        if(isFound){
            System.out.println("Data ditemukan");
        } else {
            System.out.println("Data tidak ditemukan");
        }

        // mencari kata terpanjang
        String kataTerpanjang = cars[0];
        for (int i = 0; i < cars.length; i++) {
            if (kataTerpanjang.length() < cars[i].length()){ // 6 < 5
                kataTerpanjang = cars[i];
            }
        }

        System.out.println("Kata terpanjang adalah "+kataTerpanjang);


    }

}
