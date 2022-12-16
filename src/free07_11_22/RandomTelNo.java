package free07_11_22;

import java.util.Random;

public class RandomTelNo {
    public static void main(String[] args) {
         /*
        tel number formati XXX-XXX-XXXX
        ILK UC HANEDE 8 veya 9 OLMAYACAK.orta uclu 742 den buyuk olmayacak.
        bunlara göre rastgele tel numaralari uretelim
         */

        Random rnd = new Random();
        int first = rnd.nextInt(8);
        int second = rnd.nextInt(8);
        int third = rnd.nextInt(8);
        int middle = rnd.nextInt(743);
        int last = rnd.nextInt(9999);

        String middleString;
        String lastString;
        middleString = Integer.toString(middle);
        lastString = Integer.toString(last);

        while (middleString.length() < 3) {
            middleString="0"+middleString;

        }
        while (lastString.length()<4){
            lastString="0"+lastString;
        }
        System.out.println(Integer.toString(first)+Integer.toString(second)+
                Integer.toString(third)+"-"+middleString+"-"+lastString);
    }
}
