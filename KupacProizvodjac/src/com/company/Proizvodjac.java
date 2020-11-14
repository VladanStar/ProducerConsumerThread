package com.company;

public class Proizvodjac extends Thread {
    private Proizvod proizvod;
    private int redniBroj; // u slucaju da postoji vise proizvodjaca

    public Proizvodjac() {
    }

    public Proizvodjac(Proizvod proizvod, int redniBroj) {
        this.proizvod = proizvod;
        this.redniBroj = redniBroj;
    }

    @Override
    public String toString() {
        return "Proizvodjac{" +
                "proizvod=" + proizvod +
                ", redniBroj=" + redniBroj +
                '}';
    }
    public void run(){
        for(int i =0; i< 10;i++){
            proizvod.putVrednost(i);
            try {
                sleep((int)Math.random()*100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
