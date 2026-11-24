public class CetakDemo {
    public static void main(String[] args){

        Cetak[] daftarCetak = {
                new Laporan(),
                new Struk()
        };

        for (Cetak c : daftarCetak) {
            c.cetak();
        }
    }
}
