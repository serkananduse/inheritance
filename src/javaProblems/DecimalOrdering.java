package javaProblems;

public class DecimalOrdering {
    public static void main(String[] args) {
        double [] numbers = {1.2,3.4,4.7,0.12,0.00032,12,2.9};
        double theBiggestestNumber=0;
        double [] newNumbers = new double[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>theBiggestestNumber){
                theBiggestestNumber=numbers[i];
            }
            System.out.print(theBiggestestNumber+" ");
        }




    }
   /* public static  double  [] orderDesimal(double [] numbers){
        double theBiggestestNumber=0;
        double [] newNumbers = new double[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>theBiggestestNumber){
                theBiggestestNumber=numbers[i];*/
            }



