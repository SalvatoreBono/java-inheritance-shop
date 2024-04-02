package org.shop;

import java.util.Random;

public class Prodotto {

    private int codice;
    private String nome;
    private double prezzo;
    private double iva;

    public Prodotto(String nome, double prezzo, double iva) {
        this.codice = getCode();
        this.nome = nome;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public int getCode(){
        Random randomCode = new Random();
        return randomCode.nextInt(10000000);
    }
    public double getPrezzoConIva(){
        return prezzo + prezzo * iva;
    }
    public String getFullInfo(){
        return "Codice: " + getCode() + "Nome prodotto: "+ getNome()  + "Prezzo: "+ getPrezzo() + "Iva: "+ getIva()+
                "Prezzo totale: " + getPrezzoConIva();
    }
}
