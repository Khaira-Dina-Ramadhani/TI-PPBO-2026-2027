public class LatihanBuku {
        public static void main(String[] args) {
            Buku buku1 = new Buku("Laskar Pelangi", "Andrea Hirata", 2005);

            System.out.println("Data Buku awal: ");
            buku1.tampilkanData();

            System.out.println("\nData Buku Setelah Diubah:");
            buku1.setJudul("Sang Pemimpi");
            buku1.setPengarang("Andrea Hirata");
            buku1.tampilkanData();

            System.out.println("Judul: " + buku1.getJudul());
            System.out.println("Pengarang: " + buku1.getPengarang());
            System.out.println("Tahun Terbit: " + buku1.getTahunTerbit());
        }
    }

