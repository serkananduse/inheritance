package javaProblems;

import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {
        /*Task
        Given an integer,n , perform the following conditional actions:

        If n is odd, print Weird
        If n is even and in the inclusive range of 2 to 5 , print Not Weird
        If n is even and in the inclusive range of 6 to 20 , print Weird
        If n is even and greater than 20 , print Not Weird
        Complete the stub code provided in your editor to print whether or not  is weird.
                Constraints: 1<=n<=100*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Please insert a number");
        int number = scan.nextInt();
        if (!(number>=1&&number<=100)){
            System.out.println("Please enter any number at the range of from 1 to 100");
        }else
            if (number%2!=0){
                System.out.println("The number is weird");
            }else
                if (number%2==0&&number>=20){
                    System.out.println("not weird");
                } else if (number%2==0&&number<20&&number>=6) {
                    System.out.println("Weird(6-20)");

                } else if (number%2==0&&number<6&&number>=2) {
                    System.out.println("Not weird(2-5)");

                }


    }
}
