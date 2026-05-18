package Pertemuan12;

public class QueueMahasiswa24 {
    String nim;
    String nama;
    String kelas;

    public QueueMahasiswa24(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
    }

    public void tampil() {
        System.out.println("Nim :" + nim);
        System.out.println("Nama :" + nama);
        System.out.println("Kelas :" + kelas);
    }
}
