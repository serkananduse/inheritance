package free07_11_22;

import java.util.ArrayList;
import java.util.Scanner;

public class Free4 {
    public static void main(String[] args) {
        /*
        Bir arrayList'in icine eklenecek  n adet Stringleri bir loop döngüsü icerisinde
        Scanner metodu ile alalim ve listemizi olusturalim.
         */

        ArrayList<String> theList = new ArrayList<>();
        int amountOfArray;
        String word;
        System.out.println("please insert the number of words that you want to add to list");
        Scanner scan =new Scanner(System.in);
        amountOfArray=scan.nextInt();

        for (int i = 0; i < amountOfArray; i++) {
            Scanner sc = new Scanner(System.in);
           // System.out.println("Please insert the"+(i+1+".Word"));

            word=scan.next();
            theList.add(word);

        }

        System.out.println(theList);

    }
}
