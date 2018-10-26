package com.liber;
import java.io.*;

public class A
{

    public static void main(String[] args)
    {


        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            double KursBuy=0.0;
            double KursSell=0.0;

            double kursDolarBuy = 3.7626;
            double kursDolarSell = 3.7921;

            double kursEuroBuy = 4.3027;
            double kursEuroSell = 4.3221;

            double kursRubelBuy = 0.0533;
            double kursRubelSell = 0.0618;



            System.out.print("Podaj walutę(Dolar:$, Euro:€, Rubel:R): ");
            String currency = br.readLine();
            System.out.println(" '"+currency+"' ");

            switch (currency) {
                case "$":
                    KursBuy = kursDolarBuy;
                    KursSell = kursDolarSell;
                    break;
                case "€":
                    KursBuy = kursEuroBuy;
                    KursSell = kursEuroSell;
                    break;
                case "R":
                    KursBuy = kursRubelBuy;
                    KursSell = kursRubelSell;
                    break;
                default:
                    System.out.println("Niewłaściwa waluta");
                    break;
            }

            System.out.print("Podaj wartość:");
            String valueStr = br.readLine();
            double value = Double.parseDouble(valueStr);

            System.out.println("Zakup: "+KursBuy*value+" Sprzedaż: "+KursSell*value+" "+currency);
        }

        catch(IOException e1)
        {
            System.out.println("Wyjatek operacji wejscia/wyjscia");
        }

        catch(NumberFormatException e2)
        {
            System.out.println("Nieprawidlowy format liczby");
        }
    }
}
