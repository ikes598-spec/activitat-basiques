import java.util.Random;
import java.util.Scanner;

public class PedraPaperTisoraA3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int puntsOrdinador = 0;
        int puntsUsuari = 0;

        while (puntsOrdinador < 3 && puntsUsuari < 3) {
            System.out.println("Entra pedra, paper o tisora:");
            String eleccioUsuari = sc.nextLine().toLowerCase();

            int eleccioOrdinador = random.nextInt(3);
            String valorOrdinador;
            if (eleccioOrdinador == 0) {
                valorOrdinador = "pedra";
            } else if (eleccioOrdinador == 1) {
                valorOrdinador = "paper";
            } else {
                valorOrdinador = "tisora";
            }

            System.out.println("Ordinador ha tret: " + valorOrdinador);

            if (eleccioUsuari.equals(valorOrdinador)) {
                System.out.println("Heu empatat!! Ordinador: " + puntsOrdinador + " , tú: " + puntsUsuari);
            } else if ((eleccioUsuari.equals("pedra") && valorOrdinador.equals("tisora"))
                    || (eleccioUsuari.equals("paper") && valorOrdinador.equals("pedra"))
                    || (eleccioUsuari.equals("tisora") && valorOrdinador.equals("paper"))) {
                puntsUsuari++;
                System.out.println("Has guanyat! Ordinador: " + puntsOrdinador + " , tú: " + puntsUsuari);
            } else {
                puntsOrdinador++;
                System.out.println("Has perdut! Ordinador: " + puntsOrdinador + " , tú: " + puntsUsuari);
            }
        }
    }
}
