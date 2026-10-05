import java.util.Scanner;

public class TemperaturaBucle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Introdueix la temperatura en Fahrenheit (" + i + "/5): ");
            double temperaturaF = sc.nextDouble();
            double temperaturaC = ((temperaturaF - 32) * 5) / 9;
            System.out.println(temperaturaF + " °F equivalen a " + temperaturaC + " °C");
        }
    }
}
