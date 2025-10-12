public class Operators {

    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = 4;
        System.out.println("Toplama: " + (sayi1 + sayi2));
        System.out.println("Çıkarma: " + (sayi1 - sayi2));
        System.out.println("Çarpma: " + (sayi1 * sayi2));
        System.out.println("Bölme: " + (sayi1 / sayi2));
        System.out.println("Mod: " + (sayi1 % sayi2));
        System.out.println("Eşit mi: " + (sayi1 == sayi2));
        System.out.println("Büyük mü: " + (sayi1 > sayi2));
        System.out.println("Küçük mü: " + (sayi1 < sayi2));
        System.out.println("Ve (&&): " + ((sayi1 > 5) && (sayi2 < 8)));
        System.out.println("Veya (||): " + ((sayi1 > 15) || (sayi2 < 8)));
    }
}
