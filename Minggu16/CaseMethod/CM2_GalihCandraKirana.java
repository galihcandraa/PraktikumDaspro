package Minggu16.CaseMethod;

import java.util.Scanner;

public class CM2_GalihCandraKirana {
    static Scanner sc = new Scanner(System.in);
    static int index = 0;
    static String[][] dataPrestasi = new String[4][1];
    static int[] dataTahun = new int[1];

    public static void main(String[] args) {
        while (true) {
            System.out.println("=== PENCATATAN PRESTASI MAHASISWA ===");
            System.out.println("1. Tambah Data Prestasi");
            System.out.println("2. Tampilkan Semua Prestasi");
            System.out.println("3. Cari Data Prestasi");
            System.out.println("4. Hitung Jumlah Prestasi per Tingkat");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int menuPilihan = sc.nextInt();
            sc.nextLine();
            switch (menuPilihan) {
                case 1:
                    tambahData();
                    break;
                case 2:
                    tampilData();
                    break;
                case 3:
                    cariData();
                    break;
                case 4:
                    hitungNTampilJmlPrestasi();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan nomor tidak valid, ulangi!\n");
                    break;
            }
            if (menuPilihan == 5) {
                break;
            }
        }
    }

    public static void tambahData() {
        String[][] tempData = dataPrestasi;
        int[] tempTahun = dataTahun;
        dataPrestasi = new String[4][index + 1];
        dataTahun = new int[index + 1];

        for (int i = 0; i < tempData.length; i++) {
            for (int j = 0; j < tempData[i].length; j++) {
                dataPrestasi[i][j] = tempData[i][j];
            }
        }
        for (int i = 0; i < tempTahun.length; i++) {
            dataTahun[i] = tempTahun[i];
        }

        System.out.println("\n---- INPUT DATA PRESTASI ----");
        System.out.print("Masukkan nama mahasiswa: ");
        dataPrestasi[0][index] = sc.nextLine();
        System.out.print("Masukkan NIM mahasiswa: ");
        dataPrestasi[1][index] = sc.nextLine();
        System.out.print("Masukkan jenis prestasi: ");
        dataPrestasi[2][index] = sc.nextLine();
        while (true) {
            System.out.print("Masukkan tingkat prestasi (Lokal/Nasional/Internasional): ");
            dataPrestasi[3][index] = sc.nextLine();
            // validasi input
            if (!dataPrestasi[3][index].equalsIgnoreCase("Lokal")
                    && !dataPrestasi[3][index].equalsIgnoreCase("Nasional")
                    && !dataPrestasi[3][index].equalsIgnoreCase("Internasional")) {
                System.out.println("Ulangi! Tingkat hanya boleh diisi (Lokal, Nasional, Internasional).");
                continue;
            }
            break;
        }
        while (true) {
            System.out.print("Masukkan tahun prestasi (2015 - 2025): ");
            dataTahun[index] = sc.nextInt();
            sc.nextLine();
            if (dataTahun[index] < 2015 || dataTahun[index] > 2025) {
                System.out.println("Ulangi! Tahun harus antara 2015 dan 2025.");
                continue;
            }
            break;
        }
        System.out.println("Data prestasi berhasil ditambahkan.\n");
        index++;
    }

    public static void tampilData() {
        if (index == 0) {
            System.out.println("Belum ada data prestasi.\n");
        } else {
            System.out.println("\n---- TAMPIL DATA PRESTASI ----");
            System.out.printf("%-20s %-15s %-20s %-20s %-15s\n",
                    "Nama Mahasiswa", "NIM", "Jenis Prestasi", "Tingkat Prestasi", "Tahun Prestasi");

            for (int i = 0; i < index; i++) {
                System.out.printf("%-20s %-15s %-20s %-20s %-15d\n",
                        dataPrestasi[0][i],
                        dataPrestasi[1][i],
                        dataPrestasi[2][i],
                        dataPrestasi[3][i],
                        dataTahun[i]);
            }
            System.out.println();
        }
    }

    public static void cariData() {
        int pilihan;
        String cariJenis = "";
        int cariTahun = 0;
        boolean ketemu = false;

        System.out.println("\n---- CARI DATA PRESTASI ----");
        System.out.println("1. Cari berdasarkan tahun prestasi");
        System.out.println("2. Cari berdasarkan jenis prestasi");
        System.out.print("Pilihan nomor: ");
        pilihan = sc.nextInt();
        sc.nextLine();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan tahun: ");
                cariTahun = sc.nextInt();
                sc.nextLine();
                break;
            case 2:
                System.out.print("Masukkan jenis: ");
                cariJenis = sc.nextLine();
                break;
            default:
                System.out.println("Pilihan nomor tidak valid!");
                break;
        }

        for (int i = 0; i < index; i++) {
            if (cariTahun == dataTahun[i]) {
                if (!ketemu) {
                    System.out.println("Data ditemukan.\n");
                    System.out.printf("%-20s %-15s %-20s %-20s %-15s\n",
                            "Nama Mahasiswa", "NIM", "Jenis Prestasi", "Tingkat Prestasi", "Tahun Prestasi");
                    ketemu = true;
                }
                System.out.printf("%-20s %-15s %-20s %-20s %-15d\n",
                        dataPrestasi[0][i],
                        dataPrestasi[1][i],
                        dataPrestasi[2][i],
                        dataPrestasi[3][i],
                        dataTahun[i]);
            }

            if (cariJenis.equalsIgnoreCase(dataPrestasi[2][i])) {
                if (!ketemu) {
                    System.out.println("Data ditemukan.\n");
                    System.out.printf("%-20s %-15s %-20s %-20s %-15s\n",
                            "Nama Mahasiswa", "NIM", "Jenis Prestasi", "Tingkat Prestasi", "Tahun Prestasi");
                    ketemu = true;
                }
                System.out.printf("%-20s %-15s %-20s %-20s %-15d\n",
                        dataPrestasi[0][i],
                        dataPrestasi[1][i],
                        dataPrestasi[2][i],
                        dataPrestasi[3][i],
                        dataTahun[i]);
            }
        }

        if (!ketemu && (pilihan == 1 || pilihan == 2)) {
            System.out.println("Data prestasi tidak ditemukan.\n");
        }
        System.out.println();
    }

    public static void hitungNTampilJmlPrestasi() {
        int[] jmlPrestasi = { 0, 0, 0 };

        System.out.println("\n---- JUMLAH PRESTASI PER TINGKAT ----");
        for (int i = 0; i < index; i++) {
            if (dataPrestasi[3][i].equalsIgnoreCase("Lokal")) {
                jmlPrestasi[0]++;
            } else if (dataPrestasi[3][i].equalsIgnoreCase("Nasional")) {
                jmlPrestasi[1]++;
            } else if (dataPrestasi[3][i].equalsIgnoreCase("Internasional")) {
                jmlPrestasi[2]++;
            }
        }

        System.out.println("Lokal\t\t: " + jmlPrestasi[0]);
        System.out.println("Nasional\t: " + jmlPrestasi[1]);
        System.out.println("Internasional\t: " + jmlPrestasi[2] + "\n");
    }
}