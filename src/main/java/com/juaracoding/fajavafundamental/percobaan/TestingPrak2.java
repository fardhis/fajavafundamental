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

        Scanner scanner = new Scanner(System.in);
        double dbTampung = 0;
        double dbCounter = 0;
        double dbHasil = 0;

        double dbConvert = 0;

        try{
            while(true)
            {

                System.out.print("Masukkan angka : ");
                double dbInput = scanner.nextDouble();
                dbTampung = dbTampung+dbInput;
                dbCounter = dbCounter+1;
            }
        }catch (Exception e)
        {

            dbHasil = dbTampung/dbCounter;

            System.out.println("Nilai Int Tampung "+dbTampung);
            System.out.println("Nilai Int Counter "+dbCounter);
            System.out.println("Nilai Int Counter "+dbHasil);
        }













    }
}

