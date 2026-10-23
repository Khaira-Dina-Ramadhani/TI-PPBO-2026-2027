public class ProdukTugas {
    String kodeProduk;
    String namaProduk;
    double harga;
    int stok;

    // Constructor
    public ProdukTugas(String kodeProduk, String namaProduk, double harga, int stok) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    // Method menghitung total harga
    public double hitungTotalHarga(int jumlahBeli) {
        return harga * jumlahBeli;
    }

    // Method mengurangi stok
    public void kurangiStok(int jumlah) {
        if (stok >= jumlah) {
            stok -= jumlah;
            System.out.println("Pembelian berhasil.");
            System.out.println("Stok tersisa: " + stok);
        } else {
            System.out.println("Stok tidak mencukupi.");
        }
    }

    // Method menampilkan data produk
    public void tampilkanData() {
        System.out.println("Kode Produk : " + kodeProduk);
        System.out.println("Nama Produk : " + namaProduk);
        System.out.println("Harga       : " + harga);
        System.out.println("Stok        : " + stok);
    }
}
