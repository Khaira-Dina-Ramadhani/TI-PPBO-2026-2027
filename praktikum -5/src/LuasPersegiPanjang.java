public class LuasPersegiPanjang {
    //method untuk menghitung luas persegi panjang
    static double luasPersegiPanjang(double p, double I) {
        return p*I;
    }

    //method untuk menghitung luas lingkaran
    static double LuasLingkaran(double r) {
        return Math.PI*r*r;
    }
    public static void main(String[] args) {
        //memanggil method luas persegi panjang
        System.out.println("Luas Persegi Panjang:");
        System.out.println("Panjang 10, Lebar 5=" +luasPersegiPanjang(10,5));
        System.out.println("Panjang 8, Lebar 4=" +luasPersegiPanjang(8,4));

        //memanggil method luar lingkaran
        System.out.println("\nLuas Lingkaran: ");
        System.out.println("Jari-jari 7= " + LuasLingkaran(7));
        System.out.println("Jari-jari 10= " + LuasLingkaran(10));
    }
}
