package com.company;

public class Proizvod {

    private int sadrzaj;
    private boolean dostupan = false;

    // metoda get poziva potrosac
    public synchronized int get(){
        if(!dostupan){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Uzima se vrednost " + sadrzaj);
        dostupan = false;
        notifyAll();
        return sadrzaj;
    }
    // metoda pozvana od strane proizvodjaca
    public synchronized void putVrednost(int vrednost){
        if(dostupan){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Postavlja se proizvedena vrednost" + vrednost);
        sadrzaj= vrednost;

    }

}
