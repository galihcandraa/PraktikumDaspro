package Minggu10.Code;

import java.util.Scanner;

public class PersegiAngka10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Program Persegi Angka ===");
        System.out.print("Masukkan nilai akhir n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(n);
                    if (j < n) {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
