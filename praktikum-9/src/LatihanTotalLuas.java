public class LatihanTotalLuas {
    public static void main(String[] args) {
    BangunDatar[] daftarBangun = {
            new Lingkaran(7),
            new Persegi(5),
            new Lingkaran(3),
            new Persegi(4)
    };
   double totalLuas = 0;

   for (BangunDatar bangun : daftarBangun) {
       totalLuas += bangun.hitungLuas();
   }
   System.out.println("Total luas: " + totalLuas);
    }
}
