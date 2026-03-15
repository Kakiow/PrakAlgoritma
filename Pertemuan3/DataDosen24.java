package Pertemuan3;

public class DataDosen24 {
    
    public static void dataSemuaDosen(Dosen24[] arrayOfDosen) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Dosen Ke-" + i);
            System.out.println("Kode                 :" + arrayOfDosen[i].kode);
            System.out.println("Nama                 :" + arrayOfDosen[i].nama);
            System.out.println("Jenis Kelamin        :" + (arrayOfDosen[i].JenisKelamin ? "Pria" : "wanita"));
            System.out.println("Usia                 :" + arrayOfDosen[i].usia);
            System.out.println("-------------------------------------------");
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen24[] arrayOfDosen) {
        int pria = 0;
        int wanita = 0;
        for (int i = 0; i < 3; i++) {
            if (arrayOfDosen[i].JenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        
        System.out.println("Jumlah Pria     : " + pria);
        System.out.println("Jumlah Wanita   : " + wanita);
    }

    public static void ratarataUsiaDosenPerJenisKelamin(Dosen24[] arrayOfDosen) {
        int totalpria = 0;
        int totalwanita = 0;
        int pria = 0;
        int wanita = 0;
        for (int i = 0; i < 3; i++) {
            if (arrayOfDosen[i].JenisKelamin) {
                totalpria += arrayOfDosen[i].usia;
                pria++;
            } else {
                totalwanita += arrayOfDosen[i].usia;
                wanita++;
            }
        }
        System.out.println("-------------------------------------------");
        System.out.println("Rata-rata Usia Dosen Pria  : " + (double) totalpria / pria);
        System.out.println("Rata-rata Usia Dosen Wanita: " + (double) totalwanita / wanita);
    }

    public static void infoDosenPalingTua(Dosen24[] arrayOfDosen) {
        int tertua = 0;
        for (int i = 1; i < 3; i++) {
            if (arrayOfDosen[i].usia > arrayOfDosen[tertua].usia) {
                tertua = i;
            }
        }
        System.out.println("-------------------------------------------");
        System.out.println("Dosen Tertua");
        System.out.println("Kode     :" + arrayOfDosen[tertua].kode);
        System.out.println("Nama     :" + arrayOfDosen[tertua].nama);
    }

    public static void infoDosenPalingMuda(Dosen24[] arrayOfDosen) {
        int termuda = 0;
        for (int i = 1; i < 3; i++) {
            if (arrayOfDosen[i].usia < arrayOfDosen[termuda].usia) {
                termuda = i;
            }
        }
        System.out.println("-------------------------------------------");
        System.out.println("Dosen Termuda");
        System.out.println("Kode     :" + arrayOfDosen[termuda].kode);
        System.out.println("Nama     :" + arrayOfDosen[termuda].nama);
    }
}
