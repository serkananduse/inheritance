package foodsFrameWorks;

public class RunConstructors {
    public static void main(String[] args) {
        Arabalar arb1 = new Arabalar();
        System.out.println(arb1.fiyat);
        arb1.marka="Clio";
        Arabalar arb2 =new Arabalar("caravan","Opel",1998,12500);
        System.out.println(arb2.model);
        System.out.println(arb2);
    }
}
