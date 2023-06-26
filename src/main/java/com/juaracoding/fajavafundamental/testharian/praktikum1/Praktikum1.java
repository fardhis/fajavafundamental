package com.juaracoding.fajavafundamental.testharian.praktikum1;
/*
Created by IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author F_Ardhi a.k.a. Fadillah Ardhi
Java Developer
Created on 6/25/2023 8:19 PM
@Last Modified 6/25/2023 8:19 PM
Version 1.0
*/

import java.util.Scanner;

public class Praktikum1 {
    public static void main(String[] args) {
//        (input) Input Kata : Jquery 1995@v1.0
//        (output) Hasil : 529
//        (input) Input Kata :Bebas Lepas@
//        (output) Hasil : 238
//        Pertanyaan untuk input Kata Tid4k $@ma adalah?

                Scanner scanner = new Scanner(System.in);
        String strInput = ""; //VARIABEL PENAMPUNG INPUT USER
        int intOutput = 0; // PENAMBAHAN UNTUK HASIL AKHIR
        char chInput = 'a'; // UNTUK MENAMPUNG KARAKTER HASIL LOOP
        int intConvert = 0; //VARIABEL UNTUK CONVERT CHAR KE KODE ASCII

        //      NILAI ASCI HURUF KAPITAL 65-90
        //      NILAI ASCI HURUF KECIL 97-122
        //      NILAI ASCI ANGKA 48-57
        //      NILAI ASCI SIMBOL1 32-47
        //      NILAI ASCI SIMBOL2 58-64

        //STEP1
        System.out.println("Masukkan Kata: ");
        strInput = scanner.nextLine();

        //STEP
        for (int n=0;n<strInput.length();n++)
        {
            //STEP3
            chInput = strInput.charAt(n);
            //STEP4
            intConvert = chInput;

            //STEP5
            if (
                    (intConvert>=32 && intConvert<=47 ) ||
                            (intConvert>=58 && intConvert<=64)||
                            (intConvert>=48 && intConvert<=57)||
                            (intConvert>=65 && intConvert<=90) //RANGE ASCI HURUF KECIL RIDAK DIPAKAI
            )
            {
                //STEP6
                intOutput = intOutput + intConvert;
            }
        }
        //STEP AKHIR
        System.out.println("Output dari input "+strInput+" adalah "+intOutput);

    }
}

