public class latihanProduk {
    public static void main(String[] args) {
        Produk p1 = new Produk("Laptop", 7500000);
        Produk p2 = new Produk("Mouse", 150000);
        Produk p3 = new Produk("Keyboard", 600000);

        double batasHarga = 500000;

        System.out.println("===DATA PRODUK===");
        System.out.println("Batas harga: Rp" + batasHarga);
        System.out.println();

        System.out.println("Nama produk: " + p1.namaProduk);
        System.out.println("Harga: Rp" + p1.harga);
        System.out.println("Mahal: " + p1.isMahal(batasHarga));
        System.out.println();

        System.out.println("Nama produk: " + p2.namaProduk);
        System.out.println("Harga: Rp" + p2.harga);
        System.out.println("Mahal: " + p2.isMahal(batasHarga));
        System.out.println();

        System.out.println("Nama produk: " + p3.namaProduk);
        System.out.println("Harga: Rp" + p3.harga);
        System.out.println("Mahal: " + p3.isMahal(batasHarga));
        System.out.println();
    }
}
