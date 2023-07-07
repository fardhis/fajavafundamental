package com.juaracoding.fajavafundamental.percobaan;
/*
Created by IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author F_Ardhi a.k.a. Fadillah Ardhi
Java Developer
Created on 7/3/2023 6:41 PM
@Last Modified 7/3/2023 6:41 PM
Version 1.0
*/

import java.util.Scanner;

public class LahanCoba3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String strInput = "a";
        int intInput = 0;
        char charInput = 'a';



//        strInput = scanner.nextLine();
//        charInput = strInput.charAt(0);
//        intInput = charInput;


        Character charAt = scanner.next().charAt(0);
        intInput = charAt;


//        int intInput = 'z';
        if (intInput>=65 && intInput<=90)
        {
            System.out.println("Ini huruf kapital");
        } else
        {
            if (intInput>=97 && intInput<=122)
            {
                System.out.println("Ini huruf kecil");
            } else {System.out.println("Ini bukan huruf");}
        }


    }

}

