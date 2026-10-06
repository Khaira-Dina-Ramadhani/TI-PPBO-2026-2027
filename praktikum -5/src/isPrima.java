public class isPrima {

    //method untuk mengecek apakah bilangan merupakan bilangan prima
    static boolean isPrima(int n) {

        //bilangan kurang dari 2 bukan bilangan prima
        if (n < 2) {
            return false;
        }
        //mengecek pembagi dari 2 sampai akar kuadrat n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Bilangan prima dari 1 sampai 50: ");

        //mengecek setiap bil daari 1 sampai 50
        for (int i = 1; i <= 50; i++) {
            if (isPrima(i)) {
                System.out.print(i + " ");
                }
            }
        }
    }
