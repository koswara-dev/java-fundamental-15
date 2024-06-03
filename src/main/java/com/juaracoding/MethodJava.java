package com.juaracoding;

public class MethodJava {

    public static void main(String[] args) {

        display();

        display();

        drawKotak(5);
        drawKotak(10);

        System.out.println(luasKotak(5));
        System.out.println(luasKotak(10));
        // if luasTanahA > 25 maka pajaknya 2000 else 1000

        double luasTanahA = luasKotak(12.5);
        double luasTanahB = luasKotak(4.5);

        hitungPajakTanah(luasTanahA);
        hitungPajakTanah(luasTanahB);

        System.out.println(userInfo("AWS Indonesia", "Jakarta"));

        System.out.println(isActive(true));

        // buatkan fungsi isLogin return boolean, if true redirect ke Dashboard else Invalid login
        String inputUsername = "admin", inputPassword = "password";
        if(isLogin(inputUsername, inputPassword)){
            System.out.println("Redirect ke Dashboard");
        } else {
            System.out.println("Invalid Login");
        }

        // method String contains
        System.out.println(inputPassword.contains("wors"));
    }

    public static void display(){
        System.out.println("JuaraCoding");
    }

    public static void displayDetail(String category, String product){
        System.out.println("Kategori: "+category);
        System.out.println("Produk: "+product);
    }

    public static void drawKotak(int sisi){
        for (int i = 0; i < sisi; i++) { // 10 < 10 false
            for (int j = 0; j < sisi; j++) { // 10 < 10 false
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static double luasKotak(double sisi){
        return sisi * sisi;
    }

    public static void hitungPajakTanah(double luasTanah){
        System.out.println("Luas tanah: "+luasTanah);
        if(luasTanah > 25){
            System.out.println("Pajak tanah harus dibayar: 2000");
        } else {
            System.out.println("Pajak tanah harus dibayar: 1000");
        }
    }

    public static String userInfo(String name, String address){
        return "Name: "+name+", Address: "+address;
    }

    public static boolean isActive(boolean value){
        return value;
    }

    public static boolean isLogin(String username, String password){
        if(username.equals("admin") && password.equals("password")){
            return true;
        } else {
            return false;
        }
    }

    public static String cariKataTerpanjang(String[] kata){
        String kataTerpanjang = kata[0];
        for (int i = 0; i < kata.length; i++) {
            if (kataTerpanjang.length() < kata[i].length()){ // 6 < 5
                kataTerpanjang = kata[i];
            }
        }

        return  "Kata terpanjang adalah "+kataTerpanjang;
    }

}
