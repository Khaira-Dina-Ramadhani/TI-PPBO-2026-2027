public class BangunDatarDemo {
    public static void main(String[] args) {

        BangunDatar[] daftarBangun = {
                new Lingkaran("Lingkaran", 7),
                new Persegi("Persegi", 5),
                new PersegiPanjang("Persegi Panjang", 8, 4),
                new Lingkaran("Lingkaran", 3),
                new Persegi("Persegi", 6)
                };
        double totalLuas = 0;
        BangunDatar bangunTerbesar = daftarBangun[0];

        System.out.println("=== INFORMASI BANGUN DATAR ===");

        for (BangunDatar bangun : daftarBangun) {
            bangun.tampilkanInfo();

            double luas = bangun.hitungLuas();
            totalLuas += luas;

            if (luas > bangunTerbesar.hitungLuas()) {
                bangunTerbesar = bangun;
            }
        }
        System.out.println("=== HASIL PERHITUNGAN ===");
        System.out.println("Total Luas Seluruh Bangun: " + totalLuas);

        System.out.println("Bangun dengan Luas Terbesar: "
                + bangunTerbesar.namaBangun);

        System.out.println("Luas Terbesar: "
                + bangunTerbesar.hitungLuas());
    }
}

