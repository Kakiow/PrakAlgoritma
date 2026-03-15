package Pertemuan3;

import java.util.Scanner;

public class DosenDemo24 {
    public static void main(String[] args) {
        Scanner okta = new Scanner(System.in);
        String nama,kode,jeniskel;
        int usia;
        boolean JenisKelamin;

        Dosen24[] arrayDosen = new Dosen24[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Dosen Ke- " + (i + 1));
            System.out.print("Kode                 :");
            kode = okta.nextLine();
            System.out.print("Nama                 :");
            nama = okta.nextLine();
            System.out.print("Jenis Kelamin        :");
            jeniskel = okta.nextLine();
            JenisKelamin = jeniskel.equalsIgnoreCase("Pria");
            System.out.print("Usia                 :");
            usia= okta.nextInt();
            okta.nextLine();

            arrayDosen[i] = new Dosen24(kode, nama, JenisKelamin, usia);
        }

        int i = 1;
        for (Dosen24 data : arrayDosen) {
            System.out.println("Data Dosen Ke-" + i);
            System.out.println("Kode                 :" + data.kode);
            System.out.println("Nama                 :" + data.nama);
            System.out.println("Jenis Kelamin        :" + (data.JenisKelamin ? "Pria" : "wanita"));
            System.out.println("Usia                 :" + data.usia);
            i++;
        }
    }
}
