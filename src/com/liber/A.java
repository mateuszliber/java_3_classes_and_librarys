package com.liber;
import java.io.*;

public class A
{
    public static void main(String[] args)
    {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            /** Definicja zmiennych walutowych*/
            double KursBuy=0.0;
            double KursSell=0.0;

            double kursDolarBuy = 3.7626;
            double kursDolarSell = 3.7921;

            double kursEuroBuy = 4.3027;
            double kursEuroSell = 4.3221;

            double kursRubelBuy = 0.0533;
            double kursRubelSell = 0.0618;

            //W jakiej formie wyświetlić
            System.out.print("(PLN na inną walutę - 1, inna waluta na PLN - 2)?: ");
            String condition = br.readLine();

            //Jakie wauty brać pod uwagę
            System.out.print("Podaj walutę(Dolar:$, Euro:€, Rubel:R): ");
            String currency = br.readLine();

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

            System.out.print("Podaj wartość: ");
            String valueStr = br.readLine();
            double value = Double.parseDouble(valueStr);

            // Zaokrąglenie do 2 miejsca po przecinku:
            java.text.DecimalFormat df=new java.text.DecimalFormat(); //tworzymy obiekt DecimalFormat
            df.setMaximumFractionDigits(2); //dla df ustawiamy największą ilość miejsc po przecinku
            df.setMinimumFractionDigits(2); //dla df ustawiamy najmniejszą ilość miejsc po przecinku


            if(condition.equals("1")) {
                System.out.println("Wartość "+value+" "+currency+"; Zakup: " + df.format(KursBuy*value) + " PLN, Sprzedaż: " + df.format(KursSell*value) + " PLN");
            } else if(condition.equals("2")) {
                System.out.println("Wartość "+value+" PLN; Zakup: "+df.format(value/KursBuy)+" "+currency+", Sprzedaż: "+df.format(value/KursBuy)+" "+currency);
            } else {
                System.out.println("Niewłaściwe id operacji");
            }
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
