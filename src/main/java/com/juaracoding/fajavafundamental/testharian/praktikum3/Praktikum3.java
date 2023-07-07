package com.juaracoding.fajavafundamental.testharian.praktikum3;
/*
Created by IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author F_Ardhi a.k.a. Fadillah Ardhi
Java Developer
Created on 7/7/2023 9:04 AM
@Last Modified 7/7/2023 9:04 AM
Version 1.0
*/




import java.util.ArrayList;
import java.util.Scanner;

public class Praktikum3 {
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
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        //Step handling exception
        try {
            //Step input data
            while (true) {
                System.out.print("Masukkan angka : ");
                arrList.add(scanner.nextInt());             //scanner input data dalam bentuk integer
            }
        } catch (Exception e) {                             //handling exception untuk input selain angka dari soal
            System.out.println("input selesai");
        }

        System.out.println("User melakukan input data sebanyak "+arrList.size()+" kali");   //memunculkan panjang arrList
        System.out.print("Dengan data input ");
        rangkaianHasil(arrList);                                 //memanggil method Rangkaian
        System.out.println("Rata-rata:  "+ rataRata(arrList));   //memanggil method RataRata

    }

    //Method rata-rata
    public static Double rataRata(ArrayList arrayInput){
        int intTampung = 0;         //penampung penjumlahan
        double doHasil = 0;         //penampung hasil rata-rata
        double doConvertCounter = 0; //penampung nilai convert jumlah inputan

        for(int i=0 ; i<arrayInput.size() ; i++)            //penjumlahan data yang diinput
        {
            int intPenjumlahan = (int) arrayInput.get(i);       //convert ke nilai baru
            intTampung = intTampung + intPenjumlahan;
        }
        doConvertCounter = (double) arrayInput.size();       //convert nilai integer ke double agar doHasil dalam bentuk desimal
        doHasil = intTampung/ doConvertCounter;              //rumus rata-rata
        return doHasil;
    }

    //Method penulisan hasil yang telah diinput
    public static void rangkaianHasil(ArrayList arrRangkaian){
        for(int i=0 ; i<arrRangkaian.size() ; i++)
        {
            if(i==arrRangkaian.size()-1)
            {
                System.out.println("dan "+arrRangkaian.get(arrRangkaian.size()-1));   //penambahan "dan" sebelum data terakhir
                continue;
            }
            System.out.print(arrRangkaian.get(i)+", ");      //penambahan "," di setiap data yang diinput
        }
        return ;
    }

}

