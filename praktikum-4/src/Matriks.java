import java.util.Scanner;
public class Matriks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriks = new int[3][3];
        int total = 0;

        System.out.println("masukkan nilai matriks 3x3: ");

        for (int baris = 0; baris < 3; baris++) {
            for (int kolom = 0; kolom < 3; kolom++) {
                System.out.print("Baris" + (baris + 1) + ", kolom " + (kolom + 1) + ": ");
                matriks[baris][kolom] = sc.nextInt();
            }
        }
        System.out.println("\n Matriks: ");

        for (int baris = 0; baris < 3; baris++) {
            int jumlahBaris = 0;

        for (int kolom = 0; kolom < 3; kolom++) {
            System.out.print(matriks[baris][kolom] + " ");

            jumlahBaris += matriks[baris][kolom];
            total += matriks[baris][kolom];

        }
        System.out.println(" 1 jumlah baris = " + jumlahBaris);
    }
    System.out.println("\nJumlah seluruh elemen = "+total);
    }
}
