import java.util.Scanner;

public class TemperaturaBucleN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantes temperatures vols convertir?");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Entra la temperatura:");
            double temperaturaF = sc.nextDouble();
            double temperaturaC = ((temperaturaF - 32) * 5) / 9;
            System.out.println(temperaturaF + " °F equivalen a " + temperaturaC + " °C");
        }
    }
}
