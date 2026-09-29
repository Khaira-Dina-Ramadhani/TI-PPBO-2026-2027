import java.util.Scanner;
public class ArrayTerbalik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] angka = new int[10];

        System.out.println("Masukkan 10 bilangan");

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            angka[i] = sc.nextInt();
        }
        System.out.println("\n Array dalam urutan terbalik: ");

        for (int i = angka.length - 1; i >= 0; i--) {
            System.out.println(angka[i] + " ");
        }
    }
}
