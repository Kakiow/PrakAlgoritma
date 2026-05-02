package Praktikum06;

public class Mahasiswa24 {
    String nim;
    String nama;
    String prodi;
    //menambahkan atribut isCanceled 
    Boolean isCanceled;

    Mahasiswa24 (String nim, String nama, String prodi, Boolean isCanceled){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        //menambahkan atribut isCanceled di construktor
        this.isCanceled = isCanceled;
    }

    void tampilMahasiswa(){
        System.out.print("Nim: " + nim + "|");
        System.out.print("Nama: " + nama + "|");
        System.out.print("Prodi: " + prodi);
        System.out.println();
    }
}
