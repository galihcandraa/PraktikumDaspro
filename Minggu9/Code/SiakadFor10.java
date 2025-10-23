package Minggu9.Code;
import java.util.Scanner;
public class SiakadFor10 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int lulus = 0, tidakLulus = 0;
        double nilai, tertinggi = 0, terendah = 100;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            } else if (nilai < terendah) {
                terendah = nilai;
            }

            if (nilai >= 60) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa yang lulus ada " + lulus + " orang");
        System.out.println("Jumlah mahasiswa yang tidak lulus ada " + tidakLulus + " orang");
        sc.close();
    }
}