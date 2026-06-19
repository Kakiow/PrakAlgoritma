package Jobsheet16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMahasiswa24 {
    List<Mahasiswa24> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa24... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa24 mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    int linearSearch(String nim) {
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (nim.equals(mahasiswas.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ListMahasiswa24 lm = new ListMahasiswa24();
        Mahasiswa24 m = new Mahasiswa24("201234", "Noureen", "021xx1");
        Mahasiswa24 m1 = new Mahasiswa24("201235", "Akhleema", "021xx2");
        Mahasiswa24 m2 = new Mahasiswa24("201236", "Shannum", "021xx3");
        lm.tambah(m, m1, m2);
        lm.tampil();
        lm.update(lm.linearSearch("201235"), new Mahasiswa24("201235", "Akhleema Lela", "021xx2"));
        System.out.println("");
        lm.tampil();
    }
}
