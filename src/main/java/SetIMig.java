import java.util.Random;
import java.util.Scanner;

public class SetIMig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Quant vols apostar?");
        double aposta = sc.nextDouble();

        double total = 0;
        char seguir = 's';

        while (total < 7.5 && seguir == 's') {
            int carta = random.nextInt(10) + 1;
            double valor;

            if (carta >= 1 && carta <= 7) {
                valor = carta;
            } else {
                valor = 0.5;
            }

            total += valor;

            String nomCarta;
            if (carta == 8) {
                nomCarta = "sota";
            } else if (carta == 9) {
                nomCarta = "cavall";
            } else if (carta == 10) {
                nomCarta = "rei";
            } else {
                nomCarta = String.valueOf(carta);
            }

            System.out.println("Has tret un " + nomCarta + " (val " + valor + " punts). Portes " + total + " punts.");

            if (total > 7.5) {
                System.out.println("Has Perdut!!!!");
                seguir = 'n';
            } else if (total == 7.5) {
                System.out.println("Has Guanyat " + (aposta * 2) + " euros.");
                seguir = 'n';
            } else {
                System.out.print("Vols una altra carta? (s/n) ");
                seguir = sc.next().charAt(0);
                if (seguir != 's') {
                    System.out.println("El jugador es planta!!!");
                }
            }
        }
    }
}
