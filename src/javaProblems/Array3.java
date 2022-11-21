package javaProblems;

import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {
        int [][] arr ={{1,2,3},{4,5},{6,7}};
        int sum1=0;

        int [] sumarr = new int[arr.length];
        for (int kat = 0; kat <arr.length ; kat++) {
            sum1=0;
            for (int daire = 0; daire< arr[kat].length  ; daire++) {
            sum1+=arr[kat][daire];
            sumarr[kat]=sum1;
            }
            System.out.println(Arrays.toString(sumarr));
        }


    }
}
