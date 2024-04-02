package org.shop;

import java.util.Arrays;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        String productName;
        double productPrice;
        double produtIva;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Quanti prodotti hai preso?");
        int productNumber = Integer.parseInt(keyboard.nextLine());
        Prodotto[] carrello = new Prodotto[productNumber];
        for (int i = 0; i < carrello.length; i++) {
            System.out.println("Il prodotto è uno smartphone, un televisore o una cuffia?");
            String productType = keyboard.nextLine().toLowerCase();
            System.out.println("Nome prodotto:");
            productName = keyboard.nextLine();
            System.out.println("Prezzo:");
            productPrice= Double.parseDouble(keyboard.nextLine().replaceAll(",","."));
            System.out.println("Iva:");
            produtIva= Double.parseDouble(keyboard.nextLine().replaceAll(",","."));
            if (productType.equals("smartphone")){
                System.out.println("IMEI:");
                int smartphoneIMEI = Integer.parseInt(keyboard.nextLine());
                System.out.println("Memoria:");
                int smartphoneMemory = Integer.parseInt(keyboard.nextLine());
                Smartphone smartphone = new Smartphone(productName,productPrice,produtIva,smartphoneIMEI,smartphoneMemory);
                carrello[i] = smartphone;
            } else if (productType.equals("televisore")){
                System.out.println("Dimensione TV:");
                int tvSize = Integer.parseInt(keyboard.nextLine());
                System.out.println("Smart:");
                boolean isSmart = Boolean.parseBoolean(keyboard.nextLine());
                Televisori televisori = new Televisori(productName,productPrice,produtIva,tvSize, isSmart);
                carrello[i] = televisori;

            } else if (productType.equals("cuffia")){
                System.out.println("Colore cuffie:");
                String headphoneColor = keyboard.nextLine();
                System.out.println("Wirless o cablate:");
                String wirlessOrWired = keyboard.nextLine();
                Cuffie cuffie = new Cuffie(productName,productPrice,produtIva,headphoneColor, wirlessOrWired);
                carrello[i] = cuffie;
            }
        }

        for (Prodotto singleProduct : carrello) {
            System.out.println(singleProduct.getFullInfo());
        }
        keyboard.close();
    }
}
