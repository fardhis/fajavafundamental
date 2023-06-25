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

                Scanner scanner = new Scanner(System.in);
        String strInput = "";
        int intOutput = 0;
        char chInput = 'a';
        int intConvert = 0;

        System.out.println("Masukkan Kata: ");
        strInput = scanner.nextLine();

        for (int n=0;n<strInput.length();n++)
        {
            chInput = strInput.charAt(n);
            intConvert = chInput;

            if (
                    (intConvert>=32 && intConvert<=47 ) ||
                            (intConvert>=58 && intConvert<=64)||
                            (intConvert>=48 && intConvert<=57)||
                            (intConvert>=65 && intConvert<=90)
            )
            {
                intOutput = intOutput + intConvert;
            }
        }
        System.out.println("Output dari input "+strInput+" adalah "+intOutput);

    }
}

