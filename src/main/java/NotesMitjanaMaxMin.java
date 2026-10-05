import java.util.Scanner;

public class NotesMitjanaMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quants alumnes hi ha al grup?");
        int alumnes = sc.nextInt();

        double suma = 0;
        double notaMaxima = Double.MIN_VALUE;
        double notaMinima = Double.MAX_VALUE;

        for (int i = 1; i <= alumnes; i++) {
            System.out.println("Entra la nota de l'alumne " + i + ":");
            double nota = sc.nextDouble();
            suma += nota;

            if (nota > notaMaxima) {
                notaMaxima = nota;
            }
            if (nota < notaMinima) {
                notaMinima = nota;
            }
        }

        double mitjana = suma / alumnes;
        System.out.println("La mitjana de les notes és: " + mitjana);
        System.out.println("La nota més gran és: " + notaMaxima);
        System.out.println("La nota més petita és: " + notaMinima);
    }
}
