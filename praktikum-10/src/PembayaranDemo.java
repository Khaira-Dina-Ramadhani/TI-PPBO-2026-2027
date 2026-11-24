import java.util.Scanner;
public class PembayaranDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.printf("Masukkan nominal belanja: Rp ");
        double jumlah = input.nextDouble();

        MetodePembayaran[] daftar = {
                new Tunai(),
                new KartuKredit(),
                new EWallet(),
                new EWallet()
        };
        double totalBersihMinimum = Double.MAX_VALUE;
        String metodeTerbaik = "";

        System.out.println("\n=====HASIL PEMBAYARAN=====");

        for (MetodePembayaran metode : daftar) {
            metode.prosesPembayaran(jumlah);
            double cashback = 0;

            if (metode instanceof BisaCashback) {
                BisaCashback cb = (BisaCashback) metode;
                cashback = cb.hitungCashback(jumlah);

                System.out.printf("cashback: Rp%.0f%n", cashback);
            }
            double biayaAdmin = metode.hitungBiayaAdmin(jumlah);
            double totalBersih = jumlah + biayaAdmin - cashback;

            System.out.printf("Total bersih: Rp%.0f%n", totalBersih);
            System.out.println("------------------------------");

            if (totalBersih < totalBersihMinimum) {
                totalBersihMinimum = totalBersih;
                metodeTerbaik = metode.namaMetode;
            }
        }

        System.out.println("\n===== METODE PEMBAYARAN TERBAIK =====");
        System.out.println("Metode: " + metodeTerbaik);
        System.out.printf("Total Bersih: Rp%.0f%n", totalBersihMinimum);

        input.close();
    }
}
