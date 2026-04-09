package Praktikum05;

import java.util.Scanner;

public class DosenMain24 {
    public static void main(String[] args) {
        Scanner okta = new Scanner(System.in);
        DataDosen24 data = new DataDosen24();

        System.out.println("Pilih menu ");
        System.out.println("1. tambah data ");
        System.out.println("2. tampilkan data ");
        System.out.println("3. Sorting ASC data dosen termuda ke dosen tertua ");
        System.out.println("4. Sorting DSC data dosen tertua ke dosen termuda ");
        int pilih = okta.nextInt();
        okta.nextLine();

        if (pilih == 1) {
            System.out.print("Kode: ");
            String kode = okta.nextLine();
            System.out.print("Nama: ");
            String nama = okta.nextLine();
            System.out.print("Jenis Kelamin: ");
            Boolean jenisKelamin = okta.nextBoolean();
            System.out.print("Usia: ");
            int usia = okta.nextInt();
            
            Dosen24 dsn = new Dosen24(kode, nama, jenisKelamin, usia);

            data.tambah(dsn);
        } else if (pilih == 2) {
            data.tampil();
        } else if (pilih == 3) {
            data.SortingASC();
            data.tampil();
        } else if (pilih == 4) {
            data.sortingDSC();
            data.tampil();
        }
    }
}
