package maps;

import java.util.Map;

public class C03Maps {
    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap=MapDepo.ornekMapOlustur();
        //System.out.println(MapDepo.ogrenciyeYeniSubeAta(ogrenciMap, 105, "T"));

        // ogrenciler map'inde subesi H olan ogrencilerin isim soyisim ve siniflarini yazdiralim
        /*
        ogrenciMap.put(101,"Ali-Can-10-H-MF");
        ogrenciMap.put(102,"Veli-Cem-11-M-Soz");
        ogrenciMap.put(103,"Ali-Cem-11-H-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Ayse-Cem-11-M-TM");
        ogrenciMap.put(106,"Fatma-Han-10-K-Soz");
         */
        String sube ="m";



        MapDepo.ortakSubeBilgileriDondur(ogrenciMap, sube);

    }
}
