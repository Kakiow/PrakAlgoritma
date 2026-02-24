package Pertemuan2;

public class Dosen24 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen24() {

    }

    public Dosen24(String id, String nama, boolean status, int bergabung, String keahlian) {
        idDosen = id;
        this.nama = nama;
        statusAktif = status;
        tahunBergabung = bergabung;
        bidangKeahlian = keahlian;
    }

    void tampilInformasi() {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Status: " + statusAktif);
        System.out.println("Tahun bergabung: " + tahunBergabung);
        System.out.println("Bidang keahlian: " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
        if (status) {
            System.out.println("Dosen aktif");
        } else {
            System.out.println("Dosen tidak aktif");
        }
    }

    int hitungMasaKerja(int thnskrg) {
        int lamakerja = thnskrg - tahunBergabung;
        return lamakerja;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }
}
