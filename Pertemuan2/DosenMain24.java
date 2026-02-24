package Pertemuan2;

public class DosenMain24 {
    
    public static void main(String[] args) {
        Dosen24 dosen1 = new Dosen24();
        dosen1.idDosen = "PASD";
        dosen1.nama = "Dosen1";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2001;
        dosen1.bidangKeahlian = "PASD";

        dosen1.tampilInformasi();
        dosen1.setStatusAktif(true);
        dosen1.hitungMasaKerja(2026);
        dosen1.ubahKeahlian("Aljabar linear");
        dosen1.tampilInformasi();

        Dosen24 dosen2 = new Dosen24("SO", "Dosen2", true, 2000, "Sistem Operasi");
        dosen2.tampilInformasi();
        dosen2.setStatusAktif(false);
        dosen2.hitungMasaKerja(2030);
        dosen2.ubahKeahlian("RPL");
        dosen2.tampilInformasi();
    }
}
