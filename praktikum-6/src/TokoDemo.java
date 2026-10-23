public class TokoDemo {
    public static void main(String[] args) {

        // Membuat array of object ProdukTugas
        ProdukTugas[] daftarProduk = {
                new ProdukTugas("P001", "Laptop", 7500000, 5),
                new ProdukTugas("P002", "Mouse", 150000, 10),
                new ProdukTugas("P003", "Keyboard", 600000, 4),
                new ProdukTugas("P004", "Monitor", 2000000, 3),
                new ProdukTugas("P005", "Flashdisk", 50000, 2)
        };

        // Menampilkan seluruh data produk
        System.out.println("===== DATA SELURUH PRODUK =====");

        for (int i = 0; i < daftarProduk.length; i++) {
            System.out.println("\nProduk ke-" + (i + 1));
            daftarProduk[i].tampilkanData();
        }

        // Simulasi pembelian pertama: Laptop
        System.out.println("\n===== SIMULASI PEMBELIAN 1 =====");
        System.out.println("Produk: " + daftarProduk[0].namaProduk);
        System.out.println("Jumlah beli: 2");
        System.out.println("Total harga: Rp"
                + daftarProduk[0].hitungTotalHarga(2));
        daftarProduk[0].kurangiStok(2);

        // Simulasi pembelian kedua: Flashdisk
        System.out.println("\n===== SIMULASI PEMBELIAN 2 =====");
        System.out.println("Produk: " + daftarProduk[4].namaProduk);
        System.out.println("Jumlah beli: 5");
        System.out.println("Total harga: Rp"
                + daftarProduk[4].hitungTotalHarga(5));
        daftarProduk[4].kurangiStok(5);

        // Mencari produk dengan harga termahal
        ProdukTugas termahal = daftarProduk[0];

        for (int i = 1; i < daftarProduk.length; i++) {
            if (daftarProduk[i].harga > termahal.harga) {
                termahal = daftarProduk[i];
            }
        }

        System.out.println("\n===== PRODUK DENGAN HARGA TERMAHAL =====");
        termahal.tampilkanData();
    }
}
