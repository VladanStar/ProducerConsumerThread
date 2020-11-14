package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Proizvod proizvod = new Proizvod();
        Proizvodjac proizvodjac = new Proizvodjac(proizvod,1);
        Potrosac potrosac = new Potrosac(proizvod,1);
        potrosac.start();
        proizvodjac.start();


    }
}
