public class SearchInArrays$ {
    public static void main(String[] args) {

//        2. Arama Algoritması — Genel Mantık
//        Dizide arama yapmak için genellikle aşağıdaki adımlar izlenir:
//        Aranacak değer bir değişkende tutulur (örneğin int searchValue = 83;﻿).
//        Bir döngüyle dizinin her elemanı gezilir.
//        Her eleman sırayla aranacak değerle karşılaştırılır ([if (numbersi﻿ == searchValue)]).
//        Eşleşme olursa, ekrana “Bulundu!” veya index’i yazdırılır (Value found at index 1﻿).
//        Döngü bittiğinde, eğer hiç eşleşme yoksa “Bulunamadı” mesajı verilebilir.


int [] numbers =new int [10];
numbers[0]=77;
numbers[1]=73;
numbers[2]=23;
numbers[3]=13;
numbers[4]=56;
numbers[5]=87;
numbers[6]=99;
numbers[7]=123;
numbers[8]=5456;
numbers[9]=999;



        int searchNumber = 5456; // Olmayan bir sayı örneği!
        boolean found = false;

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==searchNumber){
                System.out.println("The number is found :" + numbers[i]);
                found=true;
                break;
            }
        }

        if (!found) {
            System.out.println("The number is not found in the array.");



        }
    }
}