import java.text.NumberFormat; // mengimpor class untuk memformat angka menjadi mata uang
import java.util.Locale; // mengimpor class untuk menentukan aturan bahasa dan negara
import java.util.Scanner; // mengimpor class untuk bisa membaca input user

public class LatihanSoalC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumberFormat rupiah = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("id-ID")); // menambahkan formatter mata uang yang sesuai aturan indonesia

        int biayaPublikasi = 300000, dekorasi = 500000, konsumsiPanitia = 500000;
        int hadiah = 4000000, biayaLain = 500000, konsumsiPeserta = 25000;
        int honorarium = 75000, biayaPendaftaran = 50000, jumlahTim;
        double danaPolinema = 0.6, danaSponsorship, totalDana;

        System.out.print("Masukkan jumlah tim yang mengikuti : ");
        jumlahTim = input.nextInt();

        biayaPendaftaran *= jumlahTim;
        konsumsiPeserta *= jumlahTim * 3;
        honorarium *= jumlahTim;
        totalDana = biayaPublikasi + dekorasi + konsumsiPanitia + konsumsiPeserta + hadiah + biayaLain + honorarium;
        danaPolinema *= totalDana;
        danaSponsorship = totalDana - danaPolinema - biayaPendaftaran;

        System.out.println("Total dana yang dibbutuhkan adalah\t\t " + rupiah.format(totalDana));
        System.out.println("Dana dari polinema sebesar\t\t\t " + rupiah.format(danaPolinema));
        System.out.println("Dana sponsorship yang perlu dipenuhi adalah\t " + rupiah.format(danaSponsorship));
        input.close();
    }
}
