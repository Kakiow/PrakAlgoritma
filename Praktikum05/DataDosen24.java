package Praktikum05;

public class DataDosen24 {
    Dosen24 [] dataDosen= new Dosen24[10];
    int idx;
    
    void tambah(Dosen24 dsn){
        if (idx < dataDosen.length) {
            dataDosen[idx]=dsn;
            idx++;
        }else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil(){
        for (Dosen24 data : dataDosen) {
            data.tampil();
            System.out.println("-----------------------");
        }
    }

    void SortingASC(){
        for (int i = 0; i < dataDosen.length-1; i++) {
            for (int j = 1; j < dataDosen.length-i; j++) {
                if (dataDosen[j].usia>dataDosen[j-1].usia) {
                    Dosen24 tmp = dataDosen[j];
                    dataDosen[j]=dataDosen[j-1];
                    dataDosen[j-1]=tmp;
                }
            }
        }
    }

    void sortingDSC(){
        for (int i = 0; i < dataDosen.length-1; i++) {
            int idxMin=i;
            for (int j =i + 1; j < dataDosen.length; j++) {
                if (dataDosen[j].usia<dataDosen[idxMin].usia) {
                    idxMin=j;
                }
            }
            Dosen24 tmp = dataDosen[idxMin];
            dataDosen[idxMin]=dataDosen[i];
            dataDosen[i]=tmp;
        }
    }

    void insertionSort(){
        for (int i = 1; i < dataDosen.length; i++) {
            Dosen24 temp = dataDosen[i];
            int j=i;
            while (j>0 && dataDosen[j-1].usia<temp.usia) {
                dataDosen[j]=dataDosen[j-1];
                j--;
            }
            dataDosen[j]=temp;
        }
    }
}
