package Jobsheet9;

public class StackSurat24 {
    Surat24[] stack;
    int size;
    int top;

    public StackSurat24(int size) {
        this.size = size;
        stack = new Surat24[size];
        top = -1;
    }

    public boolean isFull(){
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty(){
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Surat24 surat){
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack penuh");
        }
    }

    public Surat24 pop(){
        if (!isEmpty()) {
            Surat24 surat = stack[top];
            top--;
            return surat;
        } else {
            System.out.println("Stack kosong");
            return null;
        }
    }

    public Surat24 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public void CariSurat(String nama) {
        boolean cari = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                cari = true;
            }
        }
        if (cari) {
            System.out.println("Data " + nama + " ada");
        }
    }
}
