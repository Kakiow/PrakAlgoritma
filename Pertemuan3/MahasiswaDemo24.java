package Pertemuan3;


public class MahasiswaDemo24 {
    public static void main(String[] args) {
        Mahasiswa24[] arrayOfMahasiswa = new Mahasiswa24[3];
        arrayOfMahasiswa[0] = new Mahasiswa24();
        arrayOfMahasiswa[0].nim = "254107020239";
        arrayOfMahasiswa[0].nama = "Okta";
        arrayOfMahasiswa[0].kelas = "TI 1F";
        arrayOfMahasiswa[0].ipk = (float) 3.33; 

        arrayOfMahasiswa[1] = new Mahasiswa24();
        arrayOfMahasiswa[1].nim = "25410702023912312432";
        arrayOfMahasiswa[1].nama = "Okta2";
        arrayOfMahasiswa[1].kelas = "TI 1F";
        arrayOfMahasiswa[1].ipk = (float) 3.53; 

        arrayOfMahasiswa[2] = new Mahasiswa24();
        arrayOfMahasiswa[2].nim = "25410702023924234";
        arrayOfMahasiswa[2].nama = "Okta3";
        arrayOfMahasiswa[2].kelas = "TI 1F";
        arrayOfMahasiswa[2].ipk = (float) 3.83; 

        System.out.println("Nim         :"+  arrayOfMahasiswa[0].nim);
        System.out.println("Nama        :"+  arrayOfMahasiswa[0].nama);
        System.out.println("Kelas       :"+  arrayOfMahasiswa[0].kelas);
        System.out.println("IPK         :"+  arrayOfMahasiswa[0].ipk);
        System.out.println("---------------------------------------");
        System.out.println("Nim         :"+  arrayOfMahasiswa[1].nim);
        System.out.println("Nama        :"+  arrayOfMahasiswa[1].nama);
        System.out.println("Kelas       :"+  arrayOfMahasiswa[1].kelas);
        System.out.println("IPK         :"+  arrayOfMahasiswa[1].ipk);
        System.out.println("---------------------------------------");
        System.out.println("Nim         :"+  arrayOfMahasiswa[2].nim);
        System.out.println("Nama        :"+  arrayOfMahasiswa[2].nama);
        System.out.println("Kelas       :"+  arrayOfMahasiswa[2].kelas);
        System.out.println("IPK         :"+  arrayOfMahasiswa[2].ipk);
        System.out.println("---------------------------------------");
        
    }
}
