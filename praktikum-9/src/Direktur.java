public class Direktur extends Manager{
    private double tunjanganSaham;

    public direktur(String nama, String nip, double gajiPokok, double tunjanganJabatan, doubleSaham){
        super(nama, nip, gajiPokok, tunjanganJabatan);
        this.tunjanganSaham = tunjanganSaham;
    }
    @Override
    public double hitungGaji() {
        return super.hitungGaji() + tunjanganSaham;
    }
}
