public class Methods {


   public static int add (int a, int b) {
        return a + b;
    }
    int sub(int a, int b) {
        return a - b;
    }
    public static void main(String[] args) {
int topla=add(155, 244);
        System.out.println("the resul is :"+ topla );

Methods m = new Methods();
int cikar= m.sub(700,233);
        System.out.println("the sub result is :"+ cikar);

//        Fonksiyonlar (Methods) Nedir?
//                1. Amaç ve Tanım
//        Programda kullanılan belirli bir işi yapan, kendine ait bir kod bloğudur.
//        Fonksiyonlar sayesinde aynı işlemi birden çok yerde yazmak yerine, tek bir fonksiyon yazıp çağırmak yeterli olur.
//        Fonksiyonlar, programın akışını daha kolay yönetmeyi sağlar.
//        2. Fonksiyonun Temel Yapısı
//        Fonksiyon adı (örneğin topla)
//        Girdi parametreleri (örneğin iki sayı)
//        Fonksiyonun yaptığı işlemler
//        Geri dönüş (return) değeri (örneğin toplam sonucu)



//        Fonksiyonların Avantajları
//        Kod tekrarı azaltılır
//        Program daha modüler olur
//        Hatalar daha kolay bulunur ve çözülür
//        Büyük programları küçük parçalara bölmek kolaylaşır



//        [erişim_belirteci] [geri_dönüş_tipi] metodAdı([parametreler]) {
//            // metod gövdesi - yapılacak işlemler
//            return değer; // geri dönüş varsa
//        }
//        Erişim Belirteci (Access Modifier): public, private, protected veya default olabilir. Metodun hangi sınıflar tarafından erişilebilir olduğunu belirler.
//                Geri Dönüş Tipi (Return Type): Metodun hangi türde veri döndürdüğünü belirtir. Eğer metod veri döndürmüyorsa void yazılır.
//        Metod Adı: Metodu çağırmak için kullanılan isim.
//                Parametreler: Metoda gönderilen dış veri. Sıfır veya daha fazla olabilir.
//                Metod Gövdesi: Metodun yaptığı işlemler yazılır.


//        public class Person {
//            private String name;         // Yalnızca Person sınıfında erişilir
//            protected int age;           // Aynı paket ve alt sınıflarda erişilir
//            String address;              // Default, sadece aynı pakette erişilir
//            public String phoneNumber;   // Projenin her yerinden erişilebilir


//        6. Erişim Belirteçleri için İyi Uygulama
//        Alanlar (fields) genellikle private olur, erişim getter/setter metodları ile sağlanır.
//        Metodlar genellikle public veya protected olur, ihtiyaca göre sınırlanır.
//                Sadece sınıf içinde kullanılacaksa private tercih edilir.
//        Bu, sürdürülebilir, güvenli ve okunabilir kod yazmayı kolaylaştırır.


    }
}
