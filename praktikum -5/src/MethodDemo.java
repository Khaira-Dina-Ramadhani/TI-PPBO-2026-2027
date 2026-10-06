public class MethodDemo {
    //method void: tidak mengembalikan nilai apa pun
    static void sapa(String nama) {
        System.out.println("Halo, " + nama + "!");
    }

    static void tampilkanBiodata(String nama, int umur, String kota) {
        System.out.println(nama + "(" + umur + " tahun) - " + kota);
    }

    public static void main(String[] args) {

    //panggil pada method main:
    sapa("budi");
    sapa("siti");

    //panggil pada method main:
    tampilkanBiodata("Budi", 20, "Bandung");
}
}
