package Pertemuan1;

public class Fungsi24 {
    
    public static void main(String[] args) {
        
        int[][] bunga24 = {{10,5,15,7}, {6,11,9,12}, {2,10,10,5}, {5,7,12,9}};

        int[] harga24 = {75000, 50000, 60000, 10000};

        String[] toko24 = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};

        output24 (bunga24, harga24, toko24);
    }

    public static void output24(int[][] bunga24, int[] harga24, String[] toko24) {
        for (int i24 = 0; i24 < bunga24.length; i24++) {
            int pendapatan24 = 0;

            for (int j24 = 0; j24 < bunga24.length; j24++) {
                pendapatan24 = pendapatan24 + (bunga24[i24][j24] * harga24[j24]);
            }

            String status24 = "";

            if (pendapatan24 >1500000) {
                status24 = "Sangat Baik";
            } else {
                status24 = "Perlu evaluasi";
            }

            System.out.println(toko24[i24] + "\t\t" + pendapatan24 + "\t\t" + status24);
        }
    }
}
