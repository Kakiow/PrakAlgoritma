package Praktikum06;

public class Peminjaman24 {
    Mahasiswa24 mhs;
    Buku24 buku;
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;

    Peminjaman24 (Mahasiswa24 mhs, Buku24 buku, int lamaPinjam){
        this.mhs=mhs;
        this.buku=buku;
        this.lamaPinjam=lamaPinjam;
    }

    void hitungDenda(){
        terlambat = lamaPinjam - batasPinjam;
        if (terlambat < 0) {
            terlambat = 0;
        }
        denda = terlambat * 2000;
        //jawaban sesi 4 a, menambahkan checking kondisi dimana jika denda lebih dari 20000 akan di set menjadi 20000
        if (denda > 20000) {
            denda = 20000;
        }
    }

    
    void tampilPeminjaman(){
        System.out.println(mhs.nama + "|" + buku.judul + "|" + "Lama: " + lamaPinjam + "|" + "Terlambat: " + terlambat + "|" + "Denda: " + denda);
    }
}
