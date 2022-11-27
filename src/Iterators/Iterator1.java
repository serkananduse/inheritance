package Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterator1 {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(10);
        lst.add(29);
        lst.add(23);
        lst.add(3);
        lst.add(11);
        //System.out.println(lst);
        Iterator itr = lst.iterator();
        //System.out.println(itr.next());
        //System.out.println(itr.next());
       /* int sum =0;
        while (itr.hasNext()){
            sum+= (Integer)itr.next();
        }
        System.out.println(sum);
        int sum2 =0;
        for (Integer each:lst
             ) {
            sum2+=each;
        }
        System.out.println(sum2);
        System.out.println(lst.get(0));*/
        int sum3 =0;
        do {
           sum3+= (Integer)itr.next();
        }while (itr.hasNext());
        System.out.println(sum3);
        ArrayList<String> abc = new ArrayList<>();
        abc.add("Essek1");
        abc.add("3.Att");
        abc.add("Sinek.siz");
        abc.add(",,Kediler4");
        //System.out.println(abc);
        //System.out.println(abc.get(0).length());
        System.out.println(abc.get(0).charAt(0));
        char[] arr = new char[abc.get(0).length()];
        for (int i = 0; i <abc.get(0).length() ; i++) {
            arr[i] =abc.get(0).charAt(i);


        }
        System.out.println(Arrays.toString(arr));


    }
}
