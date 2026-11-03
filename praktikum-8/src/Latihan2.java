public class Latihan2 {
    public static void main(String[] args) {

        Mobil mobil = new Mobil("Toyota", 180, 4);

        System.out.println("=== Data Mobil ===");
        mobil.tampilkanInfo();
        System.out.println("Jumlah Pintu: " + mobil.jumlahPintu);

        Motor motor = new Motor("Honda", 120, "Matic");

        System.out.println("\n=== Data Motor ===");
        System.out.println("Merek: " + motor.merek);
        System.out.println("Kecepatan Maksimal: " + motor.kecepatanMaks + " km/jam");
        System.out.println("Jenis Motor: " + motor.jenisMotor);
    }
}
