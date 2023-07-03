package com.juaracoding.fajavafundamental.percobaan;
/*
Created by IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author F_Ardhi a.k.a. Fadillah Ardhi
Java Developer
Created on 6/28/2023 6:15 PM
@Last Modified 6/28/2023 6:15 PM
Version 1.0
*/

import java.util.Scanner;

public class TestingPrak2 {
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
        int doCounter = 0;  //untuk menampung banyaknya input yang telah dimasukkan
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
                dotTampung = dotTampung+doInput;        //penghitung jumlah nilai dari input
//                doCounter++;                            //penghitung jumlah proses inputan
                doCounter = doCounter++;
            }
        }catch (Exception e)
        {
            //step5
            doHasil = dotTampung/doCounter;             //rata-rata

            System.out.println("Nilai Int Tampung "+dotTampung);
            System.out.println("Nilai Int Counter "+doCounter);

            //step akhir
            System.out.println("Nilai hasil rata-rata = "+doHasil);
        }



    }
}

