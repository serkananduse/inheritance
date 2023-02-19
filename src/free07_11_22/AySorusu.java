package free07_11_22;

import java.util.Scanner;

public class AySorusu {
    public static void main(String[] args) {
           /*
    Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
Kullanici o veya O yazdiginda output Ocak olsun
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your character");
        String kullaniciHarfi=scan.next();
        if (kullaniciHarfi.equalsIgnoreCase("j")){
            System.out.println("January,June,July");
        } else if (kullaniciHarfi.equalsIgnoreCase("f")) {
            System.out.println("February");

        }else if (kullaniciHarfi.equalsIgnoreCase("m")) {
            System.out.println("March,May");

        }else if (kullaniciHarfi.equalsIgnoreCase("a")) {
            System.out.println("April,August");

        }else if (kullaniciHarfi.equalsIgnoreCase("s")) {
            System.out.println("Seotember");

        }else if (kullaniciHarfi.equalsIgnoreCase("o")) {
            System.out.println("October");

        }else if (kullaniciHarfi.equalsIgnoreCase("n")) {
            System.out.println("November");

        }else if (kullaniciHarfi.equalsIgnoreCase("d")) {
            System.out.println("December");

        }else
        {
            System.out.println("no matching month with character");
        }
    }

}
