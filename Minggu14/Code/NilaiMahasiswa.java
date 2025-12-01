package Minggu14.Code;
import java.util.Scanner;
public class NilaiMahasiswa {
    static Scanner sc = new Scanner(System.in);
    static int[] mhs;
    static int nMhs = 0;
    public static void main(String[] args) {
        System.out.println("===== PROGRAM NILAI MAHASISWA =====");
        System.out.print("Masukkan jumlah mahasiswa: ");
        nMhs = sc.nextInt();

        System.out.println("========== INPUT ==========");
        mhs = isianArray();
        System.out.println("========== OUTPUT =========");
        tampilArray(mhs);
        System.out.println("Total nilai seluruh mahasiswa: " + hitTot(mhs));
        System.out.println("========= PROGRAM SELESAI =========");
    }

    public static int[] isianArray() {
        int[] tempMhs = new int[nMhs];
        for (int i = 0; i < tempMhs.length; i++) {
            System.out.print("- Input nilai mahasiswa ke " + (i + 1) + ": ");
            tempMhs[i] = sc.nextInt();
        }
        return tempMhs;
    }

    public static void tampilArray(int[] nilaiMhs) {
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("- Nilai mahasiswa ke " + (i + 1) + ": " + nilaiMhs[i]);
        }
    }

    public static int hitTot(int[] nilaiMhs) {
        int totalNilai = 0;
        for (int i = 0; i < mhs.length; i++) {
            totalNilai += nilaiMhs[i];
        }
        return totalNilai;
    }
}
