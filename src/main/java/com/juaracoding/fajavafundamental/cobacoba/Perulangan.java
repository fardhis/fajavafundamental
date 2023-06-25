package com.juaracoding.fajavafundamental.cobacoba;
/*
Created by IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author F_Ardhi a.k.a. Fadillah Ardhi
Java Developer
Created on 6/23/2023 7:53 PM
@Last Modified 6/23/2023 7:53 PM
Version 1.0
*/

public class Perulangan {
    public static void main(String[] args)
    {
//        String strNama= "Surakarta";
//        for(int i=0;i<strNama.length();i++)
//        {
//            if (i == 6) {
//                break;
//            }
//                System.out.println(i);
//
//            }
//
//
//
//
////            System.out.println(strNama.charAt(i));
////            System.out.println(i);
//
//        System.out.println("Selesai");



        int sum  =0;
        int item =0;
        while(item<5)
        {
            item++;
            sum += item;
            if(sum>=6)
//            {
//                System.out.println("Berhenti disini proses ke - "+item);
//                break;
//            }
            System.out.println("1 kali loop ke - "+item);
        }




    }
}

