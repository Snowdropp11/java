public class Arrays {
    public static void main(String[] args) {


        //Diziler (Arrays) Konu Anlatımı
        //Bir dizi (array), aynı türden birden fazla veriyi tek bir değişkenle depolamaya yarayan yapılardır. Java’da, diziler sabit uzunlukta olur ve bellekte yan yana tutulur. İngilizce’de array olarak geçer.
        //
        //Neden Kullanılır?
        //Örneğin; bir öğrencinin 5 sınav notunu ayrı ayrı değişkenlerle tutmak yerine, hepsini tek bir array içinde saklayabilirsin.
        //
        //Dizinin Temel Özellikleri:
        //Her dizi elemanının bir index (indis) numarası vardır. İlk elemanın index’i sıfırdır.
        //
        //Dizinin boyutu tanımlanırken belirlenir ve sonradan değiştirilemez.
        //
        //Aynı tipten veriler tutulur, örneğin sadece int, sadece double.
        //
        //Örnek
        //Array kavramı ile birden fazla sayıyı, karakteri veya kelimeyi liste şeklinde depolayabilir ve döngülerle üzerinde işlem yapabilirsin.
        //
        //Genel Kullanım Alanları
        //Sınıf listesindeki tüm öğrencilerin isimlerini tutmak
        //
        //Çok sayıda veriyle işlem yapmak (istatistik, matematik)
        //
        //Kullanıcıdan alınan çok sayıda verinin saklanması

        int[] scores = new int[3];        // 3 elemanlı bir dizi oluşturuldu.
        scores[0] = 77;                   // Birinci öğrencinin puanı
        scores[1] = 83;                   // İkinci öğrencinin puanı
        scores[2] = 95;                   // Üçüncü öğrencinin puanı

        for (int i = 0; i < scores.length; i++) {  // Döngü ile dizinin tüm elemanlarını yazdır
            System.out.println(scores[i]);
        }

        int [] numbers= new int [10];
        numbers[0] = 77;
        numbers[1] = 83;
        numbers[2] = 95;
        numbers[3] = 99;
        numbers[4] = 566;
        numbers[5] = 9;
        numbers[6] = 91;
        numbers[7] = 92;
        numbers[8] = 96;
        numbers[9] = 34;
        System.out.println("arrayin uzunlugu "+ numbers.length);
        for (int number : numbers)
        {System.out.print("- " + number);
        }

        int sum=0;
        for (int number : numbers){
            sum+=number;
        }
        System.out.println();
        System.out.println("The avarege is "+ (double)sum/numbers.length);
    }
}