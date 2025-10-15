import java.util.Arrays;
public class SortInArray {
    public static void main(String[] args) {
        int[] yusuf = new int[10];
        yusuf[0] = 1;
        yusuf[1] = 2;
        yusuf[2] = 3;
        yusuf[3] = 4;
        yusuf[4] = 5;
        yusuf[5] = 6;
        yusuf[6] = 7;
        yusuf[7] = 8;
        yusuf[8] = 9;
        yusuf[9] = 10;

        Arrays.sort(yusuf);

        for (int number : yusuf) {
            System.out.print(number + " ");
        }

        int[] numbers = {41, 8, 0, 13, 6, 25}; // 6 elemanlı bir array

        // Bubble Sort algoritması başlıyor
        int n = numbers.length;
        // Dış döngü, dizinin baştan sona kaç kere taranacağını belirler
        for (int i = 0; i < n - 1; i++) {
            // İç döngü, yan yana gelen iki elemanı karşılaştırır
            for (int j = 0; j < n - 1 - i; j++) {
                // Eğer soldaki sayı sağdakinden büyükse yerleri değiştirilir (swap)
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];           // Ara değişkenle yer değiştir
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println();
            for (int number : numbers) {
                System.out.print(number + " ");
            }
        }}