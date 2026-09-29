import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class NilaiTerbesar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int n = sc.nextInt();

        int[] angka = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            angka[i] = sc.nextInt();
        }
        int terbesar = angka[0];
        int terbesarKedua = Integer.MIN_VALUE;

        for (int i = 1; i < angka.length; i++) {
            if (angka[i] > terbesar) {
                terbesarKedua = terbesar;
                terbesar = angka [i];
            } else if (angka[i] > terbesarKedua && angka[i] != terbesar) {
                terbesarKedua = angka[i];
            }
        }
        if (terbesarKedua == Integer.MIN_VALUE) {
            System.out.println("Tidak ada nilai terbesar kedua. ");
        } else {
            System.out.println("Nilai terbesar = " + terbesar);
            System.out.println("Nilai terbesar kedua = " + terbesarKedua);
        }
    }
}
