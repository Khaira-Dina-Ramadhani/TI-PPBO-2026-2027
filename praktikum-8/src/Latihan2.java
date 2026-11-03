public class Latihan2 {
    public static void main(String[] args) {

        Mobil mobil = new Mobil();
        mobil.merek = "Toyota";
        mobil.kecepatanMaks = 180;
        mobil.jumlahPintu = 4;

        System.out.println("=== Data Mobil ===");
        System.out.println("Merek: " + mobil.merek);
        System.out.println("Kecepatan Maksimal: " + mobil.kecepatanMaks + " km/jam");
        System.out.println("Jumlah Pintu: " + mobil.jumlahPintu);

        Motor motor = new Motor();
        motor.merek = "Honda";
        motor.kecepatanMaks = 120;
        motor.jenisMotor = "Matic";

        System.out.println("\n=== Data Motor ===");
        System.out.println("Merek: " + motor.merek);
        System.out.println("Kecepatan Maksimal: " + motor.kecepatanMaks + " km/jam");
        System.out.println("Jenis Motor: " + motor.jenisMotor);
    }
}
