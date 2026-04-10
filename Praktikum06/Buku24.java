package Praktikum06;

public class Buku24 {
    String kodeBuku;
    String judul;
    int tahunTerbit;

    Buku24 (String kode, String judul, int tahun){
        kodeBuku = kode;
        this.judul = judul;
        tahunTerbit = tahun;
    }

    void tampilBuku(){
        System.out.print("Kode Buku: " + kodeBuku + "|");
        System.out.print("Judul: " + judul + "|");
        System.out.print("Tahun Terbit: " + tahunTerbit);
        System.out.println();
    }
}
