// Nama: Galih Candra Kirana
// No Absen: 10
// NIM: 254107020080

package Minggu13;

public class Kuis10Galih {
    public static void main(String[] args) {
        int terjualSenin10 = 0, terjualSabtu10 = 0, terjualMinggu10 = 0, penjualanTertinggi10 = 0;
        int penjualanReguler10 = 0, penjualanDolby10 = 0, penjualanIMAX10 = 0, penjualanPremiere10 = 0, penjualanLuxury10 = 0;
        double rata2Sabtu10 = 0, totalPendapatan10;
        String namaTertinggi10 = "", hariTertinggi10 = "";

        System.out.println("===== PENJUALAN TIKET BIOSKOP =====");

        int[][] tipeStudio10 = {
                { 12, 18, 14 },
                { 9, 11, 10 },
                { 8, 12, 15 },
                { 7, 9, 8 },
                { 5, 7, 6 }
        };

        for (int i = 0; i < tipeStudio10.length; i++) {
            terjualSenin10 += tipeStudio10[i][0];
            terjualSabtu10 += tipeStudio10[i][1];
            terjualMinggu10 += tipeStudio10[i][2];

            penjualanReguler10 = 0;
            penjualanDolby10 = 0;
            penjualanIMAX10 = 0;
            penjualanPremiere10 = 0;
            penjualanLuxury10 = 0;
            
            for (int j = 0; j < tipeStudio10[i].length; j++) {
                penjualanReguler10 += tipeStudio10[0][j];
                penjualanDolby10 += tipeStudio10[1][j];
                penjualanIMAX10 += tipeStudio10[2][j];
                penjualanPremiere10 += tipeStudio10[3][j];
                penjualanLuxury10 += tipeStudio10[4][j];

                if (tipeStudio10[i][j] > penjualanTertinggi10) {
                    penjualanTertinggi10 = tipeStudio10[i][j];
                    if (tipeStudio10[i][j] == tipeStudio10[0][j] || tipeStudio10[i][j] == tipeStudio10[i][0]) {
                        namaTertinggi10 = "Reguler";
                        hariTertinggi10 = "Senin";
                    } else if (tipeStudio10[i][j] == tipeStudio10[1][j] || tipeStudio10[i][j] == tipeStudio10[i][1]) {
                        namaTertinggi10 = "Dolby Atmos";
                        hariTertinggi10 = "Sabtu";
                    } else if (tipeStudio10[i][j] == tipeStudio10[2][j] || tipeStudio10[i][j] == tipeStudio10[i][2]) {
                        namaTertinggi10 = "IMAX";
                        hariTertinggi10 = "Minggu";
                    } else if (tipeStudio10[i][j] == tipeStudio10[3][j]) {
                        namaTertinggi10 = "Premiere";
                    } else {
                        namaTertinggi10 = "Luxury Suite";
                    }
                }
            }
        }
        rata2Sabtu10 = (double)terjualSabtu10 / 5;
        totalPendapatan10 = (penjualanReguler10 * 40000) + (penjualanDolby10 * 40000) + (penjualanIMAX10 * 70000) + (penjualanPremiere10 * 70000) + (penjualanLuxury10 * 70000);
        System.out.println("Total tiket yang terjual hari Senin: " + terjualSenin10);
        System.out.println("Total tiket yang terjual hari Sabtu: " + terjualSabtu10);
        System.out.println("Total tiket yang terjual hari Minggu: " + terjualMinggu10);
        System.out.println("Rata-rata penjualan tiket hari Sabtu: " + rata2Sabtu10);
        System.out.println("Total pemasukan bioskop dalam 3 hari: Rp. " + totalPendapatan10);
        System.out.println("Penjualan tertinggi diraih oleh studio " + namaTertinggi10 + " pada hari " + hariTertinggi10 + " dengan total penjualan sebanyak " + penjualanTertinggi10 + " tiket");
        System.out.println("========= PROGRAM SELESAI =========");
    }
}
