package com.juaracoding.fajavafundamental.cobacoba;
/*
Created by IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author F_Ardhi a.k.a. Fadillah Ardhi
Java Developer
Created on 6/30/2023 8:58 PM
@Last Modified 6/30/2023 8:58 PM
Version 1.0
*/

import java.util.Random;

public class FungsiRandom {
    public static void main(String[] args) {

        Random random = new Random();
        String strProvider [] = {"gmail","yahoo","rocketmail","banyak"};
        String strDomain [] = {".id",".co.id",".com"};

        int intProviderData = 0;
        int intDomainData = 0;
        String strNamaProvider = "";
        String strNamaDomain = "";

        String strData = "";
        int intRandomLengthBegin = 10;
        int intRandomLengthEnd = 16;
        int intRandomKapitalAwal = 65;
        int intRandomKapitalAkhir = 91;
        int intRandomCharAwal = 97;
        int intRandomCharAkhir = 123;
        char chHurufBesar = 'a';
        char chHurufKecil = 'a';
        String strTampung = "";
        int intRandomLengthz = random.nextInt(intRandomLengthBegin,intRandomLengthEnd);
        for(int j=0;j<10;j++)
        {
            strTampung = "";
            intRandomLengthz = random.nextInt(intRandomLengthBegin,intRandomLengthEnd);
            for(int i=0;i<intRandomLengthz;i++)
            {
                if(i==0)
                {
                    chHurufBesar = (char) random.nextInt(intRandomKapitalAwal,intRandomKapitalAkhir);
                    strTampung = strTampung + chHurufBesar;
                }
                else
                {
                    chHurufKecil = (char) random.nextInt(intRandomCharAwal,intRandomCharAkhir);
                    strTampung = strTampung + chHurufKecil;
                }
            }
            intProviderData = random.nextInt(0,4);
            intDomainData = random.nextInt(0,3);
            strNamaProvider = strProvider[intProviderData];
            strNamaDomain = strDomain[intDomainData];
            System.out.println("String Format adalah "+strTampung+"@"+strNamaProvider+strNamaDomain);
        }
    }
}

