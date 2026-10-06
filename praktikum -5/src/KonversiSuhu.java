public class KonversiSuhu {

    //overloading pertama:
    //celsius dikonversi menjadi fahrenheit
    static double konversiSuhu(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    //overloading kedua:
    //celsius dikonversi sesuai skala tujuan
    static double konversiSuhu(double celsius, String skalaTujuan) {

        if (skalaTujuan.equalsIgnoreCase("Kelvin")) {
            return celsius + 273.15;
        } else if (skalaTujuan.equalsIgnoreCase("Fahrenheit")) {
            return (celsius * 9 / 5) + 32;
        } else {
            System.out.println("Skala tidak tersedia.");
            return 0;
        }
    }
    public static void main(String[] args) {

        // Memanggil method pertama
        System.out.println("25 Celsius ke Fahrenheit = " + konversiSuhu(25));

        //memanggil method kedua
        System.out.println("25 Celsius ke fahrenheit = " + konversiSuhu(25, "Kelvin"));
        System.out.println("25 Celsius ke fahrenheit = " + konversiSuhu(25, "Fahrenheit"));
    }
}
