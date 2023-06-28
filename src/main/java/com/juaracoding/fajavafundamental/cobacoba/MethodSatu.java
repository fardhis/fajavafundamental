package com.juaracoding.fajavafundamental.cobacoba;
/*
Created by IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author F_Ardhi a.k.a. Fadillah Ardhi
Java Developer
Created on 6/28/2023 8:57 PM
@Last Modified 6/28/2023 8:57 PM
Version 1.0
*/

public class MethodSatu {
    public static void main(String[] args) {
        System.out.println("Luas Persegi = "+LuasPersegi(2.0,5.0));
        System.out.println("luas Layang-layang = "+LayangLayang(2.0,5.0));

    }


    public static double LuasPersegi(double doSisi1, double doSisi2){

        double doluasPersegi = doSisi1*doSisi2;
        return doluasPersegi;

    }

    public  static double LayangLayang(double doDiag1, double doDiag2){
        double doLayangLayang = (doDiag1*doDiag2)/2;
        return doLayangLayang;
    }


}

