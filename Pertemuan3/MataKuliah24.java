package Pertemuan3;

import java.util.Scanner;

public class MataKuliah24 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahjam;

    Scanner okta = new Scanner(System.in);

    public MataKuliah24() {

    }

    public MataKuliah24(String kode,String nama,int sks,int jumlahjam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahjam = jumlahjam;
    }

    void tambahData() {
        System.out.print("Kode              :");
        this.kode = okta.nextLine();
        System.out.print("Nama              :");
        this.nama = okta.nextLine();
        System.out.print("SKS               :");
        this.sks = okta.nextInt();
        System.out.print("Jumlah jam        :");
        this.jumlahjam = okta.nextInt();
        okta.nextLine();
    }
}
