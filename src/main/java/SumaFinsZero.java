import java.util.Scanner;

public class SumaFinsZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;

        while (true) {
            System.out.print("Introdueix un número: ");
            int numero = sc.nextInt();

            if (numero == 0) {
                System.out.println("La suma total dels números introduïts és: " + suma);
                break;
            }

            suma += numero;
            System.out.println("La suma fins ara és " + suma);
        }
    }
}
