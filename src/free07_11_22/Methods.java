package free07_11_22;

import java.util.Arrays;

public class Methods {



    public static void main(String[] args) {
            //giriş array {3,5,1,2,7,9,2,3,5,7}
            int [] arr1 ={1,2+3,3+4+5};
        System.out.println(arr1[2]);
        String[] dizi1 = {"3", "5", "1", "2", "7", "9", "2", "3", "5","7"};
            AritmetikSirala(dizi1);
        }
        public static void AritmetikSirala(String[] dizi1){
            String[] dizi = new String[4];
            String yeniIndex = "";
            int indexNo=0;
            int sayac=0;
            for (int i=sayac;i<dizi.length;i++) // 4 kere dönecek, diziye eleman ekleyecek.
            {
                sayac++;
                for (int j=0;j<sayac;j++) // önce 1 kere, sonra 2 kere,3 kere 4 kere dönecek.
                {
                    yeniIndex=yeniIndex+dizi1[indexNo]+"+"; //İlk dizideki
                    indexNo++;
                }
                yeniIndex=yeniIndex.substring(0,yeniIndex.length()-1);
                dizi[i]=yeniIndex;
                yeniIndex="";
            }
            System.out.println(Arrays.toString(dizi1));
            System.out.println(Arrays.toString(dizi));

        }
    }






