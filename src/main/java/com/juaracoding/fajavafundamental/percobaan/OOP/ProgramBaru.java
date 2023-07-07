package com.juaracoding.fajavafundamental.percobaan.OOP;
/*
Created by IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author F_Ardhi a.k.a. Fadillah Ardhi
Java Developer
Created on 7/5/2023 8:22 PM
@Last Modified 7/5/2023 8:22 PM
Version 1.0
*/

import com.sun.source.tree.NewArrayTree;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ProgramBaru {
    public static void main(String[] args) {
        Register register = new Register();
        register.setPassword("qwert");
        register.setUserId("Ardhi");
        register.setImage("file.jpg");

        System.out.println(register.getPassword());
        System.out.println(register.getUserId());
        System.out.println(register.getImage());
        System.out.println("===================================================");


        /*Contoh memasukkan array*/
//        int [] intArr = new int [10];
//        intArr[0] = 1;
//        intArr[1] = 2;

        Register [] registers = new Register[3];            //memasukkan array

        Register register1 = new Register();                // isi array indek ke 0
        register1.setUserId("Petrus");
        register1.setPassword("Petrus123");
        register1.setImage("Petrus.png");
        registers[0] = register1;                           //tampungan data array indek ke 0
//        System.out.println("objek reg1 ke 1 "+register1);

        register1 = new Register();                         //array indek ke 2
        register1.setUserId("Hakim");
        register1.setPassword("Hakim123");
        register1.setImage("Hakim.png");
        registers[1] = register1;                           //tampungan data array indek ke 1
//        System.out.println("objek reg1 ke 2 "+register1);

        /*ketika constructure 3 paramater dibuat, constructure null jg harus dibuat*/
        registers[2] = new Register("Abdi","Abdi123","Abdi.png");  //array indek ke 3 beda cara, menggunakkan construture 3 parameter


        for (int i=0 ; i<registers.length ;i++ )
        {
            System.out.println("UserId ke "+i+" adalah "+registers[i].getUserId());
            System.out.println("Password ke "+i+" adalah "+registers[i].getPassword());
            System.out.println("Image ke "+i+" adalah"+registers[i].getImage());

        };

        System.out.println("===================================================");

        /*contoh array list*/
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        System.out.println(cars.get(0));


        /*array list menggunakan constructure Objek Registrasi*/
        ArrayList<Register> arrL1 = new ArrayList<Register>();
        arrL1.add(new Register("Akbar","akbar123","akbar.png"));
        arrL1.add(new Register("Bayu","Bayu123","Bayu.png"));
        System.out.println(arrL1.get(0));

        System.out.println(arrL1.size());


        for (int i=0 ; i<arrL1.size() ; i++)
        {
            System.out.println("UserID ke "+i+" adalah "+arrL1.get(i).getUserId());
            System.out.println("Password ke "+i+" adalah "+arrL1.get(i).getPassword());
            System.out.println("Image ke "+i+" adalah "+arrL1.get(i).getImage());
        }


    }

}

