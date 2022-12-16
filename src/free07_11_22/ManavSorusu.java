package free07_11_22;

import java.util.Scanner;

public class ManavSorusu {
    static int urunCinsi;
    static double urunMiktariKg;
    static double urunTutari;
    static double toplamTutar=0.0;

    public static void main(String[] args) {
        /*
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor. 2. Adim :
         * Baska bir urun almak isteyip istemedigini sor. istemiyorsa toplam miktari
         * goster, istiyorsa tekrar urun sectir. Bu islemi alisverisi bitirmek isteyene
         * kadar tekrarla. 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini
         * toplam fiyata ekle. 4. Adim : Alisveris bitince toplam odemesi gereken tutari
         * goster.
         *
         */
        urunSecmeMenu();
    }

   public static void urunSecmeMenu() {
       Scanner scan = new Scanner(System.in);


           System.out.println("..........URUN LISTESI..........\n" +
                   "1.PATATES :0.85\n" +
                   "2.ELMA :1.5\n" +
                   "3.SOGAN :0.90\n" +
                   "4.ISPANAK :2.5\n" +
                   "5.PORTAKAL :2.0");
               int finish=1;
           do {
               System.out.println("lütfen alcaginiz urunun liste numarasini giriniz");
               urunCinsi=scan.nextInt();
               System.out.println("Kac kg?");
               urunMiktariKg=scan.nextDouble();
               urunTutariVeToplamTutar();
               System.out.println("Urun eklemek istiyorsaniz 1 e basiniz \nyoksa tutari gormek icin herhangi bir sayiya basiniz");
               finish=scan.nextInt();
           }while (finish==1);





    }

    public static void urunTutariVeToplamTutar() {
        if (urunCinsi == 1) {
            urunTutari = 0.85 * urunMiktariKg;
            toplamTutar += urunTutari;
            System.out.println("Urun Tutari :" + urunTutari + "\nToplam Tutar : " + toplamTutar);
        } else if (urunCinsi == 2) {
            urunTutari = 1.5 * urunMiktariKg;
            toplamTutar += urunTutari;
            System.out.println("Urun Tutari :" + urunTutari + "\nToplam Tutar : " + toplamTutar);

        } else if (urunCinsi == 3) {
            urunTutari = 0.90 * urunMiktariKg;
            toplamTutar += urunTutari;
            System.out.println("Urun Tutari :" + urunTutari + "\nToplam Tutar : " + toplamTutar);

        } else if (urunCinsi == 4) {
            urunTutari = 2.5 * urunMiktariKg;
            toplamTutar += urunTutari;
            System.out.println("Urun Tutari :" + urunTutari + "\nToplam Tutar : " + toplamTutar);

        } else if (urunCinsi == 5) {
            urunTutari = 2.0 * urunMiktariKg;
            toplamTutar += urunTutari;
            System.out.println("Urun Tutari :" + urunTutari + "\nToplam Tutar : " + toplamTutar);


        }else {
            System.out.println("Yanlis giris yaptiniz lütfen tekrar deneyiniz..");
            urunSecmeMenu();
        }
    }
    }