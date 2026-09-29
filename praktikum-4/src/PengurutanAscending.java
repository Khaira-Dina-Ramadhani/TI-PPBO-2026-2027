import java.util.Scanner;
public class PengurutanAscending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int n = sc.nextInt();

        int[] angka = new int [n];

        for (int i = 0; i < n; i++) {
            System.out.print("Angka ke-" + (i+1) + ": ");
            angka[i] = sc.nextInt();
        }
        System.out.println("\nArray sebelum diurutkan: ");

        for (int i = 0; i < angka.length; i++) {
            System.out.println(angka[i] + " ");
        }
        //boble sort
        for (int i = 0; i < angka.length - 1; i++) {
            for (int j = 0; j < angka.length -1 -i; j++) {
                if (angka[j] > angka[j + 1]) {
                    int temp = angka[j];
                    angka[j] = angka[j + 1];
                    angka[j + 1] = temp;
                }
            }
        }
        System.out.println("\nArray sesudah diurutkan: ");

        for (int i = 0; i < angka.length; i++) {
            System.out.println(angka[i] + " ");
        }
    }
}
