public abstract class BangunDatar {
    protected String namaBangun;

    public BangunDatar(String namaBangun) {
        this.namaBangun = namaBangun;
    }

    public abstract double hitungLuas();
    public abstract double hitungKeliling();

    public void tampilkanInfo() {
        System.out.println("Bangun : " + namaBangun);
        System.out.println("Luas : " + hitungLuas());
        System.out.println("Keliling : " + hitungKeliling());
        System.out.println("---------------------------------");
    }
}