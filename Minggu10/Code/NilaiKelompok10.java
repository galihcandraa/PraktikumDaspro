package Minggu10.Code;
import java.util.Scanner;

public class NilaiKelompok10 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int i = 1, nilai, noKel = 0;
        float totalNilai, rataNilai, tertinggi = 0;

        while (i <= 6) {
            System.out.println("Kelompok " + i);

            totalNilai = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.print("Nilai dari Kelompok Penilai " + j + ": ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }
            rataNilai = totalNilai / 5;
            if (rataNilai > tertinggi) {
                tertinggi = rataNilai;
                noKel = i;
            }
            System.out.println("Kelompok " + i + ": Nilai rata-rata: " + rataNilai);
            i++;
        }
        System.out.println("Rata-rata nilai tertinggi diraih oleh kelompok " + noKel + " dengan nilai sebesar " + tertinggi);
        
        sc.close();
    }
}
