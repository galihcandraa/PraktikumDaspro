package Minggu11.Code;

import java.util.Scanner;

public class ArrayRataNilai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int mhs = sc.nextInt();

        int[] nilaiMhs = new int[mhs];
        double totalLulus = 0, totalTdkLulus = 0;
        double rata2Lulus = 0, rata2TdkLulus = 0;
        int lulus = 0, tdkLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs[i] > 70) {
                lulus++;
                totalLulus += nilaiMhs[i];
            } else {
                tdkLulus++;
                totalTdkLulus += nilaiMhs[i];
            }
        }

        rata2Lulus = totalLulus / lulus;
        rata2TdkLulus = totalTdkLulus / tdkLulus;

        System.out.println("Rata-rata nilai lulus = " + rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2TdkLulus);
        sc.close();
    }
}
