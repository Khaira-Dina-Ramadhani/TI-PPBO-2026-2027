public class BankDemo {
    public static void main(String[] args){
        RekeningBank rek1 = new RekeningBank("001", "Budi", 100000, "Tabungan");
        RekeningBank rek2 = new RekeningBank("002", "Ani", 200000, "Giro");

        // Setor dan tarik rekening pertama
        System.out.println("=== REKENING PERTAMA ===");
        rek1.setor(50000);
        rek1.tarik(30000);

        // Setor dan tarik rekening kedua
        System.out.println("\n=== REKENING KEDUA ===");
        rek2.setor(100000);
        rek2.tarik(50000);

        // Transfer berhasil
        System.out.println("\n=== TRANSFER BERHASIL ===");
        rek1.transferKe(rek2, 50000);

        // Transfer gagal karena saldo tidak cukup
        System.out.println("\n=== TRANSFER GAGAL ===");
        rek1.transferKe(rek2, 500000);

        // Menampilkan mutasi akhir
        System.out.println("\n=== MUTASI AKHIR ===");

        System.out.println("\nRekening Pertama:");
        rek1.cetakMutasi();

        System.out.println("\nRekening Kedua:");
        rek2.cetakMutasi();
    }
}
