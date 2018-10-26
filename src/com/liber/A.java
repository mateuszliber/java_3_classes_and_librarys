package com.liber;
import java.io.*;

public class A
{

    public static void main(String[] args)
    {
        double kursDolarBuy = 3.7626;
        double kursDolarSell = 3.7921;

        double kursEuroBuy = 4.3027;
        double kursEuroSell = 3.3221;

        double kursRubelBuy = 0.0533;
        double kursRubelSell = 0.0618;

        double KursBuy=0.0;
        double KursSell=0.0;

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Podaj walutę(Dolar:$, Euro:€, Rubel:R): ");
            String currency = br.readLine();

            if (currency =="S") {
                KursBuy = kursDolarBuy;
                KursSell = kursDolarSell;
            } else if (currency == "€") {
                KursBuy = kursEuroBuy;
                KursSell = kursEuroSell;
            } else if (currency == "R") {
                KursBuy = kursRubelBuy;
                KursSell = kursRubelSell;
            }

            System.out.print("Podaj wartość:");
            String valueStr = br.readLine();
            double value = Double.parseDouble(valueStr);

            System.out.println("Zakup: "+KursBuy*value+" Sprzedaż: "+KursSell*value+" "+currency);
        }

        catch(IOException e1)
        {
            System.out.println("wyjatek operacji wejscia/wyjscia");
        }

        catch(NumberFormatException e2)
        {
            System.out.println("nieprawidlowy format liczby");
        }
    }
}
