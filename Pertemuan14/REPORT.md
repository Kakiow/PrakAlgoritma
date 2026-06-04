|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020239|
| Nama |  Oktavian Kusuma Alghifari |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/Kakiow/PrakAlgoritma.git) |

# Labs #14 Tree

## 14.2.1   Implementasi Binary Search Tree menggunakan Linked List

kode berada di file Mahasiswa24.java, Node24.java, BinaryTree24.java, BinaryTreeMain24.java berikut adalah output nya

```
Daftar semua mahasiswa (in order traversal):
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.54
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85

Pencarian data mahasiswa:
Cari mahasiswa dengan ipk: 3.54 : Ditemukan
Cari mahasiswa dengan ipk: 3.22 : Tidak ditemukan

Daftar semua mahasiswa setelah penambahan 3 mahasiswa:
InOrder Traversal:
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
NIM: 244160205 Nama: Ehsan Kelas: D IPK: 3.37
NIM: 244160170 Nama: Fizi Kelas: B IPK: 3.46
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.54
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85

PreOrder Traversal:
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.54
NIM: 244160205 Nama: Ehsan Kelas: D IPK: 3.37
NIM: 244160170 Nama: Fizi Kelas: B IPK: 3.46
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72

PostOrder Traversal:
NIM: 244160170 Nama: Fizi Kelas: B IPK: 3.46
NIM: 244160205 Nama: Ehsan Kelas: D IPK: 3.37
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.54
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57

Penghapusan data mahasiswa
Jika 2 anak, current = 
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72

Daftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal):
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
NIM: 244160205 Nama: Ehsan Kelas: D IPK: 3.37
NIM: 244160170 Nama: Fizi Kelas: B IPK: 3.46
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.54
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85
```

**Penjelasan:** ada 4 tahap: 
1. Membuat class
2. Deklarasi atribut
3. Deklarasi method
4. Membuat class main nya dan mengakses method nya

## 14.2.2 Pertanyaan
1. Mengapa dalam binary search tree proses pencarian data bisa lebih efektif dilakukan dibanding
binary tree biasa?
Jawab:
Karena di binary search tree struktur data nya jelas, nilai data yang lebih kecil ada di bagian kiri dan nilai data yang lebih besar ada di bagian kanan
2. Untuk apakah di class Node, kegunaan dari atribut left dan right?
Jawab:
Berfungsi sebagai pointer untuk node lainnya
3. a. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree?
b. Ketika objek tree pertama kali dibuat, apakah nilai dari root?
Jawab:
a. sebagai node utama untuk melakukan operasi di binary tree
b. nilai dari root nya adalah null
4. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi?
Jawab:
Node baru itu akan jadi root
5. Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah ini. Jelaskan
secara detil untuk apa baris program tersebut?
```
parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
```
Jawab:
Pertama cek ipk, jika ipk baru lebih kecil maka ipk itu akan ada di posisi kiri, jika posisi kiri itu kosong ipk baru akan ada di posisi itu
jika ipk baru lebih besar maka ipk itu akan ada di posisi kanan, jika posisi kanan itu kosong ipk baru akan ada di posisi itu
6. Jelaskan langkah-langkah pada method delete() saat menghapus sebuah node yang memiliki dua
anak. Bagaimana method getSuccessor() membantu dalam proses ini?
Jawab:
getSuccessor berguna untuk mencari node pengganti di sub tree kanan, node pengganti itu adalah node nilai paling kecil di sub tree kanan
di method delete langkah-langkahnya adalah cari node pengganti dulu hapus node yang mau dihapus ganti posisi node pengganti di posisi node yang di hapus



## 14.3.1   Implementasi Binary Tree dengan Array

kode berada di file  Mahasiswa24.java, Node24.java, BinaryTreeArray24.java, BinaryTreeArrayMain24.java berikut adalah output nya

```
Inorder Traversal Mahasiswa: 
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.35
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.41
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.48
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57
NIM: 244160205 Nama: Ehsan Kelas: D IPK: 3.61
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.75
NIM: 244160170 Nama: Fizi Kelas: B IPK: 3.86
```
**Penjelasan:** ada 4 tahap: 
1. Membuat class
2. Deklarasi atribut
3. Deklarasi method
4. Membuat class main nya dan mengakses method nya

## 14.3.2 Pertanyaan
1. Apakah kegunaan dari atribut data dan idxLast yang ada di class BinaryTreeArray?
Jawab:
Atribut data berguna untuk menyimpan data mahasiswa dalam bentuk array, idxLast berguna untuk menentukan indeks terakhir di array
2. Apakah kegunaan dari method populateData()?
Jawab:
Untuk menambahkan beberapa data sekaligus ke dalam array sampai batas indeks terakhir
3. Apakah kegunaan dari method traverseInOrder()?
Jawab:
Untuk menampilkan data dari posisi indeks kiri sampai posisi indeks paling kanan
4. Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah posisi
left child dan right child masing-masing?
Jawab:
Posisi left child ada di indeks 5 dan posisi right child ada di indeks 6
5. Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor 4?
Jawab:
Untuk menentukan bahwa indeks terakhir adalah indeks 6
6. Mengapa indeks 2*idxStart+1 dan 2*idxStart+2 digunakan dalam pemanggilan
rekursif, dan apa kaitannya dengan struktur pohon biner yang disusun dalam array?
Jawab:
Untuk menentukan posisi node ke arah kiri atau ke arah kanan

## 14.4  Tugas

kode berada di file BinaryTree24.java, BinaryTreeArray24.java berikut adalah output nya

```
package Pertemuan14;

public class BinaryTree24 {
    Node24 root;

    public BinaryTree24() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Mahasiswa24 mahasiswa) {
        Node24 newNode = new Node24(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node24 current = root;
            Node24 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    boolean find(double ipk) {
        boolean result = false;
        Node24 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(Node24 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traverseInOrder(Node24 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    void traversePostOrder(Node24 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    Node24 getSuccessor(Node24 del) {
        Node24 successor = del.right;
        Node24 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        Node24 parent = root;
        Node24 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node24 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilInformasi();
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }

    public Node24 addRekursif(Node24 current, Mahasiswa24 mahasiswa) {
        if (current == null) {
            return new Node24(mahasiswa);
        }
        if (mahasiswa.ipk < current.mahasiswa.ipk) {
            current.left = addRekursif(current.left, mahasiswa);
        } else {
            current.right = addRekursif(current.right, mahasiswa);
        }
        return current;
    }

    public void cariMinIPK() {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        Node24 current = root;
        while (current.left != null) {
            current = current.left;
        }
        System.out.println("IPK paling kecil");
        current.mahasiswa.tampilInformasi();
    }

    public void cariMaxIPK() {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        Node24 current = root;
        while (current.right != null) {
            current = current.right;
        }
        System.out.println("IPK paling besar");
        current.mahasiswa.tampilInformasi();
    }

    public void tampilMahasiswaIPKdiAtas(Node24 newNode, double ipkBatas) {
        if (newNode != null) {
            tampilMahasiswaIPKdiAtas(newNode.left, ipkBatas);
            if (newNode.mahasiswa.ipk > ipkBatas) {
                newNode.mahasiswa.tampilInformasi();
            }
            tampilMahasiswaIPKdiAtas(newNode.right, ipkBatas);
        }
    }
}
```
```
package Pertemuan14;

public class BinaryTreeArray24 {
    Mahasiswa24[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray24() {
        this.dataMahasiswa = new Mahasiswa24[10];
    }

    void populateData(Mahasiswa24 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2*idxStart+1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2*idxStart+2);
            }
        }
    }

    void add(Mahasiswa24 data) {
        if (idxLast == -1) {
            idxLast = 0;
            dataMahasiswa[idxLast] = data;
            return;
        }
        idxLast++;
        dataMahasiswa[idxLast] = data;
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traversePreOrder(2*idxStart+1);
                traversePreOrder(2*idxStart+2);
            }
        }
    }
}
```
**Penjelasan:** ada 4 tahap: 
1. Membuat class
2. Deklarasi atribut
3. Deklarasi method
4. Membuat class main nya dan mengakses method nya
