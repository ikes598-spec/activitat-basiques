import java.util.Random;

public class GeneraFinsAl12 {
    public static void main(String[] args) {
        Random random = new Random();
        int numero;
        int iteracions = 0;

        do {
            numero = random.nextInt(16);
            iteracions++;

            if (numero != 12) {
                System.out.println("El número generat és: " + numero + ", falten " + Math.abs(12 - numero) + " per assolir l'objectiu.");
            }
        } while (numero != 12);

        System.out.println("Objectiu assolit en: " + iteracions + " iteracions");
    }
}
