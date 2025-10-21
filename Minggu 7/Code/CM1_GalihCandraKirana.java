import java.util.Scanner;

public class CM1_GalihCandraKirana {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nama, nim, prodi, jurusan, kelas;
        int Nil_UTS_Matkul1, Nil_UAS_Matkul1, Nil_Tugas_Matkul1;
        int Nil_UTS_Matkul2, Nil_UAS_Matkul2, Nil_Tugas_Matkul2;

        // Input Data
        System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.print("Masukkan Nama\t : ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM\t : ");
        nim = sc.nextLine();
        System.out.print("Masukkan Prodi\t : ");
        prodi = sc.nextLine();
        System.out.print("Masukkan Jurusan : ");
        jurusan = sc.nextLine();
        System.out.print("Masukkan Kelas\t : ");
        kelas = sc.nextLine();
        System.out.println();

        // Input Matkul 1
        System.out.println("--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS\t: ");
        Nil_UTS_Matkul1 = sc.nextInt();
        System.out.print("Nilai UAS\t: ");
        Nil_UAS_Matkul1 = sc.nextInt();
        System.out.print("Nilai Tugas\t: ");
        Nil_Tugas_Matkul1 = sc.nextInt();
        System.out.println();

        // Input Matkul 2
        System.out.println("--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS\t : ");
        Nil_UTS_Matkul2 = sc.nextInt();
        System.out.print("Nilai UAS\t : ");
        Nil_UAS_Matkul2 = sc.nextInt();
        System.out.print("Nilai Tugas\t : ");
        Nil_Tugas_Matkul2 = sc.nextInt();
        System.out.println();
        System.out.println();

        // Algoritma penghitungan
        // Status Matkul 1
        double nilaiAkhirMatkul1 = (Nil_UTS_Matkul1 * 0.3) + (Nil_UAS_Matkul1 * 0.4) + (Nil_Tugas_Matkul1 * 0.3);        
        String statusMatkul1;
        statusMatkul1 = (nilaiAkhirMatkul1 >= 60) ? "LULUS" : "TIDAK LULUS";

        // Status Matkul 2
        double nilaiAkhirMatkul2 = (Nil_UTS_Matkul2 * 0.3) + (Nil_UAS_Matkul2 * 0.4) + (Nil_Tugas_Matkul2 * 0.3);
        String statusMatkul2;
        statusMatkul2 = (nilaiAkhirMatkul2 >= 60) ? "LULUS" : "TIDAK LULUS";

        // Rata-rata Nilai Akhir
        double meanNilAkhir = (nilaiAkhirMatkul1 + nilaiAkhirMatkul2) / 2;
        String FormatMean = String.format("%.2f", meanNilAkhir);

        // Nilai Huruf Matkul 1
        String nilaiHurufMatkul1;
        nilaiHurufMatkul1 = (nilaiAkhirMatkul1 > 80 && nilaiAkhirMatkul1 <= 100) ? "A" : 
                            (nilaiAkhirMatkul1 > 73 && nilaiAkhirMatkul1 <= 80) ? "B+" : 
                            (nilaiAkhirMatkul1 > 65 && nilaiAkhirMatkul1 <= 73) ? "B" : 
                            (nilaiAkhirMatkul1 > 60 && nilaiAkhirMatkul1 <= 65) ? "C+" : 
                            (nilaiAkhirMatkul1 > 50 && nilaiAkhirMatkul1 <= 60) ? "C" : 
                            (nilaiAkhirMatkul1 > 39 && nilaiAkhirMatkul1 <= 50) ? "D" : 
                            (nilaiAkhirMatkul1 >= 0 && nilaiAkhirMatkul1 <= 39) ? "E": "Nilai Tidak Valid";

        // Nilai Huruf Matkul 2
        String nilaiHurufMatkul2;
        nilaiHurufMatkul2 = (nilaiAkhirMatkul2 > 80 && nilaiAkhirMatkul2 <= 100) ? "A" : 
                            (nilaiAkhirMatkul2 > 73 && nilaiAkhirMatkul2 <= 80) ? "B+" : 
                            (nilaiAkhirMatkul2 > 65 && nilaiAkhirMatkul2 <= 73) ? "B" : 
                            (nilaiAkhirMatkul2 > 60 && nilaiAkhirMatkul2 <= 65) ? "C+" : 
                            (nilaiAkhirMatkul2 > 50 && nilaiAkhirMatkul2 <= 60) ? "C" : 
                            (nilaiAkhirMatkul2 > 39 && nilaiAkhirMatkul2 <= 50) ? "D" :
                            (nilaiAkhirMatkul2 >= 0 && nilaiAkhirMatkul2 <= 39) ? "E" : "Nilai Tidak Valid";

        // Status Kelulusan
        String finalStatus;
        if (statusMatkul1.equals("LULUS") && statusMatkul2.equals("LULUS")) {
            if (meanNilAkhir >= 70)
                finalStatus = "LULUS";
            else
                finalStatus = "TIDAK LULUS (Rata-rata < 70)";
        } else {
            finalStatus = "TIDAK LULUS (Salah satu Mata Kuliah tidak lulus)";
        }        

        // Output
        System.out.println("=============== HASIL PENILAIAN AKADEMIK ===============");
        System.out.println("Nama\t: " + nama);
        System.out.println("NIM\t: " + nim);
        System.out.println("Prodi\t: " + prodi);
        System.out.println("Jurusan\t: " + jurusan);
        System.out.println("Kelas\t: " + kelas);
        System.out.println();

        System.out.println("Mata Kuliah \t\t UTS\t UAS\t Tugas\t Nilai Akhir\t Nilai Huruf\t Status");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("Algoritma Pemrograman\t " + Nil_UTS_Matkul1 + "\t " + Nil_UAS_Matkul1 + "\t " + Nil_Tugas_Matkul1 + "\t " + nilaiAkhirMatkul1 + "\t\t " + nilaiHurufMatkul1 + "\t\t "+ statusMatkul1);
        System.out.println("Struktur Data\t\t " + Nil_UTS_Matkul2 + "\t " + Nil_UAS_Matkul2 + "\t " + Nil_Tugas_Matkul2 + "\t " + nilaiAkhirMatkul2 + "\t\t " + nilaiHurufMatkul2 + "\t\t " + statusMatkul2);
        System.out.println();
        System.out.println("Rata-rata Nilai Akhir\t: " + FormatMean);
        System.out.println("Status Semester\t\t: " + finalStatus);

        sc.close();
    }
}
