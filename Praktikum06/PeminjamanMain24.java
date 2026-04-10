package Praktikum06;

import java.util.Scanner;

public class PeminjamanMain24 {
    public static void main(String[] args) {
        Scanner okta = new Scanner(System.in);

        Mahasiswa24[] mhs = new Mahasiswa24[3];
        mhs[0] = new Mahasiswa24("22001", "Andi", "Teknik Informatika");
        mhs[1] = new Mahasiswa24("22002", "Budi", "Teknik Informatika");
        mhs[2] = new Mahasiswa24("22003", "Citra", "Sistem Informasi Bisnis");

        Buku24[] Databuku = new Buku24[4];
        Databuku[0] = new Buku24("B001", "Algoritma", 2020);
        Databuku[1] = new Buku24("B002", "Basis Data", 2019);
        Databuku[2] = new Buku24("B003", "Pemrograman", 2021);
        Databuku[3] = new Buku24("B004", "Fisika", 2024);

        Peminjaman24[] Pinjam = new Peminjaman24[5];
        Pinjam[0] = new Peminjaman24(mhs[0], Databuku[0], 7);
        Pinjam[1] = new Peminjaman24(mhs[1], Databuku[1], 3);
        Pinjam[2] = new Peminjaman24(mhs[2], Databuku[2], 10);
        Pinjam[3] = new Peminjaman24(mhs[2], Databuku[3], 6);
        Pinjam[4] = new Peminjaman24(mhs[0], Databuku[1], 4);

        int pilihan = 1;

        while (pilihan != 0) {
            System.out.println("=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.println("Pilih: ");
            pilihan = okta.nextInt();
            okta.nextLine();
            switch (pilihan) {
                case 1:
                    for (int i = 0; i < mhs.length; i++) {
                        mhs[i].tampilMahasiswa();
                    }
                    break;
                    
                case 2:
                    for (int i = 0; i < Databuku.length; i++) {
                        Databuku[i].tampilBuku();
                    }
                    break;
                
                case 3:
                    for (int i = 0; i < Pinjam.length; i++) {
                        Pinjam[i].hitungDenda();
                    }
                    for (int i = 0; i < Pinjam.length; i++) {
                        Pinjam[i].tampilPeminjaman();
                    }
                    break;

                case 4:
                    for (int i = 0; i < Pinjam.length; i++) {
                        Pinjam[i].hitungDenda();
                    }
            
                    for (int i = 1; i < Pinjam.length; i++) {
                    Peminjaman24 temp = Pinjam[i];
                    int j=i;
                    while (j>0 && Pinjam[j-1].denda<temp.denda) {
                    Pinjam[j]=Pinjam[j-1];
                j--;
            }
            Pinjam[j]=temp;
        }

            for (int i = 0; i < Pinjam.length; i++) {
                        Pinjam[i].tampilPeminjaman();
                }
                break;

                case 5:
                    System.out.println("Masukkan NIM: ");
                    String NimMhs = okta.nextLine();

                    for (int i = 0; i < Pinjam.length; i++) {
                        Pinjam[i].hitungDenda();
                    }

                    for (int i = 0; i < Pinjam.length; i++) {
                        if (Pinjam[i].mhs.nim.equals(NimMhs)) {
                            Pinjam[i].tampilPeminjaman();
                        }
                    }
                    break;

                default:
                    break;
            }
        }
    }
}
