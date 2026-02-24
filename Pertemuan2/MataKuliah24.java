package Pertemuan2;

public class MataKuliah24 {
    String KodeMk;
    String nama;
    int sks, jumlahjam;

    public MataKuliah24() {

    }

    public MataKuliah24(String kodeMatkul, String nama, int sks, int jumlahjam) {
        KodeMk = kodeMatkul;
        this.nama = nama;
        this.sks = sks;
        this.jumlahjam = jumlahjam;
    }

    void tampilInformasi() {
        System.out.println("Kode Matkul: " + KodeMk);
        System.out.println("Nama: " + nama);
        System.out.println("Sks: " + sks);
        System.out.println("Jumlah jam: " + jumlahjam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
    }

    void tambahjam(int jam) {
        jumlahjam += jam;
    }

    void kurangiJam(int jam) {
        if (jumlahjam >= jam) {
            jumlahjam -= jam;
            System.out.println("Jumlah jam telah dikurangi menjadi: " + jumlahjam);
        } else {
            System.out.println("Pengurangan jam gagal");
        }
    }
}
