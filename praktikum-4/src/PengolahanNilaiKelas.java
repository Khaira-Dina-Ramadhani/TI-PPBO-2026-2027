import java.util.Scanner;
public class PengolahanNilaiKelas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //penentuan nilai kkm
        int KKM = 70;


        //meminta inputan jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();

        //membuat array untuk menyimpan nilai mahasiswa
        int[] nilai = new int[n];

        //memasukkan nilai setiap mahasisswa ke dalam array
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();

        }

        //menampilkan nilai sebelum di urutkan
        System.out.println("\n=======================================");
        System.out.println("        NILAI SEBELUM DIURUTKAN         ");
        System.out.println("========================================");

        for (int i = 0; i < nilai.length; i++) {
            System.out.print(nilai[i] + " ");

        }

        //menentukan nilai awal untuk nilai tertinggi dan terendah
        int tertinggi = nilai[0];
        int terendah = nilai[0];

        //variabel untuk menyimpan jumlah sebluruh nilai
        int total = 0;

        //variabel untuk menghitung siswa lulus dan tidak
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        //menghitung total, nilai tertinggi, terendah, dan jumlah kelulusan
        for (int i = 0; i < nilai.length; i++) {

            //menambahkan nilai ke total
            total += nilai[i];

            //mengecek nilai tertinggi
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];

            }

            //mengecek nilai terendah
            if (nilai[i] < terendah) {
                terendah = nilai[i];

            }
            //mengecek mahasiswa lulus atau tidak?
            if (nilai[i] >= KKM) {
                jumlahLulus++;

            } else {
                jumlahTidakLulus++;
            }
        }

        //menghitung rata rataa kelas
        double rataRata = (double) total / nilai.length;

        //mengurutkan nilai
        for (int i = 0; i < nilai.length - 1; i++) {
            for (int j = 0; j < nilai.length - 1 - i; j++) {

                //jika kiri lebih besar maka ditukar
                if (nilai[j] > nilai[j + 1]) {

                    //menyimpan nilai sementara
                    int temp = nilai[j];
                    //menukar posisi nilai
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;

                }
            }
        }

        //menampilkan laporan hasil pengolahan nilai
        System.out.println("\n\n=====================================");
        System.out.println("        LAPORAN NILAI KELAS         ");
        System.out.println("=====================================");
        System.out.println("Jumlah mahasiswa : " + n);
        System.out.println("KKM : " + KKM);
        System.out.println("Nilai rata-rata : " + rataRata);
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);
        System.out.println("Jumlah mahasiswa lulus : " + jumlahLulus);
        System.out.println("Jumlah mahasiswa tidak lulus : " + jumlahTidakLulus);

        //menampilkan nilai setelah diurutkan
        System.out.println("\n=========================================");
        System.out.println("        NILAI SETELAH DIURUTKAN");
        System.out.println("=========================================");

        for (int i = 0; i < nilai.length; i++){
            System.out.print(nilai[i] + " ");

        }
        System.out.println();

    }

}

