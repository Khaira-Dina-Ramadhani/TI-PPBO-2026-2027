import java.util.Scanner;

/*
 *Program kalkulator bangun datar
 * Program menghitung luas dan keliling persegi panjang
 * juga menampilkan luas serta keliling lingkaran
 */
public class KalkulatorBangunDatar {
    public static void main(String[] args) {

        //membuat objek scanner untuk menerima inputan dari user
        Scanner sc = new Scanner(System.in);

        //meminta input panjang persegi panjangnya
        System.out.print("Masukkan panjang: ");
        double panjang = sc.nextDouble();

        //Meminta inputan lebar persegi panjang
        System.out.print("Masukkan lebar: ");
        double lebar = sc.nextDouble();

        //menghitung luas persegi panjang
        double luasPersegiPanjang = panjang * lebar;

        //menghitung keliling persegi panajng
        double kelilingPersegiPanjang = 2 * (panjang + lebar);

        //menampilkan hasil luas persegi panjang
        System.out.println("Luas persegi panjang: " + luasPersegiPanjang);

        //menampilkan hasil keliling persegi panjang
        System.out.println("Keliling persegi panjang: " + kelilingPersegiPanjang);

        //mengecek apakah luas persegi panjang lebih dari 100
        boolean luasBesar = luasPersegiPanjang > 100;

        //menampilkan nilai boolean luasBesar
        System.out.println("luasBesar: " + luasBesar);

        //meminta input jari jari lingkaran
        System.out.print("Masukkan jari jari lingkaran: " );
        double jariJari = sc.nextDouble();

        //menghitung luas lingkaran menggunakan Math.PI
        double luasLingkaran = Math.PI * jariJari * jariJari;

        //menghitung keliling lingkaran menggunakan Math.PI
        double kelilingLingkaran = 2 * Math.PI * jariJari;

        //menampilkan hasil luas lingkaran
        System.out.println("Luas lingkaran: " + luasLingkaran);

        //menampilkan hasil keliling lingkaran
        System.out.println("Keliling lingkaran: " + kelilingLingkaran);

        //menutup scanner setelah selesai digunakan
        sc.close();

    }
}
