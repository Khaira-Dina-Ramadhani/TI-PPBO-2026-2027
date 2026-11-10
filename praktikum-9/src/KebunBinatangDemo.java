public class KebunBinatangDemo {
    public static void main(String[] args) {
        Hewan[] daftarHewan = {
                new Kucing("milo"),
                new Anjing("rex"),
                new Kucing("oyen"),

        };
        for (Hewan h : daftarHewan){
            h.bersuara(); //versi method sesuai object asliny
        }

        Hewan h1 =  new Kucing("Milo"); //reference hewan, object kucing
        Hewan h2 =  new Anjing("Rex"); //reference hewan, object anjing
    }
}
