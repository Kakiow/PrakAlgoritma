package Pertemuan2;

public class MataKuliahMain24 {
    
    public static void main(String[] args) {
        MataKuliah24 mhs24 = new MataKuliah24();
        mhs24.KodeMk = "PASD";
        mhs24.nama = "okta";
        mhs24.sks = 2;
        mhs24.jumlahjam = 4;

        mhs24.tampilInformasi();
        mhs24.ubahSKS(3);
        mhs24.tambahjam(5);
        mhs24.kurangiJam(2);
        mhs24.tampilInformasi();

        MataKuliah24 mhs = new MataKuliah24("ASD", "Okta2", 8, 10);
        mhs.tampilInformasi();
    }
}
