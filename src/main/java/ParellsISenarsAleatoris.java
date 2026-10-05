import java.util.Random;
import java.util.Scanner;

public class ParellsISenarsAleatoris {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Quants números vols generar?");
        int n = sc.nextInt();

        int parells = 0;
        int senars = 0;

        for (int i = 0; i < n; i++) {
            int numero = random.nextInt(100) + 1;
            if (numero % 2 == 0) {
                parells++;
            } else {
                senars++;
            }
        }

        System.out.println("Han sortit " + parells + " números parells i " + senars + " senars");
    }
}
