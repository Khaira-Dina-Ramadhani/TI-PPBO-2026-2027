public class Latihan5 {
    public static void main(String[] args) {

        AkunPremium akun = new AkunPremium("Khaira", 5000000, 2000000);

        System.out.println("=== Data Akun Premium ===");
        akun.cekLimit();
    }
}
