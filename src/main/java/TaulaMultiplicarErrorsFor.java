import java.util.Scanner;

public class TaulaMultiplicarErrorsFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entra un número:");
        int numero = sc.nextInt();

        int errors = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print(numero + " × " + i + " = ");
            int resposta = sc.nextInt();

            if (resposta == numero * i) {
                System.out.println("correcte!");
            } else {
                System.out.println("incorrecte!");
                errors++;
            }
        }

        System.out.println("Has comès " + errors + " errors!");
    }
}
