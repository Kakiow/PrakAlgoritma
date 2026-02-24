package Pertemuan2;

public class Mahasiswa24 {
    String nama;
    String nim;
    String kelas;
    double ipk;

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
        ipk = IpkBaru;
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
