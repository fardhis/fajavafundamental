package com.juaracoding.fajavafundamental.cobacoba;
/*
Created by IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author F_Ardhi a.k.a. Fadillah Ardhi
Java Developer
Created on 7/3/2023 9:08 PM
@Last Modified 7/3/2023 9:08 PM
Version 1.0
*/


import java.util.Scanner;

public class ProgramUpperLowerCase {
    public static void main(String[] args) {


        int intInput = 'z';
        if (intInput>=65 && intInput<=90)
        {
            System.out.println("Ini huruf kapital");
        } else
        {
            if (intInput>=97 && intInput<=122){
                System.out.println("Ini huruf kecil");
            } else {System.out.println("Ini bukan huruf");}
        }


    }
}

