package maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDepo {

    public static Map<Integer, String> ornekMapOlustur() {
        Map<Integer,String> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-10-H-MF");
        ogrenciMap.put(102,"Veli-Cem-11-M-Soz");
        ogrenciMap.put(103,"Ali-Cem-11-H-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Ayse-Cem-11-M-TM");
        ogrenciMap.put(106,"Fatma-Han-10-K-Soz");

        return ogrenciMap;
    }

    public static String isimSoyisimDondur(Map<Integer, String> ogrenciMap, int ogrenciKey) {

        String isimSoyisim=ogrenciMap.get(ogrenciKey);
        String[] valueArr=isimSoyisim.split("-");
        isimSoyisim=valueArr[0]+" "+valueArr[1];

        
      return isimSoyisim;
    }

    public static Map<Integer, String> ogrenciyeYeniSubeAta(Map<Integer, String> ogrenciMap, int ogrenciKey, String yeniSube) {
    Set<Integer> ogrenciKeySet = ogrenciMap.keySet();
        for (Integer eachkey:ogrenciKeySet
             ) {
           if (!ogrenciKeySet.contains(ogrenciKey)){
               ogrenciMap=MapDepo.ornekMapOlustur();
           }else {
               String ogrenciValue=ogrenciMap.get(ogrenciKey);
               String [] ogrenciArr =ogrenciValue.split("-");//[Ayse,Can,10,H,MF)
               ogrenciValue=ogrenciArr[0]+"-"+ogrenciArr[1]+"-"+ogrenciArr[2]+"-"+yeniSube+"-"+ogrenciArr[4];
               ogrenciMap.put(ogrenciKey,ogrenciValue);

           }
        }
    return ogrenciMap;

    }



    public static void ortakSubeBilgileriDondur(Map<Integer, String> ogrenciMap, String sube) {
        Collection<String> ogrenciValuesCollection =ogrenciMap.values();
        String [] ogrenciValuesArray ;
        String isimSoyisimSinif="";
        for (String eachValue:ogrenciValuesCollection
        ) {
            ogrenciValuesArray=eachValue.split("-"); //[Ayse,Can,10,H,MF)
            if (sube.equalsIgnoreCase(ogrenciValuesArray[3])){
                isimSoyisimSinif =ogrenciValuesArray[0]+" "+ogrenciValuesArray[1]+" "+ogrenciValuesArray[2];
                System.out.println(isimSoyisimSinif);
            }

        }
    }
}
