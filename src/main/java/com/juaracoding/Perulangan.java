package com.juaracoding;

import java.util.Scanner;

public class Perulangan {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) { // 10 < 10 false
            System.out.println("Lap ke-"+i);
        }

        // 9 - 1
        for (int i = 9; i > 0; i--) { // 9 < 0 false
            System.out.println(i);
        }

        // buatkan deret bil ganjil
        for (int i = 1; i < 20; i++) {
            // tanpa if
            System.out.print(i);
            i++;
        }
        System.out.println();
        // 1*3*5*9
        for (int i = 1; i < 10; i++) {
            if(i % 2 != 0){ // 1 != 0
                System.out.print(i);
            } else {
                System.out.print("*");
            }
        }
        System.out.println();
        // *****
        // *****
        // *****
        // *****
        // *****
        int sisi = 5;
        for (int i = 0; i < sisi; i++) { // 10 < 10 false
            for (int j = 0; j < sisi; j++) { // 10 < 10 false
                System.out.print("*");
            }
            System.out.println();
        }
        // *
        // **
        // ***
        // ****
        // *****
        for (int i = 0; i < sisi; i++) { // baris pertama
            for (int j = 0; j <= i; j++) { // 0-4 <= 4
                System.out.print("*");
            }
            System.out.println();
        }
        // *****
        // ****
        // ***
        // **
        // *
        for (int i = sisi; i > 0; i--) { // baris pertama 5-1 > 0
            for (int j = i; j > 0; j--) { // 5-1 > 0
                System.out.print("*");
            }
            System.out.println();
        }

        // break continue
        // 12345(break if i == 6)
        // 12345(continue if i == 6)78910
        for (int i = 1; i <= 10; i++) {
            if(i == 6){
                break;
            }
            System.out.print(i);
        }

        // limit login for 1-3, if login berhasil break
        System.out.println();

        int x = 1;
        while (x < 1) { // 1 < 5
            System.out.print(x);
            x++;
        }
        System.out.println();
        int y = 1;
        do {
            System.out.print(y);
            y++;
        } while (y < 1);

        System.out.println();
        int a = 0;
        while (a < 10){
            // if a == 6 break
            a++; // 6
            if(a == 6) break;
            System.out.print(a);
        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Input angka: ");
//        int angka = scanner.nextInt();
//        System.out.println(angka);

        while (true){
            System.out.print("Input angka: ");
            int angka = scanner.nextInt();
            if(angka == 0) break;
        }

        while (true){
            System.out.println("Username: ");
            String username = scanner.next();
            System.out.println("Password: ");
            String password = scanner.next();
            boolean isLogin = username.equals("admin") && password.equals("password");
            String result = isLogin ? "Login Berhasil" : "Invalid Login";
            System.out.println(result);
            if(isLogin) break;
        }

        if(true){
            System.out.printf("Redirect ke Dashboard Page");
        } else {
            System.out.printf("Akun Anda diblokir sementara, silakan hubungi CS");
        }

    }

}
