public class StudiKasus1Statis {

    public static void main(String[] args) {
        int gaji_pokok = 3000000, jml_anak = 3, tunjangan_anak = 150000;
        double gaji_bersih, dana_pensiun = 0.05;

        tunjangan_anak = jml_anak * tunjangan_anak;
        dana_pensiun = gaji_pokok * dana_pensiun;
        gaji_bersih = gaji_pokok + tunjangan_anak - dana_pensiun;

        System.out.println("Total gaji bersih Bu Jesi adalah " + gaji_bersih);
    }
}