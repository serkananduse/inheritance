package free07_11_22;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberEstimation {
    public static void main(String[] args) {
        Random rnd = new Random();
        int rndNmbr = rnd.nextInt(100);
        int myNumber ;
        int counter = 1;
        Scanner scan =new Scanner(System.in);

         do {
            System.out.print("Enter your "+counter+".Estimation :");
            myNumber= scan.nextInt();
            if(myNumber==rndNmbr){
                if (counter<=3){
                    System.out.println(counter+".Estimation :"+"wooooow");
                } else if (counter<=8) {
                    System.out.println(counter+".Estimation :"+"goood");
                }else {
                    System.out.println(counter+".Estimation :"+"bad");
                }

            } else if (myNumber>rndNmbr) {
                System.out.println("decrease");
                counter++;

            } else if (myNumber<rndNmbr) {
                System.out.println("increase");
                counter++;

            }


        }while (myNumber != rndNmbr);

    }
}