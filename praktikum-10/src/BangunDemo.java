public class BangunDemo {
    public static void main(String[] args) {
        BangunDatar[] daftar = {
                new Persegi(5),
                new PersegiPanjang(6, 4),
                new Lingkaran(7)
        };
        for (BangunDatar bangun : daftar) {
            bangun.tampilkanInfo();
        }
    }
}
