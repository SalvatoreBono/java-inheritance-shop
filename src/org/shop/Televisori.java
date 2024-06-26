package org.shop;

public class Televisori extends Prodotto {

    private int dimensioni;
    private boolean smart;

    public Televisori(String nome, double prezzo, double iva, int dimensioni, boolean smart) {
        super(nome, prezzo, iva);
        this.dimensioni = dimensioni;
        this.smart = smart;
    }

    public int getDimensioni() {
        return dimensioni;
    }

    public boolean isSmart() {
        return smart;
    }

    @Override
    public String getFullInfo() {
        return super.getFullInfo() + " Dimensioni: "+ getDimensioni()+" pollici " + (isSmart() ? "la TV è smart" :
                "la TV " +
                "non è " +
                "smart");
    }
}
