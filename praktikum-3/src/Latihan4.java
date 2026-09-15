import java.util.Scanner;
public class Latihan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        int umur = sc.nextInt();

        System.out.print("Apakah mahasiswa? (true/false): ");
        boolean mahasiswa = sc.nextBoolean();

        int hargaTiket;

        if (mahasiswa && umur <25) {
            hargaTiket = 30000;
            System.out.println("Anda mendapatkan harga khusus mahasiswa");
        } else {
            hargaTiket = 50000;
            System.out.println("Anda mendapatkan harga normal");

        }
        System.out.println("Harga tiket: Rp" + hargaTiket);
    }
}
