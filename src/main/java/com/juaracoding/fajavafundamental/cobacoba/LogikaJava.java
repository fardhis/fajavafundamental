package com.juaracoding.fajavafundamental.cobacoba;
/*
Created by IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author F_Ardhi a.k.a. Fadillah Ardhi
Java Developer
Created on 6/25/2023 7:56 PM
@Last Modified 6/25/2023 7:56 PM
Version 1.0
*/

import java.util.Scanner;

public class LogikaJava {
    public static void main(String[] args) {

        //    int intNilai = 1;
//    switch (intNilai)
//       {
//           case 1:
//               System.out.println("Hari Pertama"); break;
//           case 2:
//               System.out.println("Hari Kedua"); break;
//           case 3:
//               System.out.println("Hari ketiga"); break;
//           default:
//               System.out.println("Hari Lain");

//        }
//
//        int intNilai = 75;
//
//            int intUcapan = intNilai>=75?1:2;
//        System.out.println(intUcapan);


//        int intNilai = 75;
//
//        String intUcapan = intNilai>=75?"lulus":"gak lulus";
//        System.out.println(intUcapan);

//        String strSambung = "8"+3;
//
//        System.out.println(strSambung);
//
//
//    }
//}

//import java.util.Scanner;
//
//        class Research {
//
//            public static void main(String[] args) {
//
//        int panjang = 0;
//
//        Scanner sn = new Scanner(System.in);
//
//        panjang = sn.nextInt();
//
//        System.out.println(panjang);

//        String strThird = "Welcome";
//
//        System.out.println(strThird.substring(6));


//                double str = 0.0;
//
//                int x = 10 & 12;
//
//                System.out.println(x);
//
//                boolean isOr = (5==5) || (4==3);
//
//                System.out.println(isOr);


        /*testing dengan input*/
        Scanner scanner = new Scanner(System.in);

        int intInput = 0;

        System.out.println("Masukkan angka: ");
        intInput = scanner.nextInt();

        if (intInput <= 10)
        {
            System.out.println("hasil input sedikit");
        }
        else
        {
            System.out.println("nilainya gede");
        }



    }
}

