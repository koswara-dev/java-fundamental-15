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

        // Encapsulation
        Employee employee = new Employee();
        employee.setName("John");
        employee.setAge(28);
        employee.setAddress("Jakarta");
        employee.setSalary(7000);

        System.out.println(employee.getName());
        System.out.println(employee.getAge());
        System.out.println(employee.getAddress());
        System.out.println(employee.getSalary());

        User user = new User();
        user.setUsername("admin");
        user.setPassword("password");
        System.out.println(user);
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());

        User user2 = new User();
        user.setUsername("staf");
        user.setPassword("passstaf");
        System.out.println(user2);
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());

        String inputUsername = "admin";
        String inputPassword = "password";

        if(inputUsername.equals(user.getUsername()) && inputPassword.equals(user.getPassword())){
            System.out.println("Berhasil login");
        } else {
            System.out.println("Invalid login");
        }

        // Polymorphism (Method Overloading)
        Calculation.sum(10,10);
        Calculation.sum(10,10, 20);
        Calculation.sum(10.5,10.5);

        // Polymorphism (Method Overriding)
        BidangDatar bidangDatar = new BidangDatar();
        bidangDatar.draw();

        BidangDatar segitiga = new Segitiga(5);
        segitiga.draw();

        // Inheritance (Pewarisan)
        Manager manager = new Manager();
        manager.setName("John");
        System.out.println(manager.getName());
        manager.setDepartment("QA Engineer");
        System.out.println(manager.getDepartment());


    }

}
