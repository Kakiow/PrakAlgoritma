package Pertemuan2;

public class Mahasiswa24 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    public Mahasiswa24() {
    }

    public Mahasiswa24(String nm, String nim, double ipk, String kls) {
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }

    void tampilkaninformasi(){
        System.out.println("Nama: " + nama);
        System.out.println("Nim: " + nim);
        System.out.println("Ipk: " + ipk);
        System.out.println("kelas: " + kelas);
    }

    void ubahkelas(String KelasBaru)    {
        kelas = KelasBaru;
    }

    void updateIpk(double IpkBaru)  {
        if (IpkBaru >= 0.0 && IpkBaru <= 4.0) {
            ipk = IpkBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }

    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";
        } else{
            return "Kinerja kurang";
        }
    }
}
