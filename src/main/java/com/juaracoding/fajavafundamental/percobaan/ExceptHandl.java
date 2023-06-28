package com.juaracoding.fajavafundamental.percobaan;
/*
Created by IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author F_Ardhi a.k.a. Fadillah Ardhi
Java Developer
Created on 6/26/2023 8:49 PM
@Last Modified 6/26/2023 8:49 PM
Version 1.0
*/

public class ExceptHandl {
    public static void main(String[] args) {



        /*array exception*/
//try {
//    int[] intArr = {1, 2, 3};
//    System.out.println("Indeks ke 3 adalah " + intArr[3]);
//    }catch (ArrayIndexOutOfBoundsException exception)
//        {
//         System.out.println("Data tidak valid");
//        }


        /*aritmath exception*/
        try {
            int intX = 1/2;
            System.out.println("Nilai X adalah " + intX);
        }catch (ArithmeticException exception)
        {
            System.out.println("Data tidak valid");
        }finally
        {
        System.out.println("Selesai");
        }








        /*throws*/
//        public String isGood(String abc)throws Exception
//        {
//            return "";
//        }
//
//        public void huValid(){
//            try {
//                isGood("ABC");
//            } catch (Exception e) {
//                throw new RuntimeException(e);
//            }
//        }


    }
}

