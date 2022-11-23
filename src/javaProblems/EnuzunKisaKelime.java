package javaProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class EnuzunKisaKelime {
    public static void main(String[] args) {

// Soru 7 : String' lerden oluşan bir arrayde uzunluğu en kisa ve en uzun  olan elemanları bulunuz.
        // Örnek: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli
     /*   String[] arr = {"Kemal", "Jonathan", "Mark", "Angie", "Oya"};
        String enKisa =arr[0];
        String enUzun =arr[0];
        int sayac =0;
        String [] newArr =new String[sayac];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length()<enKisa.length()){

            }

        }*/
        int [] arr1 = new int[5];
        arr1[0]=15;
        arr1[1]=13;
        arr1[2]=15;
        arr1[3]=13;
        arr1[4]=4;
        //System.out.println(Arrays.toString(arr1));
        ArrayList<Integer> new1 =new ArrayList<>();
        int [] yeni = new int[arr1.length];
        yeni=arr1;
        for (int i = 0; i <arr1.length ; i++) {
            if (arr1[i]>10){

                new1.add(arr1[i]);
            }

        }
        System.out.println(new1);




    }
}
