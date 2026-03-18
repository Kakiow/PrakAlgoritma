package minggu5;

public class MainNilai24 {
    
    public static void main(String[] args) {
        int[] UTS = {78, 85, 90, 76, 92, 88, 80, 82};
        int[] UAS = {82, 88, 87, 79, 95, 85, 83, 84};

        Nilai24 nilai = new Nilai24();

        int Tertinggi = nilai.TertinggiDC(UTS, 0, UTS.length - 1);
        System.out.println("Nilai UTS Tertinggi: " + Tertinggi);

        int Terendah = nilai.TerendahDC(UTS, 0, UTS.length - 1);
        System.out.println("Nilai UTS Terendah: " + Terendah);

        double rata = nilai.ratarataBF(UAS);
        System.out.println("Rata-rata UAS: " + rata);
    }
}
