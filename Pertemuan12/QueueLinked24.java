package Pertemuan12;

public class QueueLinked24 {
    NodeQueue24 front;
    NodeQueue24 rear;
    int size;
    int max;

    public QueueLinked24(int n) {
        max = n;
        size = 0;
        front = rear = null;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public boolean enqueue(QueueMahasiswa24 dt) {
        if (isFull()) {
            System.out.println("Queue penuh");
            return false;
        } else {
            NodeQueue24 input = new NodeQueue24(dt, null);
            if (isEmpty()) {
                front = rear = input;
            } else {
                rear.next = input;
                rear = input;
            }
            size++;
            return true;
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue kosong");
            return;
        }
        QueueMahasiswa24 dt = front.data;
        System.out.println("Data : ");
        dt.tampil();
        size--;
        
        if (isEmpty()) {
            front = rear = null;
        } else {
            front = front.next;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("data paling depan: ");
            front.data.tampil();
            System.out.println("data paling belakang");
            rear.data.tampil();
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue kosong");
        } else {
            NodeQueue24 i = front;
            System.out.println("Daftar antrian");
            while (i != null) {
                i.data.tampil();
                i = i.next;
            }
            System.out.println("Jumlah antrian: " + size);
        }
    }
}
