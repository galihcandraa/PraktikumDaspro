package Minggu12.Code;

import java.util.Scanner;

public class BioskopWithScanner10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom;
        String nama, next = "";
        String[][] penonton = new String[4][2];

        while (true) {
            // 2
            System.out.println("\n=== Penonton Bioskop ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampillkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            int menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                do {
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();

                    while (true) {
                        System.out.print("Masukkan baris (1-4): ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        // 3
                        if (baris < 1 || baris > 4) {
                            System.out.println("Baris kursi tidak tersedia!");
                            continue;
                        }
                        if (kolom < 1 || kolom > 2) {
                            System.out.println("Kolom kursi tidak tersedia!");
                            continue;
                        }

                        // 4
                        if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi sudah terisi!");
                            System.out.println("Silahkan pilih baris atau kolom lain\n");
                            continue;
                        }

                        penonton[baris - 1][kolom - 1] = nama;
                        break;
                    }
                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = sc.nextLine();
                    if (next.equalsIgnoreCase("n")) {
                        continue;
                    }

                } while (next.equalsIgnoreCase("y"));
            }

            if (menu == 2) {
                System.out.println();
                for (int i = 0; i < penonton.length; i++) {
                    System.out.println("Penonton baris ke-" + (i + 1));
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] != null) {
                            System.out.println("   " + (j + 1) + ". " + penonton[i][j]);
                        } else {
                            System.out.println("   " + (j + 1) + ". " + "***");
                        }
                    }
                }
            }

            if (menu == 3) {
                System.out.println("=== Program Selesai ===");
                break;
            }
        }
        sc.close();
    }
}
