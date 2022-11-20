package inheritance;

public class MuzikAletleri {
    protected String mensei ;
    protected String kullanimBolgesi;

    protected void ses(){
        System.out.println("bütün müzik aletlerinin sesi vardir.");
    }
    protected void cesit(){
        System.out.println("Bütün müzik aletlerinin cesidi vardir");
    }
    protected void icraci(){
        System.out.println("Bütün müzik aletlerinin bir icracisi vardir");
    }


    public static void main(String[] args) {
        Ud ud3 =new Ud();
        ud3.mizrap();
        System.out.println(ud3.telSayisi);
        ud3.ses();

    }


    }

