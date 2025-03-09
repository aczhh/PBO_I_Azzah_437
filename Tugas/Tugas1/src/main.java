import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String username;
        String pass;
        String nama;
        String nim;
        int pil;

        Scanner scan = new Scanner(System.in);

        System.out.println("Pilih Login: ");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa ");

        System.out.print("Masukkan Pilihan: ");
        pil = scan.nextInt();
        scan.nextLine();

        if (pil == 1){
            System.out.print("1. Username = ");
            username = scan.nextLine();
            System.out.print("2. Password = ");
            pass = scan.nextLine();

            if (username.equals("Admin437") && pass.equals("password437")){
                System.out.print("Login Admin berhasil!");
            }else{
                System.out.print("Login gagal! Username atau password salah.");
            }

        } else if (pil == 2) {
            System.out.print("1. Nama = ");
            nama = scan.nextLine();
            System.out.print("2. NIM = ");
            nim = scan.nextLine();

            if(nama.equals ("Azzah Rafidah") && nim.equals ("202410370110437")) {
                System.out.println("Login Mahasiswa berhasil!");
                System.out.println("Nama =" + nama);
                System.out.println("NIM  =" + nim);
            }else{
                System.out.println("Login gagal! Nama atau NIM salah.");
            }
        }else{
            System.out.println("Pilihan tidak valid.");
        }
    }
}
