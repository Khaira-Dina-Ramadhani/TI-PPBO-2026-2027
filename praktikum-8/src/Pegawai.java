public class Pegawai {
    private String nama;
    protected String nip;
    protected Double gajiPokok;

    public Pegawai(String nama, String nip, double gajiPokok) {
        System.out.println("1. Constructor pegawai dijalankan");
        this.nama = nama;
        this.nip = nip;
        this.gajiPokok = gajiPokok;

    }
    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("NIP: " + nip);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}
