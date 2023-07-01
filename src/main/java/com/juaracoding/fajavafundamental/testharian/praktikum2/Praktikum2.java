package com.juaracoding.fajavafundamental.testharian.praktikum2;
/*
Created by IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author F_Ardhi a.k.a. Fadillah Ardhi
Java Developer
Created on 7/1/2023 8:47 PM
@Last Modified 7/1/2023 8:47 PM
Version 1.0
*/

import java.util.Scanner;

public class Praktikum2 {
    public static void main(String[] args) {

//        input angka sepuasnya
//        untuk stop cukup input selain angka
//        input1 = 13, 8, 7, 131, X
//        rata-rata1 = 39.75
//        input2 = 15, 2, 4, 190, Y
//        rata-rata2 = 52.75
//        input2 = 12, 6, 8, 90, 161
//        rata-rata = 55.5

        Scanner scanner = new Scanner(System.in);
        double doInput = 0;    //untuk menampung input dari user
        double dotTampung = 0; //untuk menampung hasil jumplah input yang dimasukkan
        double doCounter = 0;  //untuk menampung banyaknya proses input yang telah dimasukkan
        double doHasil = 0;    //untuk hasil rata-rata

        //step2
        try{
            //step1
            while(true)
            {
                //step3
                System.out.print("Masukkan angka : ");
                doInput = scanner.nextDouble();

                //step4
                dotTampung = dotTampung+doInput;    //penghitung jumlah nilai dari input
                doCounter++;                        //penghitung jumlah proses inputan
            }
        }catch (Exception e)    //handling exception untuk input selain angka dari soal
        {
            //step5
            doHasil = dotTampung/doCounter;         //rata-rata

            //step akhir
            System.out.println("Nilai hasil rata-rata = "+doHasil);
        }

    }
}

