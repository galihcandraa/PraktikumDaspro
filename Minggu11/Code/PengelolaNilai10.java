package Minggu11.Code;
import java.util.Scanner;
public class PengelolaNilai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tertinggi = 0, terendah = 100, total = 0;
        double rata2;

        System.out.println("=== Program Pengelola Nilai ===");
        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int mhs = sc.nextInt();

        int[] nilaiMhs = new int [mhs];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }

        System.out.println("\n--- Hasil ---");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + " : " + nilaiMhs[i]);
        }

        rata2 = total / nilaiMhs.length;
        System.out.println("\nRata-rata nilai: " + rata2);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        sc.close();
    }
}