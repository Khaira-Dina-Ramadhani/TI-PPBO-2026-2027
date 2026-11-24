public abstract class MetodePembayaran {
    protected String namaMetode;

    public MetodePembayaran(String namaMetode) {
        this.namaMetode = namaMetode;
    }
    public abstract double hitungBiayaAdmin(double jumlah);

    public void prosesPembayaran(double jumlah) {
        double biayaAdmin = hitungBiayaAdmin(jumlah);
        double total = jumlah + biayaAdmin;


            System.out.println("Metode Pembayaran: " + namaMetode);
            System.out.printf("Jumlah Belanja: Rp%.0f%n", jumlah);
            System.out.printf("Biaya Admin: Rp%.0f%n", biayaAdmin);
            System.out.printf("Total Dibayar: Rp%.0f%n", total);
    }
}
