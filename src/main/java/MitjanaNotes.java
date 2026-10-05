import java.util.Scanner;

public class MitjanaNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quants alumnes hi ha al grup?");
        int alumnes = sc.nextInt();

        double suma = 0;
        for (int i = 1; i <= alumnes; i++) {
            System.out.println("Entra la nota de l'alumne " + i + ":");
            suma += sc.nextDouble();
        }

        double mitjana = suma / alumnes;
        System.out.println("La mitjana de les notes és: " + mitjana);
    }
}
