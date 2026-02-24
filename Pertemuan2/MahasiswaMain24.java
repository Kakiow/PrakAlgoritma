package Pertemuan2;

public class MahasiswaMain24 {
    
    public static void main(String[] args) {
        Mahasiswa24 mhs1 = new Mahasiswa24();
        mhs1.nama = "okta";
        mhs1.nim = "254107020239";
        mhs1.kelas = "D4 1F";
        mhs1.ipk = 3.55;

        mhs1.tampilkaninformasi();
        mhs1.ubahkelas("D4 1A");
        mhs1.updateIpk(3.60);
        mhs1.tampilkaninformasi();

        Mahasiswa24 mhs2 = new Mahasiswa24("Okta2", "254107000000", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkaninformasi();

        Mahasiswa24 mhsOkta = new Mahasiswa24("Okta", "254107020239", 3.60, "TI 1F");
        mhsOkta.tampilkaninformasi();
    }
}
