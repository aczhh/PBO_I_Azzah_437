package perpustakaan;

public class Anggota implements Peminjaman {
    String nama;
    String idAnggota;

    public Anggota(String nama, String idAnggota){
        this.nama = nama;
        this.idAnggota = idAnggota;
    }

    @Override
    public void kembalikanBuku(String Judulbuku) {
        System.out.println(nama + " mengembalikan buku berjudul: "+ Judulbuku);

    }

    @Override
    public void pinjamBuku() {
        System.out.println("Anggota: " + nama + " (ID: "+idAnggota+")" );

    }
    public void pinjamBuku(String judulBuku){

        System.out.println(nama + " meminjam buku berjudul: "+judulBuku );
    }
    public void pinjamBuku(String judulBuku, String durasiPinjam){
        System.out.println(nama + " meminjam buku berjudul: "+ judulBuku+"selama "+ durasiPinjam);

    }

}
