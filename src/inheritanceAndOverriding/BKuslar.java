package inheritanceAndOverriding;

public class BKuslar extends AHayvanlar{
    String tur ="Kus";
    String isim ="Kus ismi belirtilmedi";
    String ayak ="Kuslarin ayaklari vardir";
    void kanat(){
        System.out.println("Kuslar kanatlidir");
    }
    void solunum(){
        System.out.println("Kuslar akciger ile nefes alirlar");
    }
    void gaga(){
        System.out.println("Kuslarin gagalari vardir");
    }
    void cogalma(){
        System.out.println("Kuslar yumurta ile cogalirlar");
    }

    public static void main(String[] args) {
      // AHayvanlar kumes1 = new CKumesKuslari();
       //kumes1.cogalma();
       //kumes1.hareket();
       //System.out.println(kumes1.tur);
       //System.out.println(kumes1.tur);
       // AHayvanlar kus2 = new CKumesKuslari();

        //System.out.println(kus2.tur);

    }
}
