package Pertemuan1;

import java.util.Scanner;

public class Pemilihan24 {
    
    public static void main(String[] args) {
        Scanner okta = new Scanner(System.in);

        double Ntugas24, Nkuis24, NilaiUts24, NilaiUas24;
        double nilai24, Setara24;
        String huruf24;

        System.out.println("Program Menghitung Nilai Akhir");

        System.out.println("=========================");

        System.out.print("Masukkan Nilai Tugas: ");
        Ntugas24 = okta.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        Nkuis24 = okta.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        NilaiUts24 = okta.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        NilaiUas24 = okta.nextDouble();

        System.out.println("==================");

        System.out.println("==================");

        if (Ntugas24 >= 0 && Ntugas24 <= 100 && Nkuis24 >= 0 && Nkuis24 <= 100 && NilaiUts24 >= 0 && NilaiUts24 <= 100 && 
            NilaiUas24 >= 0 && NilaiUas24 <= 100) {

            nilai24 = (0.2 * Ntugas24) + (0.2 * Nkuis24) + (0.3 * NilaiUts24) + (0.4 * NilaiUas24);

            if (nilai24 > 80 && nilai24 <= 100) {
            huruf24 = "A";
            Setara24 = 4;
        } else if (nilai24 > 73 && nilai24 <= 80) {
            huruf24 = "B+";
            Setara24 = 3.5;
        } else if (nilai24 > 65 && nilai24 <= 73) {
            huruf24 = "B";
            Setara24 = 3;
        } else if (nilai24 > 60 && nilai24 <= 65) {
            huruf24 = "C+";
            Setara24 = 2.5;
        } else if (nilai24 > 50 && nilai24 <= 60) {
            huruf24 = "C";
            Setara24 = 2;
        } else if (nilai24 > 39 && nilai24 <= 50) {
            huruf24 = "D";
            Setara24 = 1;
        } else {
            huruf24 = "E";
            Setara24 = 0;
        }

        System.out.println("nilai akhir: " + nilai24);
        System.out.println("nilai huruf: " + huruf24);

        System.out.println("====================");
        System.out.println("====================");
           
        } else {
            System.out.println("Nilai tidak valid");
        }

        

        System.out.println("SELAMAT ANDA LULUS");
    }
}
