package Minggu11.Code;

import java.util.Scanner;

public class KasirCafe10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalHarga = 0;

        System.out.println("======== PROGRAM KASIR =======");
        System.out.print("Masukkan jumlah pesanan: ");
        int jmlPesanan = sc.nextInt();
        sc.nextLine();

        String[] arrMakanan = new String[jmlPesanan];
        int[] arrHarga = new int[jmlPesanan];
        int[] jmlMakanan = new int[jmlPesanan];

        for (int i = 0; i < arrHarga.length; i++) {
            System.out.print("Masukkan nama makanan/minuman ke-" + (i + 1) + " : ");
            arrMakanan[i] = sc.nextLine();
            System.out.print("Masukkan jumlah: ");
            jmlMakanan[i] = sc.nextInt();
            System.out.print("Masukkan harga makanan/minuman ke-" + (i + 1) + " : Rp ");
            arrHarga[i] = sc.nextInt();
            sc.nextLine();
            totalHarga += (arrHarga[i] * jmlMakanan[i]);
            System.out.println();
        }

        System.out.println("======== DAFTAR PESANAN ========");
        System.out.printf("%-20s %-10s %-10s %-10s\n", "Menu", "Jumlah", "Harga", "Subtotal");
        System.out.println("-----------------------------------------------");

        for (int i = 0; i < arrMakanan.length; i++) {
            double subtotal = arrHarga[i] * jmlMakanan[i];
            System.out.printf("%-20s %-10d Rp%-9d Rp%-10.0f\n", arrMakanan[i], jmlMakanan[i], arrHarga[i], subtotal);
        }

        System.out.println("-----------------------------------------------");
        System.out.printf("TOTAL PEMBAYARAN: \t\t\tRp %.0f\n", totalHarga);
        System.out.println("===============================================");
        sc.close();
    }
}
