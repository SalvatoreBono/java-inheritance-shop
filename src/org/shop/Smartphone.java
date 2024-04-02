package org.shop;

public class Smartphone extends Prodotto {
    private int IMEI;
    private int memoria;
    public Smartphone(String nome, double prezzo, double iva, int IMEI, int memoria) {
        super(nome, prezzo, iva);
        this.IMEI = IMEI;
        this.memoria = memoria;
    }

    public int getIMEI() {
        return IMEI;
    }

    public int getMemoria() {
        return memoria;
    }

}
