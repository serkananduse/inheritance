package free07_11_22;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;

public class free4while {
    public static void main(String[] args) {
        int x;
        String kelime;
        ArrayList<String> liste = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("kac tane kelime gireceksiniz?");
        x = scan.nextInt();
        int sayac=1;
        String a ;
        a=scan.nextLine();

        do {
            System.out.println(sayac+".Kelimeyi giriniz");
            //Scanner scn = new Scanner(System.in);
            kelime = scan.nextLine();
           //if (!kelime.equalsIgnoreCase("")) {
           //    liste.add(kelime);
           //}
            liste.add(kelime);
            x--;
            sayac++;

        } while (x != 0);
        System.out.println(liste);
    }
}