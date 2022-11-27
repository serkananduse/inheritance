package free07_11_22;

import java.util.Arrays;

public class ArrayElementSwap {
    public static void main(String[] args) {
        String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
        String space =names[2];
        names[2]=names[7];
        names[7]=space;
        System.out.println(Arrays.toString(names));
    }
}
