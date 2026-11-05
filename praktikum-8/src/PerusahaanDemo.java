public class PerusahaanDemo {
    public static void main(String[] args) {
        // Membuat objek Manager
        Manager mgr = new Manager("Budi", "M001", 8000000, 2000000);

        // Membuat objek Staff
        Staff stf = new Staff("Andi", "S001", 5000000, 1000000);

        // Membuat objek Direktur
        Direktur dir = new Direktur("Siti", "D001", 15000000, 5000000, 3000000);

        // Menampilkan data Manager
        System.out.println("\n=== DATA MANAGER ===");
        mgr.tampilkanData();

        // Menampilkan data Staff
        System.out.println("\n=== DATA STAFF ===");
        stf.tampilkanData();

        // Menampilkan data Direktur
        System.out.println("\n=== DATA DIREKTUR ===");
        dir.tampilkanData();
    }
}