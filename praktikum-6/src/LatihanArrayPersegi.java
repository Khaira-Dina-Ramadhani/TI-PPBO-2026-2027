public class LatihanArrayPersegi {
    public static void main(String[] args) {

        Persegi[] daftarPersegi = {
                new Persegi(4),
                new Persegi(7),
                new Persegi(3),
                new Persegi(10),
                new Persegi(6)
        };
    Persegi terbesar = daftarPersegi[0];

        for (int i = 1; i < daftarPersegi.length; i++) {
            if (daftarPersegi[i].hitungLuas() > terbesar.hitungLuas()) {
                terbesar = daftarPersegi[i];
            }
        }
        System.out.println("===PERSEGI DENGAN LUAS TERBESAR===");
        System.out.println("Sisi: " + terbesar.sisi);
        System.out.println("Luas: " + terbesar.hitungLuas());
        System.out.println("Keliling: " + terbesar.hitungKeliling());
    }
}
