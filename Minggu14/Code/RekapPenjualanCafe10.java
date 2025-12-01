package Minggu14.Code;

import java.util.Scanner;

public class RekapPenjualanCafe10 {
    static Scanner sc = new Scanner(System.in);
    static int[][] rekapJual = new int[5][7];
    static String namaMenu[] = { "Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan" };

    public static void main(String[] args) {
        System.out.println("=== REKAP PENJUALAN CAFE ===");
        System.out.println("========== INPUT ===========");
        rekapJual = inputData(namaMenu);

        System.out.println("========== OUTPUT ===========");
        tampilData(rekapJual, namaMenu);
        tampilMenuTerjualTingggi(rekapJual, namaMenu);
        tampilRata2(rekapJual, namaMenu);
        System.out.println("======= PROGRAM SELESAI =======");
    }

    public static int[][] inputData(String[] namaMenu) {
        int[][] tempRekap = new int[5][7];
        for (int i = 0; i < tempRekap.length; i++) {
            System.out.println(namaMenu[i] + ": ");
            for (int j = 0; j < tempRekap[i].length; j++) {
                System.out.print("- hari ke " + (j + 1) + ": ");
                tempRekap[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        return tempRekap;
    }

    public static void tampilData(int[][] rekap, String[] namaMenu) {
        System.out.println("------------ DATA ------------");
        int jumlahHari = rekap[0].length;
        System.out.printf("%-15s", "");

        for (int h = 0; h < jumlahHari; h++) {
            System.out.printf("%-12s", "Hari ke " + (h + 1));
        }
        System.out.println();

        for (int i = 0; i < rekap.length; i++) {
            System.out.printf("%-15s", namaMenu[i]);
            for (int j = 0; j < rekap[i].length; j++) {
                System.out.printf("%-12d", rekap[i][j]);
            }
            System.out.println();
        }
    }

    public static void tampilMenuTerjualTingggi(int[][] rekap, String[] namaMenu) {
        int terjualTertinggi = 0;
        int indeksMenu = 0;

        for (int i = 0; i < rekap.length; i++) {
            for (int j = 0; j < rekap[i].length; j++) {
                if (rekap[i][j] > terjualTertinggi) {
                    terjualTertinggi = rekap[i][j];
                    indeksMenu = i;
                }
            }
        }
        System.out.println("----- PENJUALAN TERTINGGI -----");
        System.out.printf("- Nama menu   : %s\n", namaMenu[indeksMenu]);
        System.out.printf("- Total jual  : %d\n", terjualTertinggi);
    }

    public static void tampilRata2(int[][] rekapData, String[] namaMenu) {
        double[] totalData = new double[5];

        System.out.println("---------- RATA-RATA ----------");
        for (int i = 0; i < rekapData.length; i++) {
            for (int j = 0; j < rekapData[i].length; j++) {
                totalData[i] += rekapData[i][j];
            }
            double rata2 = totalData[i] /= 7;
            System.out.printf("%-20s : %.2f\n", namaMenu[i], rata2);
        }
    }
}
