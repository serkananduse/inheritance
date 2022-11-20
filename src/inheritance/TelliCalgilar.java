package inheritance;

public class TelliCalgilar extends MuzikAletleri{
    protected String telSinifi;
    protected boolean vokaliYuksek;

    protected void akord(){
        System.out.println("Telli calgilar akort edilmelidir");
    }

    protected void mizrap (){
        System.out.println("Bütün telli calgilar mizrap yada benzeri maddelerle calinir");
    }
    protected void sesFrekansi(){
        System.out.println("Telli calgilar genis ses frekanslarina sahiptirler");
    }


    public static void main(String[] args) {

 /*       Ud ud2 = new Ud();
        ud2.tipi="Arap";
        System.out.println(ud2.materyali);
        System.out.println(ud2.tipi);
        System.out.println(ud2.tarihi);
        ud2.telSayisi=11;
        System.out.println(ud2.telSayisi);
        ud2.telSinifi="Metal";
        System.out.println(ud2.telSinifi);
        ud2.mensei="Arap yarimadasi";
        System.out.println(ud2.mensei);
        ud2.kullanimBolgesi="Asya,Afrika,Avrupa";
        System.out.println(ud2.kullanimBolgesi);
        ud2.vokaliYuksek=true;
        System.out.println(ud2.vokaliYuksek);*/

        TelliCalgilar ud4 = new Ud();
        /*ud4.tipi="Arap";  CTE
        System.out.println(ud4.materyali);  CTE
        System.out.println(ud4.tipi);       CTE
        System.out.println(ud4.tarihi);     CTE
        ud4.telSayisi=11;                   CTE
        System.out.println(ud4.telSayisi);*/

        ud4.telSinifi="Metal";
        System.out.println(ud4.telSinifi);
        ud4.mensei="Arap yarimadasi";
        System.out.println(ud4.mensei);
        ud4.kullanimBolgesi="Asya,Afrika,Avrupa";
        System.out.println(ud4.kullanimBolgesi);
        ud4.vokaliYuksek=true;
        System.out.println(ud4.vokaliYuksek);



    }
}
