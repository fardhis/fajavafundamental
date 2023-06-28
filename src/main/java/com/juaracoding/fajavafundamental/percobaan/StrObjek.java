package com.juaracoding.fajavafundamental.percobaan;
/*
Created by IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author F_Ardhi a.k.a. Fadillah Ardhi
Java Developer
Created on 6/23/2023 4:37 PM
@Last Modified 6/23/2023 4:37 PM
Version 1.0
*/

import java.awt.*;
import java.util.Scanner;

public class StrObjek {
    public static void main(String[] args) {

//        String  stringName = "isiString";
//        System.out.println(stringName);

//        String strFirst = "satu";
//        String strSecond = "dua";
//        String strThird = strFirst + strSecond +"tiga";
//
//        System.out.println(strThird);
//        System.out.println(strFirst.concat(strSecond.concat(strFirst)).concat(strFirst));

//        String strNama = "Fadillah Ardhi Siagian";
//        System.out.println(strNama.length());


//        char huruf = strNama.charAt(3);
//        System.out.println(huruf);

//        String strNama1 = new String("Dono");
//        String strnama2 = new String("Dono");
//        System.out.println(strNama1==strnama2);


//        String strNama1 = "Dono";
//        String strnama2 = "dono";
//        System.out.println(strNama1.equalsIgnoreCase(strnama2));

//        String strNama = "Fadillah Ardhi Siagian";
//        System.out.println(strNama.substring(9));


//            int panjang;
//            int lebar;
//        Scanner sn = new Scanner(System.in);

//        System.out.println("Panjangnya : ");
//        panjang= sn.nextInt();

//        System.out.println("Lebarnya : ");
//        lebar= sn.nextInt();
//
//        int hasil= panjang*lebar;
//        System.out.println("hasil luas persegi panjang: "+ hasil);
//
//        System.out.println("Panjangnya : "+panjang);
//        System.out.println("Lebarnya : "+ lebar);

        String chPeryataan1;
        String chPeryataan2;
        Scanner scn = new Scanner(System.in);

        System.out.println("Pernyataan1 :");
        chPeryataan1= scn.next();


        System.out.println("Pernyataan2 :");
        chPeryataan2= scn.next();


        boolean banding = chPeryataan1. equals(chPeryataan2);
        System.out.println("hasil perbandingan dan: "+ banding);



    }
}










