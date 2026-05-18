package Pertemuan12;

public class Mahasiswa24 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa24() {

    }

    public Mahasiswa24(String nm, String nama, String kls, double ip) {
        this.nim = nm;
        this.nama = nama;
        this.kelas = kls;
        this.ipk = ip;
    }

    public void tampilInformasi() {
        System.out.println("Nim   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK   : " + ipk);
    }
}
