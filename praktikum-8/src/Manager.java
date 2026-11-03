 public class Manager extends Pegawai{
    private double tunjanganJabatan;

    public Manager(String nama, String nip, double gajiPokok, double tunjanganJabatan) {
        super(nama, nip, gajiPokok); //panggil constructor pegawai
        //didalam constructor manager, setelah super
        System.out.println("2. Constrctor manager dijalankan");
        this.tunjanganJabatan = tunjanganJabatan;

    }
}
