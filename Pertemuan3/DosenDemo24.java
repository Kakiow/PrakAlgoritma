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

        DataDosen24.dataSemuaDosen(arrayDosen);
        DataDosen24.jumlahDosenPerJenisKelamin(arrayDosen);
        DataDosen24.ratarataUsiaDosenPerJenisKelamin(arrayDosen);
        DataDosen24.infoDosenPalingTua(arrayDosen);
        DataDosen24.infoDosenPalingMuda(arrayDosen);
    }
}
