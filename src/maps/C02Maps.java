package maps;

import java.util.Map;

public class C02Maps {
    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap = MapDepo.ornekMapOlustur();
        ogrenciMap.put(105,"Hasan-can-11-K-MF");
        ogrenciMap.put(108,"Hikmet-Han-10-M-TM");
        System.out.println(ogrenciMap);

        // 104 numarali ogrencinin subesini K yapin
        // method'da isten Key map'de varsa degistirip map'i geri dondurelim
        // yoksa hic bir islem yapmadan map'i geri dondurelim
        int ogrenciKey=103;
        String yeniSube="S";

        ogrenciMap=MapDepo.ogrenciyeYeniSubeAta(ogrenciMap,ogrenciKey,yeniSube);
        System.out.println(ogrenciMap);
        System.out.println(MapDepo.isimSoyisimDondur(ogrenciMap, 104));


    }
}
