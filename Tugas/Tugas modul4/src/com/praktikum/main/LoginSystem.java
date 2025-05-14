package com.praktikum.main;

import com.praktikum.users.Admin;
import com.praktikum.users.Mahasiswa;
import com.praktikum.users.User;
import java.util.Scanner;

public class LoginSystem {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Pilih Login:");
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");
            System.out.println("0. Logout");
            System.out.print("Masukkan Pilihan: ");
            int pil = scan.nextInt();
            scan.nextLine();

            if (pil == 1) {
                User user = new Admin();
                System.out.println();
                System.out.print("Masukkan Username: ");
                String usn = scan.nextLine();
                System.out.print("Masukkan Password: ");
                String pass = scan.nextLine();



                if (user.login(usn, pass)) {
                    user.displayInfo();
                    user.displayAppMenu();
                } else {
                    System.out.println("Login Gagal!");
                    System.out.println();
                }
            } else if (pil == 2) {
                User user = new Mahasiswa();
                System.out.println();
                System.out.print("Masukkan Nama: ");
                String nama = scan.nextLine();
                System.out.print("Masukkan NIM: ");
                String nim = scan.nextLine();

                if (user.login(nama, nim)) {
                    user.displayInfo();
                    user.displayAppMenu();
                } else {
                    System.out.println("Login Gagal!");
                    System.out.println();
                }
            }else if (pil == 0) {
                break;
            }else {
                System.out.println("Pilihan tidak valid.");
                System.out.println();
            }
        }
    }
}
