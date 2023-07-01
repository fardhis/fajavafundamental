package com.juaracoding.fajavafundamental.percobaan;
/*
Created by IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author F_Ardhi a.k.a. Fadillah Ardhi
Java Developer
Created on 7/1/2023 8:08 PM
@Last Modified 7/1/2023 8:08 PM
Version 1.0
*/

import java.util.Scanner;

public class LahanCoba2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        try
//        {
//            System.out.print("Masukkan angka : ");
//            int intInput = scanner.nextInt();
//        }catch (Exception e)
//        {
//            System.out.println("Error dapat di handle !!");
//        }

        int intTaampung = 0;
        int intCounter = 0;
        try{
            while(true)
            {

                System.out.print("Masukkan angka : ");
                int intInput = scanner.nextInt();
                intTaampung = intTaampung+intInput;
                intCounter = intCounter++;
            }
        }catch (Exception e)
        {
            System.out.println("Nilai counter = "+intCounter);
            System.out.println("Nilai Int Tampung "+intTaampung);
        }





    }
}

