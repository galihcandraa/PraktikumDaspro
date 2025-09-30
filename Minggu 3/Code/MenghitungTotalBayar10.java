import java.util.Scanner;
public class MenghitungTotalBayar10 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // int harga;
        double harga, potongan, jml_bayar, diskon = 0.15; //modifikasi

        System.out.println("Masukkan harga");
        // harga = input.nextInt();
        harga = input.nextDouble(); //modifikasi

        potongan = diskon * harga;
        jml_bayar = harga - potongan;

        System.out.println("Potongan harga anda adalah Rp. " + potongan);
        System.out.println("Jadi jumlah yang harus anda bayar adalah Rp. " + jml_bayar);
        input.close();
    }
}