import java.util.Scanner;
public class KalkulatorMethod {
    //method untuk penjumlah 2 angka
    static double tambah(double a, double b) {
        return a + b;
    }
    //method overloading untuk penjumlah 3 angka
    static double tambah(double a, double b, double c) {
        return a + b + c;
    }
    //method untuk pengurang
    static double kurang(double a, double b) {
        return a - b;
    }
    //method untuk perkalian
    static double kali(double a, double b) {
        return a * b;
    }
    //method untuk bagi
    static double bagi(double a, double b) {
        return a / b;
    }
    //method untuk perpangkatan
    static double pangkat(double a, double b) {
        return Math.pow(a, b);
    }
    //method untuk akar kuadrat
    static double akarKuadrat(double a){
        return Math.sqrt(a);
    }
    //method untuk mencari hasil terbesar dari riwayat
    static double riwayatKeMaksimum(double[] riwayatHasil) {
        double maksimum = riwayatHasil[0];

        for (double hasil : riwayatHasil) {
            if (hasil > maksimum) {
                maksimum = hasil;
            }
        }
        return maksimum;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Array untuk menyimpan riwayat hasil perghitungan
        double[] riwayatHasil = new double[100];

        //menyimpan jumlah hasi yg sudah dimasukkan
        int jumlahRiwayat = 0;

        int pilihan;

        do {
            System.out.println("\n==== KALKULATOR METHOD ====");
            System.out.println("1. Tambah 2 angka");
            System.out.println("2. Tambah 3 angka");
            System.out.println("3. Kurang");
            System.out.println("4. Kali");
            System.out.println("5. Bagi");
            System.out.println("6. Pangkat");
            System.out.println("7. Akar Kuadrat");
            System.out.println("0. Keluar");
            System.out.print("Pilih Operasi: ");
            pilihan = input.nextInt();

            double hasil = 0;

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan angka pertama: ");
                    double a = input.nextDouble();

                    System.out.print("Masukkan angka kedua: ");
                    double b = input.nextDouble();

                    hasil = tambah(a, b);
                    System.out.println("Hasil: " + hasil);
                    riwayatHasil[jumlahRiwayat] = hasil;
                    jumlahRiwayat++;
                    break;

                case 2:
                    System.out.print("Masukkan angka pertama: ");
                    double x = input.nextDouble();

                    System.out.print("Masukkan angka kedua: ");
                    double y = input.nextDouble();

                    System.out.print("Masukkan angka ketiga: ");
                    double z = input.nextDouble();

                    hasil = tambah(x, y, z);

                    System.out.println("Hasil: " + hasil);

                    riwayatHasil[jumlahRiwayat] = hasil;
                    jumlahRiwayat++;
                    break;

                case 3:
                    System.out.print("Masukkan angka pertama: ");
                    double kurangA = input.nextDouble();

                    System.out.print("Masukkan angka kedua: ");
                    double kurangB = input.nextDouble();

                    hasil = kurang(kurangA, kurangB);

                    System.out.println("Hasil: " + hasil);

                    riwayatHasil[jumlahRiwayat] = hasil;
                    jumlahRiwayat++;
                    break;

                case 4:
                    System.out.print("Masukkan angka pertama: ");
                    double kaliA = input.nextDouble();

                    System.out.print("Masukkan angka kedua: ");
                    double kaliB = input.nextDouble();

                    hasil = kali(kaliA, kaliB);

                    System.out.println("Hasil: " + hasil);

                    riwayatHasil[jumlahRiwayat] = hasil;
                    jumlahRiwayat++;
                    break;

                case 5:
                    System.out.print("Masukkan angka pertama: ");
                    double bagiA = input.nextDouble();

                    System.out.print("Masukkan angka kedua: ");
                    double bagiB = input.nextDouble();

                    if (bagiB == 0) {
                        System.out.println("Error: tidak boleh membagi dengan 0.");
                    } else {
                        hasil = bagi(bagiA, bagiB);

                        System.out.println("Hasil: " + hasil);

                        riwayatHasil[jumlahRiwayat] = hasil;
                        jumlahRiwayat++;
                    }
                    break;
                case 6:
                    System.out.print("Masukkan angka: ");
                    double pangkatA = input.nextDouble();

                    System.out.print("Masukkan pangkat: ");
                    double pangkatB = input.nextDouble();

                    hasil = pangkat(pangkatA, pangkatB);

                    System.out.println("Hasil: " + hasil);

                    riwayatHasil[jumlahRiwayat] = hasil;
                    jumlahRiwayat++;
                    break;

                case 7:
                    System.out.print("Masukkan angka: ");
                    double akar = input.nextDouble();

                    if (akar < 0) {
                        System.out.println("Error: angka tidak boleh negatif.");
                    } else {
                        hasil = akarKuadrat(akar);

                        System.out.println("Hasil: " + hasil);

                        riwayatHasil[jumlahRiwayat] = hasil;
                        jumlahRiwayat++;
                    }
                    break;
                case 0:
                    System.out.println("\nProgram selesai.");

                    if (jumlahRiwayat > 0) {
                        // Membuat array baru sesuai jumlah riwayat
                        double[] dataRiwayat = new double[jumlahRiwayat];

                        for (int i = 0; i < jumlahRiwayat; i++) {
                            dataRiwayat[i] = riwayatHasil[i];
                        }

                        System.out.println("Hasil maksimum dari riwayat: "
                                + riwayatKeMaksimum(dataRiwayat));
                    } else {
                        System.out.println("Belum ada hasil perhitungan.");
                    }
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }

        } while (pilihan != 0);

        input.close();
    }

}
