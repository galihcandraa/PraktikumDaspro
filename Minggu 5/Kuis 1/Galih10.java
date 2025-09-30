import java.util.Scanner;
public class Galih10 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int biayaKos10 = 1000000, biayaInternet10 = 200000;
        int biayaMakan10, biayaTransport10, jumlahHari10;
        int totalPengeluaranInput10, totalPengeluaran10, meanPengeluaran10, selisihUang10;

        System.out.print("Masukkan biaya makan per hari : ");
        biayaMakan10 = sc.nextInt();

        System.out.print("Masukkan biaya transportasi per hari : ");
        biayaTransport10 = sc.nextInt();

        System.out.print("Masukkan jumlah hari pada bulan ini : ");
        jumlahHari10 = sc.nextInt();

        biayaMakan10 *= jumlahHari10;
        biayaTransport10 *= jumlahHari10;
        totalPengeluaranInput10 = biayaMakan10 + biayaTransport10;
        totalPengeluaran10 = biayaKos10 + biayaInternet10 + biayaMakan10 + biayaTransport10;
        meanPengeluaran10 = totalPengeluaran10/ jumlahHari10;
        selisihUang10 = 3000000 - totalPengeluaran10;

        System.out.println("Total pengeluaran makan dan transportasi adalah Rp. " + totalPengeluaranInput10);
        System.out.println("Total pengeluaran bulanan adalah Rp. " + totalPengeluaran10);
        System.out.println("Rata-rata pengeluaran perhari adalah Rp. " + meanPengeluaran10);
        System.out.println("Selisih uang saku dengan pengeluaran bulanan adalah Rp. " + selisihUang10);
        sc.close();
    }
}
