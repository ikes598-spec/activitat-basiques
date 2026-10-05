import java.util.Scanner;

public class SumaMesDe21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;

        while (suma <= 21) {
            System.out.print("Entra número: ");
            int numero = sc.nextInt();

            if (numero >= 1 && numero <= 5) {
                suma += numero;
                if (suma > 21) {
                    System.out.println("Més de 21! La suma dels números entrats és " + suma);
                    break;
                }
            } else {
                System.out.println("El número no és correcte!");
            }
        }
    }
}
