package Praktikum05;

import java.util.Scanner;

public class MahasiswaDemo24 {
    public static void main(String[] args) {
        Scanner okta = new Scanner(System.in);
        MahasiswaBerprestasi24 list = new MahasiswaBerprestasi24();

        int Mhs = 5;
        
        for (int i = 0; i < Mhs; i++) {
            System.out.println("Data mahasiswa ke-" + (i + 1));
            System.out.print("Nama:");
            String nama = okta.nextLine();
            System.out.print("NIM:");
            String nim = okta.nextLine();
            System.out.print("IPK:");
            double ipk = okta.nextDouble();
            okta.nextLine();
            System.out.print("Kelas:");
            String kelas = okta.nextLine();

            Mahasiswa24 m = new Mahasiswa24(nim, nama, kelas, ipk);

            list.tambah(m);
        }


        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) :");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();
    }
}
