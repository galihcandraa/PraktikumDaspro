public class StudiKasus2Statis {
    
    public static void main(String[] args) {
        int panjang_tanah = 100, lebar_tanah = 50, luas_tanah;
        int jml_lingkaran = 2, diameter_lingkaran = 2, jari_jari;
        int jml_persegi = 1, sisi_persegi = 2, luas_persegi;
        double phi = 3.14, luas_lingkaran, luas_kolam, luas_rumput;

        luas_tanah = panjang_tanah * lebar_tanah;
        jari_jari = diameter_lingkaran / 2;
        luas_lingkaran = jml_lingkaran * (phi * jari_jari * jari_jari);
        luas_persegi = jml_persegi * (sisi_persegi * sisi_persegi);
        luas_kolam = luas_lingkaran + luas_persegi;
        luas_rumput = luas_tanah - luas_kolam;

        System.out.println("Luas tanah yang akan ditanami rumput adalah " + luas_rumput + " meter");
    }
}
