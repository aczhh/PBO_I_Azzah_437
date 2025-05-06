package com.praktikum.users;

import com.praktikum.actions.MahasiswaActions;
import java.util.Scanner;

public class Mahasiswa extends User implements MahasiswaActions{
    String namaBarang, deskripsiBarang, lokasi;
    String nama, nim;
    int pil;

    public Mahasiswa(){
        this.nama = nama;
        this.nim = nim;
    }

    Scanner scan = new Scanner(System.in);

    @Override
    public void reportItem() {
        System.out.print("Masukkan nama barang: ");
        namaBarang = scan.nextLine();
        System.out.print("Masukkan deskripsi barang: ");
        deskripsiBarang = scan.nextLine();
        System.out.print("Masukkan lokasi terakhir barang: ");
        lokasi = scan.nextLine();

        System.out.println();
        System.out.println("Laporan berhasil dikirim");
        System.out.println();
    }

    @Override
    public void viewReportedItems() {
        System.out.println();
        System.out.println(">> Fitur Lihat Laporan Belum Tersedia <<");
        System.out.println();
    }
    @Override
    public void displayAppMenu(){
        while (true) {
            System.out.println("           Menu         ");
            System.out.println("------------------------");
            System.out.println("1. Laporan barang temuan/hilang");
            System.out.println("2. Lihat daftar laporan");
            System.out.println("0. Logout");
            System.out.print("Masukkan pilihan: ");
            pil = scan.nextInt();
            scan.nextLine();

            if (pil == 1) {
                reportItem();

            } else if (pil == 2) {
                viewReportedItems();

            } else if (pil == 0) {
                System.out.println("Logout...");
                System.out.println();
                break;
            } else {
                System.out.println("Pilihan tidak valid");
                System.out.println();
            }
        }

    }
    @Override
    public boolean login(String nama, String nim){
        return nama.equals("Azzah") && nim.equals("437");

    }
    @Override
    public void displayInfo() {
        System.out.println("Login Mahasiswa berhasil");
        System.out.println();
    }
}
