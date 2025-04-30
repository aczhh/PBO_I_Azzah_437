package app;

import perpustakaan.Anggota;
import perpustakaan.Fiksi;
import perpustakaan.NonFiksi;

public class main {
    public  static void main(String[] args) {
        Anggota anggota1 = new Anggota("Azzah", "437");
        Anggota anggota2 = new Anggota("Faizza", "422");
        Fiksi bukuFiksi = new Fiksi("Sang putri kelapa", "Lilis Hu");
        NonFiksi nonFiksi = new NonFiksi("Madilog", "Tan Malaka");

        bukuFiksi.displayInfo();
        nonFiksi.displayInfo();
        System.out.println();

        anggota1.pinjamBuku();
        anggota2.pinjamBuku();
        System.out.println();

        anggota1.pinjamBuku("Sang putri kelapa");
        anggota2.pinjamBuku("Madilog ", "1 Minggu");
        System.out.println();

        anggota1.kembalikanBuku("Sang putri kelapa");
        anggota2.kembalikanBuku("Madilog");



    }
}
