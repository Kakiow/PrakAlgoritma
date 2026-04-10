package Praktikum06;

public class Mahasiswa24 {
    String nim;
    String nama;
    String prodi;

    Mahasiswa24 (String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    void tampilMahasiswa(){
        System.out.print("Nim: " + nim + "|");
        System.out.print("Nama: " + nama + "|");
        System.out.print("Prodi: " + prodi);
        System.out.println();
    }
}
