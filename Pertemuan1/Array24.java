package Pertemuan1;

import java.util.Scanner;

public class Array24 {

    public static void main(String[] args) {
        Scanner okta = new Scanner(System.in);

        String[] Matkul24 = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving", 
        "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"};

        int[] sks24 = {2,2,2,2,2,2,3,2};

        double[] angka24 = new double[Matkul24.length];
        String[] huruf24 = new String[Matkul24.length];
        double[] bobot24 = new double[Matkul24.length];

        double totalnil24 = 0;
        double totalsks24 = 0;

        System.out.println("=======================================");
        System.out.println("Program menghitung IP Semester");
        System.out.println("=======================================");

        for (int i24 = 0; i24 < Matkul24.length; i24++) {
            System.out.print("Masukkan nilai Angka untuk MK " + Matkul24[i24] + ": ");
            angka24[i24] = okta.nextDouble();

            if (angka24[i24] > 80 && angka24[i24] <= 100) {
                huruf24[i24] = "A";
                bobot24[i24] = 4;
            } else if (angka24[i24] > 73 && angka24[i24] <= 80) {
                huruf24[i24] = "B+";
                bobot24[i24] = 3.5;
            } else if (angka24[i24] > 65 && angka24[i24] <= 73) {
                huruf24[i24] = "B";
                bobot24[i24] = 3;
            } else if (angka24[i24] > 60 && angka24[i24] <= 65) {
                huruf24[i24] = "C+";
                bobot24[i24] = 2.5;
            } else if (angka24[i24] > 50 && angka24[i24] <= 160) {
                huruf24[i24] = "C";
                bobot24[i24] = 2;
            } else if (angka24[i24] > 39 && angka24[i24] <= 50) {
                huruf24[i24] = "D";
                bobot24[i24] = 1;
            } else {
                huruf24[i24] = "E";
                bobot24[i24] = 0;
            }

            totalnil24 += (bobot24[i24] * sks24[i24]);
            totalsks24 += sks24[i24];
        }

        System.out.println("=====================================");
        System.out.println("hasil konversi nilai");
        System.out.println("=====================================");
        System.out.printf("%-40s %-15s %-15s %-15s\n", "MK", "Nilai angka", "Nilai huruf", "Bobot Nilai");

        for (int i24 = 0; i24 < Matkul24.length; i24++) {
            System.out.printf("%-40s %-15f %-15s %-15f\n", Matkul24[i24], angka24[i24], huruf24[i24], bobot24[i24]);
        }

        double IP24 = totalnil24 / totalsks24;
        System.out.println("============================");
        System.out.println("IP : " +IP24);
    }
}
