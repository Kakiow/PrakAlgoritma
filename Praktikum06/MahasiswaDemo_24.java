package Praktikum06;

import java.util.Scanner;

public class MahasiswaDemo_24 {
    public static void main(String[] args) {
        Scanner okta = new Scanner(System.in);
        System.out.println("Jumlah mahasiswa");
        int jumMhs=okta.nextInt();
        okta.nextLine();

        MahasiswaBerprestasi_24 list = new MahasiswaBerprestasi_24(jumMhs);

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" +(i + 1));
            System.out.print("NIM     :");
            String nim = okta.nextLine();
            System.out.print("Nama    :");
            String nama = okta.nextLine();
            System.out.print("Kelas   :");
            String kelas = okta.nextLine();
            System.out.print("IPK     :");
            String ip = okta.nextLine();
            Double ipk = Double.parseDouble(ip);
            System.out.println("------------------------------");
            list.tambah (new Mahasiswa_24(nim, nama, kelas, ipk));
        }

        list.tampil();
        System.out.println("-------------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("-------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.println("IPK: ");
        double cari = okta.nextDouble();
        System.out.println("-------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("--------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs-1);
        int pss2= (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
    }
}
