package free07_11_22;

import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        /*
        A şehrinden uçmak isteyen bir kişi B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
     km birim fiyati : 0.10$ 12 yasindan kucukse toplam fiyat %50 indirim 12 ve 24
     yas arasindaysa 10% 65 yasindan buyukse 30% gidis donus alirsa20% bu
     kosullara gore yolcudan gideceği mesafeyi isteyip ucak biletini hesaplayan program
         */
        String gidilecekYer;
        int yas;
        String yolcuTipi;
        boolean gidisDonus;

        Scanner scan = new Scanner(System.in);
        System.out.println("Gideceginiz güzergahi seciniz(B,C,D)");
        gidilecekYer = scan.next();
        System.out.println("Yasinizi giriniz");
        yas = scan.nextInt();
        //System.out.println("Yolcu tipini giriniz");
        //yolcuTipi = scan.next();
        System.out.println("tek yön mü gidis dönus mü?");
        gidisDonus = scan.hasNext();

        if (gidilecekYer.equalsIgnoreCase("b")) {
            if (yas > 65 && gidisDonus) {
                System.out.println("Bilet tutari :" + (0.10 * 500 * 0.5));
            } else if (yas > 65) {
                System.out.println("Bilet tutari :" + (0.10 * 500 * 0.7));

            } else if (yas > 24 && gidisDonus) {
                System.out.println("Bilet tutari :" + (0.10 * 500 * 0.8));

            } else if (yas > 24) {
                System.out.println("Bilet tutari(Maalesf indirim yok) :" + (0.10 * 500));

            } else if (yas > 12 && gidisDonus) {
                System.out.println("Bilet tutari :" + (0.10 * 500 * 0.7));
            } else if (yas > 12) {
                System.out.println("Bilet tutari :" + (0.10 * 500 * 0.9));
            } else if (yas <= 12 && gidisDonus) {
                System.out.println("Bilet tutari(Süper tarife) :" + (0.10 * 500 * 0.3));
            } else if (yas <= 12) {
                System.out.println("Bilet tutari :" + (0.10 * 500 * 0.5));
            }
        } else if ((gidilecekYer.equalsIgnoreCase("c"))) {
            if (yas > 65 && gidisDonus) {
                System.out.println("Bilet tutari :" + (0.10 * 700 * 0.5));
            } else if (yas > 65) {
                System.out.println("Bilet tutari :" + (0.10 * 700 * 0.7));

            } else if (yas > 24 && gidisDonus) {
                System.out.println("Bilet tutari :" + (0.10 * 700 * 0.8));

            } else if (yas > 24) {
                System.out.println("Bilet tutari(Maalesf indirim yok) :" + (0.10 * 700));

            } else if (yas > 12 && gidisDonus) {
                System.out.println("Bilet tutari :" + (0.10 * 700 * 0.7));
            } else if (yas > 12) {
                System.out.println("Bilet tutari :" + (0.10 * 700 * 0.9));
            } else if (yas <= 12 && gidisDonus) {
                System.out.println("Bilet tutari(Süper tarife) :" + (0.10 * 700 * 0.3));
            } else if (yas <= 12) {
                System.out.println("Bilet tutari :" + (0.10 * 700 * 0.5));
            }

        } else if ((gidilecekYer.equalsIgnoreCase("d"))) {
            if (yas > 65 && gidisDonus) {
                System.out.println("Bilet tutari :" + (0.10 * 900 * 0.5));
            } else if (yas > 65) {
                System.out.println("Bilet tutari :" + (0.10 * 900 * 0.7));

            } else if (yas > 24 && gidisDonus) {
                System.out.println("Bilet tutari :" + (0.10 * 900 * 0.8));

            } else if (yas > 24) {
                System.out.println("Bilet tutari(Maalesf indirim yok) :" + (0.10 * 900));

            } else if (yas > 12 && gidisDonus) {
                System.out.println("Bilet tutari :" + (0.10 * 900 * 0.7));
            } else if (yas > 12) {
                System.out.println("Bilet tutari :" + (0.10 * 900 * 0.9));
            } else if (yas <= 12 && gidisDonus) {
                System.out.println("Bilet tutari(Süper tarife) :" + (0.10 * 900 * 0.3));
            } else if (yas <= 12) {
                System.out.println("Bilet tutari :" + (0.10 * 900 * 0.5));
            }

        }

    }

}
