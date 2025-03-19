import java.util.Scanner;

class RekeningBank {
    String nomorRekening, namaPemilik;
    double saldo;


    void tampilkanInfo(){
        System.out.println("Nomor Rekening : "+nomorRekening);
        System.out.println("Nama Pemilik   : "+namaPemilik);
        System.out.println("Saldo          : "+saldo);
        System.out.println("");
    }
    void setorUang(double jumlah){
        saldo+=jumlah;
        System.out.println(namaPemilik+"menyetor Rp"+jumlah +"Saldo sekarang : Rp"+saldo);
        System.out.println("");
    }

    void tarikUang(double jumlah){
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Berhasil) Saldo sekarang: Rp" + saldo);
            System.out.println("");
        } else {
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Gagal, Saldo tidak mencukupi) Saldo saat ini: Rp" + saldo);
            System.out.println("");
        }

    }

    public static void main(String[] args) {


        RekeningBank rekening1 = new RekeningBank();
        RekeningBank rekening2 = new RekeningBank();

        rekening1.nomorRekening = "202410370110437";
        rekening1.namaPemilik = "Azzah Rafidah";
        rekening1.saldo = 500000;

        rekening2.nomorRekening = "202410370110422";
        rekening2.namaPemilik = "Faizza Divana";
        rekening2.saldo = 1000000;

        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        rekening1.setorUang(200000);
        rekening2.setorUang(500000);

        rekening1.tarikUang(800000);
        rekening2.tarikUang(300000);

        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();



    }
}
