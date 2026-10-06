import java.util.Scanner;
public class HitungTotal {

    // Method untuk menghitung total seluruh nilai
    static int hitungTotal(int[] data) {
        int total = 0;

        for (int nilai : data) {
            total += nilai;
        }

        return total;
    }
    // Method untuk mengambil nilai yang di atas rata-rata
    static int[] filterDiAtasRataRata(int[] data) {

        // Menghitung rata-rata
        double rataRata = (double) hitungTotal(data) / data.length;

        // Menghitung jumlah nilai yang di atas rata-rata
        int jumlah = 0;

        for (int nilai : data) {
            if (nilai > rataRata) {
                jumlah++;
            }
        }
        // Membuat array baru sesuai jumlah nilai yang memenuhi syarat
        int[] hasil = new int[jumlah];

        int index = 0;

        // Memasukkan nilai di atas rata-rata ke array hasil
        for (int nilai : data) {
            if (nilai > rataRata) {
                hasil[index] = nilai;
                index++;
            }
        }

        return hasil;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Meminta jumlah data
        System.out.print("Masukkan jumlah nilai: ");
        int jumlah = input.nextInt();

        int[] data = new int[jumlah];

        // Memasukkan nilai
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            data[i] = input.nextInt();
        }

        // Menghitung total
        int total = hitungTotal(data);

        // Menghitung rata-rata
        double rataRata = (double) total / data.length;

        System.out.println("\nTotal nilai: " + total);
        System.out.println("Rata-rata: " + rataRata);

        // Memanggil method filter
        int[] hasil = filterDiAtasRataRata(data);

        System.out.print("Nilai di atas rata-rata: ");

        for (int nilai : hasil) {
            System.out.print(nilai + " ");
        }

        input.close();
    }
}

