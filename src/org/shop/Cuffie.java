package org.shop;

public class Cuffie extends Prodotto{
    private String color;
    private String WirlessOrCablate;

    public Cuffie(String nome, double prezzo, double iva, String color, String wirlessOrCablate) {
        super(nome, prezzo, iva);
        this.color = color;
        WirlessOrCablate = wirlessOrCablate;
    }

    public String getColor() {
        return color;
    }

    public String getWirlessOrCablate() {
        return WirlessOrCablate;
    }

    @Override
    public String getFullInfo() {
        return super.getFullInfo() + " Colore: " + getColor()+ " Sono: "+getWirlessOrCablate();
    }
}
