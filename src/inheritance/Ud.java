package inheritance;

public class Ud extends TelliCalgilar{
    protected int telSayisi;
    protected String materyali ="Ahsap";
    protected String tarihi  ="14.yy";
    protected String tipi ;

    protected void mizrap(){
        System.out.println("Ud yaklasik 10 cm lik plastik bir mizrap ile calinir");
    }
    protected void icraci(){
        System.out.println("ud icracisina udi adi verilir");
    }
    protected void ogrenim(){
        System.out.println("Ud ögrenmesi kolay degildir ciddi emek ve sabir gerektirir");
    }
    public static void main(String[] args) {

       // Ud ud1 = new Ud();
       // ud1.tipi="Arap";
       // System.out.println(ud1.materyali);
       // System.out.println(ud1.tipi);
       // System.out.println(ud1.tarihi);
       // ud1.telSayisi=11;
       // System.out.println(ud1.telSayisi);
       // ud1.telSinifi="Metal";
       // System.out.println(ud1.telSinifi);
       // ud1.mensei="Arap yarimadasi";
       // System.out.println(ud1.mensei);
       // ud1.kullanimBolgesi="Asya,Afrika,Avrupa";
       // System.out.println(ud1.kullanimBolgesi);
       // ud1.vokaliYuksek=true;
       // System.out.println(ud1.vokaliYuksek);

        TelliCalgilar ud100 = new Ud();
        ud100.icraci();
        ud100.mizrap();


    }



}
