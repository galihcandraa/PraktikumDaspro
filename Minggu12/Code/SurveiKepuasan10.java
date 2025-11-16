package Minggu12.Code;
import java.util.Scanner;
public class SurveiKepuasan10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] survei = new int[10][6];
        double totalRata2 = 0;

        System.out.println("=== Survei Kepuasan Pelanggan ===");
        for (int i = 0; i < survei.length; i++) {
            System.out.println("Responden " + (i + 1) + ": ");
            double rata2 = 0;
            for (int j = 0; j < survei[i].length; j++) {
                do {
                    System.out.print("  Pertanyaan " + (j + 1) + " (1-5)" + ": ");
                    survei[i][j] = sc.nextInt();
                    rata2 += survei[i][j];
                    if (survei[i][j] < 1 || survei[i][j] > 5) {
                        System.out.println("  Invalid nilai, Ulangi!");
                    }
                } while (survei[i][j] < 1 || survei[i][j] > 5);
            }
            System.out.println("Rata-rata responden " + (i + 1) + ": " + rata2 / 6);
            totalRata2 += rata2;
        }

        System.out.println();
        for (int j = 0; j < 6; j++) {
            double rata2Pertanyaan = 0;
            for (int i = 0; i < 10; i++) {
                rata2Pertanyaan += survei[i][j];
            }
            System.out.println("Rata-rata pertanyaan " + (j + 1) + ": " + rata2Pertanyaan / 10);
        }

        System.out.println("=================================");
        System.out.println("Total rata-rata keseluruhan: " + totalRata2 / (10 * 6));
        System.out.println("=================================");
        sc.close();
    }
}
