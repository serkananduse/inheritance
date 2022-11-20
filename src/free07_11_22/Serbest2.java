package free07_11_22;

import java.util.ArrayList;
import java.util.Arrays;

public class Serbest2 {
    public static void main(String[] args) {
        String [] namesOfSalers = new String[4];
        namesOfSalers[0]="Ali";
        namesOfSalers[1]="Veli";
        namesOfSalers[2]="Secil";
        namesOfSalers[3]="Selma";
       // System.out.println(Arrays.toString(namesOfSalers));

        int [] amountOfSale ={120,300,450,100};
        ArrayList<String> bonusWinners = new ArrayList<>();
        for (int i = 0; i <amountOfSale.length ; i++) {
            if (amountOfSale[i]>150){
                bonusWinners.add(namesOfSalers[i]);
            }

        }
        System.out.println(bonusWinners);
    }
}
