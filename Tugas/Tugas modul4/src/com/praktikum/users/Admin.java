package com.praktikum.users;

import com.praktikum.actions.AdminActions;
import java.util.Scanner;

public class Admin extends User implements AdminActions {
    Scanner scan = new Scanner(System.in);
    String usn, pass;
    int pil;
    public Admin(){
        this.usn = usn;
        this.pass = pass;
    }

    @Override
    public void manageItems(){
        System.out.println();
        System.out.println(">> Fitur Kelola Barang Belum Tersedia <<");
        System.out.println();
    }
    @Override
    public void manageUsers() {
        System.out.println();
        System.out.println(">> Fitur Kelola Mahasiswa Belum Tersedia <<");
        System.out.println();
    }
    @Override
    public void displayAppMenu(){
        while (true) {
            System.out.println("           Menu         ");
            System.out.println("------------------------");
            System.out.println("1. Kelola laporan barang");
            System.out.println("2. Kelola Data Mahasiswa");
            System.out.println("0. Logout");
            System.out.print("Masukkan pilihan: ");
            pil = scan.nextInt();
            scan.nextLine();

            if (pil == 1) {
                manageItems();

            } else if (pil == 2) {
                manageUsers();

            } else if (pil == 0) {
                System.out.println("Logout...");
                System.out.println();
                break;
            }else {
                System.out.println("Pilihan tidak valid");
                System.out.println();
            }
        }
    }
    @Override
    public boolean login(String usn, String pass ){
        return usn.equals("admin437") && pass.equals("pass437");
    }
    @Override
    public void displayInfo() {
        System.out.println("Login Admin berhasil");
        System.out.println();
    }
}
