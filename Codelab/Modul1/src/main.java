import java.util.Calendar;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
            String nama;
            String jenis_kelamin;
            int tahun_lahir;
            int tahun_sekarang;
            int umur;
            Scanner scan = new Scanner(System.in);
            Calendar kalender = Calendar.getInstance();

            System.out.print("Masukkan nama: ");
            nama = scan.nextLine();
            System.out.print("Masukkan jenis kelamin : ");
            jenis_kelamin = scan.nextLine();
            System.out.print("Masukkan tahun lahir: ");
            tahun_lahir = scan.nextInt();

            System.out.print("\nData Diri: \n" );
            System.out.print("Nama:  " + nama);

            if (jenis_kelamin.equalsIgnoreCase("l")) {
                System.out.print("\nJenis Kelamin: Laki-laki \n");
            }else if (jenis_kelamin.equalsIgnoreCase("p")) {
                System.out.print("\nJenis Kelamin: Perempuan \n");
            }

            tahun_sekarang = kalender.get(Calendar.YEAR);
            umur = tahun_sekarang - tahun_lahir;
            System.out.print("Umur: " + umur );


    }

}
