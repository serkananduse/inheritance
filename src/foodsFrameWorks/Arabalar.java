package foodsFrameWorks;

public class Arabalar {
   static String model ;
    String marka;
    int modelYil;
    int fiyat;

      Arabalar(String model, String marka, int modelYil, int fiyat) {
        this.model = model;
        this.marka = marka;
        this.modelYil = modelYil;
        this.fiyat = fiyat;
    }
    Arabalar (){}

    @Override
    public String toString() {
        return "Arabalar{" +
                "model='" + model + '\'' +
                ", marka='" + marka + '\'' +
                ", modelYil=" + modelYil +
                ", fiyat=" + fiyat +
                '}';
    }
}
