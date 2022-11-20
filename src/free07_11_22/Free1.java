package free07_11_22;

public class Free1 {
    private static int amountOfSale =1250;
    static String salePoint ="Dusseldorf";

    public static int getAmountOfSale() {
        return amountOfSale;
    }

    public static void setAmountOfSale(int amountOfSale) {
        Free1.amountOfSale = amountOfSale;
    }

    private int price =150;

    public static void main(String[] args) {

        salePoint="köln";
        amountOfSale =1500;
        System.out.println(salePoint+"\n"+amountOfSale);
        Free1 product = new Free1();

        System.out.println(product.salePoint);
        System.out.println(product.amountOfSale);
        System.out.println(product.price);
        Day07.food();
    }
}


