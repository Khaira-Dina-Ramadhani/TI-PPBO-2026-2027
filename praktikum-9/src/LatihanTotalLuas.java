public class LatihanTotalLuas {
    public static void main(String[] args) {
    BangunDatar[] daftarBangun = {
            new Lingkaran("Lingkaran", 7),
            new Persegi("Persegi", 5),
            new Lingkaran("Lingkaran", 3),
            new Persegi("Persegi", 4)
    };
   double totalLuas = 0;

   for (BangunDatar bangun : daftarBangun) {
       totalLuas += bangun.hitungLuas();
   }
   System.out.println("Total luas: " + totalLuas);
    }
}
