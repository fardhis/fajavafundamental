package com.juaracoding.fajavafundamental.percobaan;
/*
Created by IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author F_Ardhi a.k.a. Fadillah Ardhi
Java Developer
Created on 7/7/2023 9:06 AM
@Last Modified 7/7/2023 9:06 AM
Version 1.0
*/

import java.util.ArrayList;
import java.util.Scanner;

public class TestingPrak3 {
    public static void main(String[] args) {


        //        input angka sepuasnya
//        untuk stop cukup input selain angka

//        Input1 = 13, 8, 7, 131, X
//        Output1:
//        User melakukan input data sebanyak 4 kali
//        Dengan data input 13,8,7 dan 131
//        Rata-rata : 39.75

//        Input2 = 15, 2, 4, 190, Y
//        Output2:
//        User melakukan input data sebanyak 4 kali
//        Dengan data input 15,2,4 dan 190
//        Rata-rata:  52.75

//        Input3 = 12, 6, 8, 90, 161
//        Output3:
//        User melakukan input data sebanyak 5 kali
//        Dengan data input 12,6,8,90 dan 161
//        Rata-rata:  55.4

        Scanner scanner = new Scanner(System.in);

        int intTampung = 0;     //untuk menampung jumlah input
        double doHasil = 0;     //untuk hasil hitungan rata-rata

        ArrayList<Integer> arrList = new ArrayList<Integer>();
        try //Step2
        {
            while (true) //Step1
            {
                //step3
                System.out.print("Masukkan angka : ");
                arrList.add(scanner.nextInt());         //input dalam bentuk arrayList
            }
        }
        catch (Exception e){}                           //handling exception untuk input selain angka dari soal

        System.out.println("User melakukan input data sebanyak "+arrList.size()+" kali");

        //step4
        for(int i=0 ; i<arrList.size() ; i++)
        {
            intTampung = intTampung+arrList.get(i);     //penhitung jumlah dari input

        }

        System.out.print("Dengan data input ");

        //step5
        for(int i=0 ; i<arrList.size() ; i++)           //penulisan dari data yang telah diinput
        {
            if(i==arrList.size()-1)
            {
                System.out.println("dan "+arrList.get(arrList.size()-1));   //penambahan "dan" sebelum data terakhir
                continue;
            }
            System.out.print(arrList.get(i)+", ");      //penambahan "," di setiap data yang diinput
        }


        double doCounter = (double) arrList.size();     //mengubah penghitung jumlah input ke tipe data double
        doHasil = intTampung/doCounter;                 //rata-rata

        System.out.println("Rata-rata " +doHasil);


    }
}

