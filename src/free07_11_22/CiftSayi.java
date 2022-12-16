package free07_11_22;

public class CiftSayi {
    public static void main(String[] args) {
        for (int i = 1; i <21 ; i++) {
            if (i%2==0&&i!=14){
                System.out.print(i+" ");
            }
        }
        String a ="hhlkljl";
        System.out.println(a.length());
        int salary=123;
        aylikGelir(salary);
        isimListe("ahmet sal",1239090909);

    }

    public static void aylikGelir(int salary) {
        System.out.println(salary * 12);
    }


    public static void isimListe(String isimSoyisim, int tcNo){
        System.out.println(isimSoyisim+" = "+tcNo);

    }



}
