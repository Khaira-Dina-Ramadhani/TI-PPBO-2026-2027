import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("== Menu Makanan ==");
        System.out.println("1.Dimsum Mentai");
        System.out.println("2.Sate");
        System.out.println("3.Indomie");
        System.out.println("4.Bakso");

        System.out.print("Masukkan pilihan (1-4) = ");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih Dimsum Mentai");
                break;
            case 2:
                System.out.println("Anda memilih Sate");
                break;
            case 3:
                System.out.println("Anda memilih Indomie");
                break;
            case 4:
                System.out.println("Anda memilih Bakso");
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
    }

}
