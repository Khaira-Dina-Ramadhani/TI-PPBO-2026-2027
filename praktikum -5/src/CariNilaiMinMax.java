import java.util.Scanner;
public class CariNilaiMinMax {

    //method untuk mencari nilai minimum
    static int cariNilaiMinimum(int[] data) {
        int min = data[0];

        for (int nilai : data) {
            if (nilai < min) {
                min = nilai;
            }
        }
        return min;
    }
    //method untuk mencari nilai maksimum
    static int cariNilaiMaksimum(int[] data) {
        int max = data[0];

        for (int nilai : data) {
            if (nilai> max) {
                max = nilai;
            }
        }
        return max;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //meminta jumlah nilai
        System.out.print("Masukkan jumlah nilai ujian : ");
        int jumlah = input.nextInt();

        //membuat array nilai ujian
        int[] nilaiUjian = new int[jumlah];

        //memasukkan nilai ujian
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai ujian ke-" + (i + 1) + ": ");
            nilaiUjian[i] = input.nextInt();
        }

        //memanggil method minimum dan maksimum
        System.out.println("\nNilai minimum: " + cariNilaiMinimum(nilaiUjian));

        System.out.println("Nilai maksimum: " + cariNilaiMaksimum(nilaiUjian));

        input.close();
    }
}
