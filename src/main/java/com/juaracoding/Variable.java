package com.juaracoding;

public class Variable {

    public static void main(String[] args) {

        // cara 1
        // int id = 1;

        // cara 2
        int id;
        id = 1;

        byte sizeCart = 100;

        float nilai = 88.90f;

        double transfer = 1000.504;
        System.out.println(transfer);
        System.out.println(transfer);
        System.out.printf("%.2f %.2f\n",transfer,nilai);
        System.out.printf("%.2f %.2f\n",transfer,nilai);

        char predikat = 'A';
        System.out.println(predikat);

        String path = "\"C:\\Users\\Lenovo\\Pictures\\Graident Ai Robot.jpg\"";
        System.out.println(path);

        // tipe data primitive dan non primitive (tipe data object)

        boolean isLogin = true;
        System.out.println(isLogin);

        long nik = 1111222233334444l;
        System.out.println(nik);

        // buatkan informasi profile user dan tampilkan ke console
        boolean isActive = false;

        // automatic casting / implicit
        short data1 = 457;
        double doubleData = data1;
        System.out.println(doubleData);

        char data2 = 'w';
        long dataLong = data2;
        System.out.println(dataLong);

        // manual casting / explicit
        long data3 = 9223372036854775000l;
        int dataInt = (int) data3;
        System.out.println(dataInt);

    }

}
