package minggu5;

public class Nilai24 {
    
    public int TertinggiDC(int[] arr, int rendah, int tinggi) {
        if (rendah == tinggi) {
            return arr[rendah];
        }
        int mid = (rendah + tinggi) / 2;

        int l = TertinggiDC(arr, rendah, mid);
        int r = TertinggiDC(arr, mid + 1, tinggi);

        if (l > r) {
            return l;
        } else {
            return r;
        }
    }

    public int TerendahDC(int[] arr, int rendah, int tinggi) {
        if (rendah == tinggi) {
            return arr[rendah];
        }
        int mid = (rendah + tinggi) / 2;
        
        int l = TerendahDC(arr, rendah, mid);
        int r = TerendahDC(arr, mid + 1, tinggi);

        if (l < r) {
            return l;
        } else {
            return r;
        }
    }

    public double ratarataBF(int[] arr) {
        double nilai = 0;
        for (int i = 0; i < arr.length; i++) {
            nilai += arr[i];
        }
        return nilai / arr.length;
    }
}
