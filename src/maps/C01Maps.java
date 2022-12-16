package maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class C01Maps {
    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap = MapDepo.ornekMapOlustur();
        System.out.println(ogrenciMap);
        /*
        {
        101=Ali-Can-10-H-MF,
        102=Veli-Cem-11-M-Soz,
        103=Ali-Cem-11-H-TM,
        104=Ayse-Can-10-H-MF,
        105=Ayse-Cem-11-M-TM,
        106=Fatma-Han-10-K-Soz}
        */
        System.out.println(ogrenciMap.size());
        System.out.println(ogrenciMap.get(102));
        //105 numarali ögrencinin isim ve soyismini yazdirin metod yaparak
        int ogrenciKey =106;
        String isimSoyisim=MapDepo.isimSoyisimDondur(ogrenciMap,ogrenciKey);
        System.out.println(isimSoyisim);


    }
}
