package javaProblems;

public class Array2 {
    public static void main(String[] args) {
        /*float [] sayilar ={1.0f,2.0f,3.0f,4.0f,5.0f};
        float sayilarToplam=0.0f;
        for (int i = 0; i <sayilar.length ; i++) {

            sayilarToplam=sayilarToplam+sayilar[i];

        }
        System.out.println(sayilarToplam);

        //while ile cozum
        float toplam =0;
        int index =sayilar.length -1;
        while (index>=0){
            toplam =toplam+sayilar[index];
            index--;
        }

        //StringBuilder sbr = new StringBuilder("Ceylan");
        //System.out.println(sbr.substring(3));


        StringBuilder strBld = new StringBuilder("ceylan");

        strBld.substring(3);

        System.out.println(strBld);
        strBld.insert(0,"S");

        System.out.println(strBld);
        String s1 ="Hurriyet";

        StringBuilder s2= new StringBuilder("Hurriyet");

        if(s1==s2){

            System.out.print("Merhaba");

        }

        if(s1.equals(s2)){

            System.out.print("Hoscakal");*/
        StringBuilder sb1 = new StringBuilder("OCAJP8");

        sb1.subSequence(2, 4);

        sb1.deleteCharAt(3);

        sb1.reverse( );

        System.out.println(sb1);

        }
    }

