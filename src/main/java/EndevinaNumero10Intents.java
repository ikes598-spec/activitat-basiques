import java.util.Random;
import java.util.Scanner;

public class EndevinaNumero10Intents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroSecret = random.nextInt(100) + 1;
        int intents = 0;
        boolean encertat = false;

        System.out.println("Endevina un número que he generat comprès entre 1 i 100");

        while (intents < 10 && !encertat) {
            intents++;
            System.out.print("Entra un número (intent " + intents + "): ");
            int numero = sc.nextInt();

            if (numero < numeroSecret) {
                System.out.println("El número que he generat és més gran que el que has pensat");
            } else if (numero > numeroSecret) {
                System.out.println("El número que he generat és més petit que el que has pensat");
            } else {
                System.out.println("L'has encertat!!");
                encertat = true;
            }
        }

        if (!encertat) {
            System.out.println("Has perdut. El número era " + numeroSecret);
        }
    }
}
