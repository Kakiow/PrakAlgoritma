package Jobsheet16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NilaiMain24 {
    List<Mahasiswas24> mhs = new ArrayList<>();
    List<MataKuliah24> mk = new ArrayList<>();
    List<Nilai24> nilaimhs = new ArrayList<>();
    Scanner okta = new Scanner(System.in);

    public void input() {
        mhs.add(new Mahasiswas24("20001", "Thalhah", "021xxx"));
        mhs.add(new Mahasiswas24("20002", "Zubair", "021xxx"));
        mhs.add(new Mahasiswas24("20003", "Abdur-Rahman", "021xxx"));
        mhs.add(new Mahasiswas24("20004", "Sa'ad", "021xxx"));
        mhs.add(new Mahasiswas24("20005", "Sa'id", "021xxx"));
        mhs.add(new Mahasiswas24("20006", "Ubaidah", "021xxx"));

        mk.add(new MataKuliah24("00001", "Internet of Things", 3));
        mk.add(new MataKuliah24("00002", "Algoritma dan Struktur Data", 2));
        mk.add(new MataKuliah24("00003", "Algoritma dan Pemrograman", 2));
        mk.add(new MataKuliah24("00004", "Praktikum Algoritma dan Struktur Data", 3));
        mk.add(new MataKuliah24("00005", "Praktikum Algoritma dan Pemrograman", 3));
    }

    public void menu() {
        System.out.println("Masukkan data");
        System.out.print("Kode     : ");
        String Kode = okta.next();
        System.out.print("Nilai    : ");
        double nilai = okta.nextDouble();

        System.out.println("\nDAFTAR MAHASISWA");
        System.out.println("*****************************************");
        for (Mahasiswas24 mh : mhs) {
            System.out.printf("%-7s %-15s %-10s\n", mh.nim, mh.nama, mh.telf);
        }
        System.out.print("Pilih mahasiswa by nim: ");
        String nim = okta.next();

        System.out.println("\nDAFTAR MATA KULIAH");
        System.out.println("*****************************************");
        System.out.printf("%-7s %-40s %-3s\n", "Kode", "Mata Kuliah", "SKS");
        for (MataKuliah24 mkh : mk) {
            System.out.printf("%-7s %-40s %-3s\n", mkh.kode, mkh.matkul, mkh.sks);
        }
        System.out.print("Pilih MK by kode: ");
        String mkh = okta.next();

        Mahasiswas24 mhsPilih = null;
        for (Mahasiswas24 pilih : mhs) {
            if (pilih.nim.equals(nim)) {
                mhsPilih = pilih;
                break;
            }
        }

        MataKuliah24 mkPilih = null;
        for (MataKuliah24 pilih : mk) {
            if (pilih.kode.equals(mkh)) {
                mkPilih = pilih;
                break;
            }
        }

        if (mhsPilih != null && mkPilih != null) {
            nilaimhs.add(new Nilai24(mhsPilih, mkPilih, nilai));
        } 
    }

    public void tampilNilai() {
        System.out.println("\nDAFTAR NILAI MAHASISWA");
        System.out.println("******************************************");
        System.out.printf("%-7s %-15s %-40s %-5s %-5s\n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
        for (Nilai24 nil : nilaimhs) {
            System.out.printf("%-7s %-15s %-40s %-5d %-5.2f\n", nil.mhs.nim, nil.mhs.nama, nil.mk.matkul, nil.mk.sks, nil.nilai);
        }
    }

    public void cariNilai() {
        tampilNilai();
        System.out.println("Masukkan data mahasiswa[nim]: ");
        String cari = okta.next();

        System.out.printf("%-7s %-15s %-40s %-5s %-5s\n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
        int total = 0;
        boolean temu = false;

        for (Nilai24 nil : nilaimhs) {
            if (nil.mhs.nim.equals(cari)) {
                System.out.printf("%-7s %-15s %-40s %-5d %-5.2f\n", nil.mhs.nim, nil.mhs.nama, nil.mk.matkul, nil.mk.sks, nil.nilai);
                total += nil.mk.sks;
                temu = true;
            }
        }
        if (temu) {
            System.out.println("Total SKS " + total + " telah diambil");
        }
    }

    public void urutNilai() {
        int nil = nilaimhs.size();
        for (int i = 0; i < nil - 1; i++) {
            for (int j = 0; j < nil - i - 1; j++) {
                if (nilaimhs.get(j).nilai > nilaimhs.get(j + 1).nilai) {
                    Nilai24 temp = nilaimhs.get(j);
                    nilaimhs.set(j, nilaimhs.get(j + 1));
                    nilaimhs.set(j + 1, temp);
                }
            }
        }
        tampilNilai();
    }

    public static void main(String[] args) {
        NilaiMain24 nil = new NilaiMain24();
        nil.input();
        int pilih;

        do {
            System.out.println("\n**********************************************");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("**********************************************");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Keluar");
            System.out.println("**********************************************");
            System.out.print("Pilih: ");
            pilih = nil.okta.nextInt();

            switch (pilih) {
                case 1:
                    nil.input();
                    break;
                case 2:
                    nil.tampilNilai();
                    break;
                case 3:
                    nil.cariNilai();
                    break;
                case 4:
                    nil.urutNilai();
                    break;
                case 5:
                    break;
                default:
                    break;
            }
        } while (pilih != 5); 
    }
}
