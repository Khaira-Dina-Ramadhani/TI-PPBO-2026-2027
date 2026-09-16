import java.util.Scanner;
public class HitungTarifListrik {

        static final double TARIF_450 = 500;
        static final double TARIF_900 = 750;
        static final double TARIF_1300 = 1200;
        static final double TARIF_2200 = 1500;
        static final double TARIF_DI_ATAS_2200 = 1800;

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Masukkan golongan daya (VA): ");
            int daya = sc.nextInt();

            System.out.print("Masukkan pemakaian listrik (kWh): ");
            double kwh = sc.nextDouble();

            if (kwh <= 0){
                System.out.println("Eror: pemakaian kWh harus lebih dari 0.");
                return;
            }
            double tarif;
            String golongan;

            switch (daya) {
                case 450:
                    golongan = "450 VA";
                    tarif = TARIF_450;
                    break;
                case 900:
                    golongan = "900 VA";
                    tarif = TARIF_900;
                    break;
                case 1300:
                    golongan = "1300 VA";
                    tarif = TARIF_1300;
                    break;
                case 2200:
                    golongan = "2200 VA";
                    tarif = TARIF_2200;
                    break;

                default:
                    if (daya > 220) {
                        golongan = "Di atas 2200 VA";
                        tarif = TARIF_DI_ATAS_2200;
                    } else {
                        System.out.println("Error: Golongan daya tidak valid.");
                        return;
                    }

            }
            double total = kwh * tarif;

            System.out.println("\n=====TAGIHAN LISTRIK=====");
            System.out.println("Golongan daya : " + golongan);
            System.out.println("Pemakaian     :" + kwh + "kWh");
            System.out.println("Tarif per kWh:Rp" + tarif);
            System.out.println("Total Tagihan :Rp" + total);
            System.out.println("===========================");

        }
}
