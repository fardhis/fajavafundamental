package com.juaracoding.fajavafundamental.cobacoba;
/*
Created by IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author F_Ardhi a.k.a. Fadillah Ardhi
Java Developer
Created on 6/24/2023 6:45 PM
@Last Modified 6/24/2023 6:45 PM
Version 1.0
*/

import java.util.Scanner;
public class LahanCoba {
    public static void main(String[] args) {

//        (Input)		Masukkan Kata : Hari Kemerdekaan 1945
//        (Output)	    Hasil	: 1353
//
//        (Input)		Masukkan Kata : Perang Dunia ke 1
//        (Output)	Hasil	: 1162

                //Pertanyaan Output untuk input Desa Sukamaju adalah ?
                Scanner scanner = new Scanner(System.in);
                String strInput = ""; // VARIABEL PENAMPUNG INPUTAN USER
                int intHasil = 0; // PENAMBAHAN UNTUK HASIL AKHIR
                char chInput = 'a'; // UNTUK MENAMPUNG KARAKTER HASIL LOOP
                int intConvert = 0;// VARIABEL UNTUK CONVERT DARI CHAR KE KODE ASCII

                //ANALISA ASCII HURUF KAPITAL -> 65 s.d 90
                // ANALISA ASCII HURUF KECIL -> 97 s.d 122
                // ANALISA ASCII ANGKA -> 48 s.d 57

                //step 1
                System.out.println("Masukkan Kata : ");
                strInput = scanner.nextLine();

                //step 2
                for(int i=0;i<strInput.length();i++)
                {
                    //step 3
                    chInput = strInput.charAt(i);
                    //step 4
                    intConvert = chInput;

                    //step 5
                    if(
//                    (intConvert>=48 && intConvert<=57) ||
//                    (intConvert>=65 && intConvert<=90) ||
                            (intConvert>=97 && intConvert<=122)
                    )
                    {
                        //step 6
                        intHasil = intHasil + intConvert;
                    }
                }
                //step akhir
                System.out.println("Output dari input "+strInput+" adalah "+intHasil);

            }
        }



