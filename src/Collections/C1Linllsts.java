package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class C1Linllsts {
    public static void main(String[] args) {
        LinkedList<String> lnkdlst1 =new LinkedList<>();
        lnkdlst1.add("Hayata");
        lnkdlst1.add("olumlu");
        lnkdlst1.add("bak");
        //System.out.println(lnkdlst1);

        String str ="Kekelemedimki";
        int sayac=0;

        String [] strArray =str.split("");
        System.out.println(Arrays.toString(strArray));
        List<String> arrayListStr =new ArrayList<>();
        for (String each:strArray
             ) {
            arrayListStr.add(each);

        }
        System.out.println(arrayListStr);
        System.out.println(str);
        List<String> copyArray =arrayListStr;
        System.out.println(copyArray);
        System.out.println(arrayListStr);
        for (int i = 0; i <arrayListStr.size() ; i++) {

        }
        for (int j = 0; j < copyArray.size(); j++) {

        }

    }
}
