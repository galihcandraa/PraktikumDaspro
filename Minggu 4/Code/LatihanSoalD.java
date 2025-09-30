import java.util.Scanner;

public class LatihanSoalD {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int biayaCetak = 200, jumlahHal, hargaJilid = 20000;
        int beratKertas, beratJilid = 250, beratPacking = 300, totBerat;
        double ongkir = 15000, totHarga, totBeratKg;

        System.out.println("Masukkan jumlah halaman yang ingin dicetak : ");
        jumlahHal = input.nextInt();

        beratKertas = (jumlahHal / 2) * 3;
        totBerat = beratKertas + beratJilid + beratPacking;
        totBeratKg = totBerat / 1000.0;
        ongkir = Math.ceil(totBeratKg) * ongkir;
        totHarga = (biayaCetak * jumlahHal) + hargaJilid + ongkir;

        System.out.println("Jumlah yang harus anda bayar adalah Rp. " + totHarga);
        input.close();
    }   
}
