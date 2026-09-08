import java.util.Scanner;
public class OperatorScanner {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan bilangan pertama: ");
    int a = sc.nextInt();

    System.out.print("Masukkan bilangan kedua: ");
    int b = sc.nextInt();

        //ini operator aritmatika
        System.out.println("Penjumlahan: " + (a + b));
        System.out.println("Pengurangan: " + (a - b));
        System.out.println("Perkalian: " + (a * b));
        System.out.println("Pembagian: " + (a /b));
        System.out.println("Modulus: " + (a % b));

        //dan ini operator perbandingan
        System.out.println("a > b:" + ( a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + ( a == b));

        sc.close();
    }
}
