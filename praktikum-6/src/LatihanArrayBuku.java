public class LatihanArrayBuku {
    public static void main(String[] args) {

        Buku[] daftarBuku = {
                new Buku("Laskar Pelangi", "Andrea Hirata", 2008),
                new Buku("Bumi", "Tere Liye", 2014),
                new Buku("Hujan", "Tere Liye", 2016),
                new Buku("Pulang", "Tere Liye", 2015),
                new Buku("Tentang Kamu", "Tere Liye", 2016)
        };
        System.out.println("===BUKU YANG TERBIT SETELAH 2015===");

        for (int i = 0; i < daftarBuku.length; i++) {
            if (daftarBuku[i].tahunTerbit > 2015) {
                System.out.println("Judul Buku: " + daftarBuku[i].judul);
            }
        }
    }
}
