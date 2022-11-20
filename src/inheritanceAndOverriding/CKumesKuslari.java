package inheritanceAndOverriding;

public class CKumesKuslari extends BKuslar {
    String tur = "Kumes kusu";
    String isim = "Kumes kusu ismi belirtilmedi";
    String yasamaYeri = "kumes kuslari kumeste yasar";

    protected void hareket() {
        System.out.println("Kumes hayvanlari yurur");
    }

    void beslenme() {
        System.out.println("Kumes hayvanlari et veya ot yerler");
    }

    public static void main(String[] args) {

        CKumesKuslari kumes1 = new CKumesKuslari();
        BKuslar kus = new CKumesKuslari();
        System.out.println(kus.tur);
        kus.gaga();
        kus.beslenme();


    }
}