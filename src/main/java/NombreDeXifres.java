import java.util.Scanner;

public class NombreDeXifres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entra un número enter positiu:");
        int numero = sc.nextInt();

        int xifres = 0;
        int n = numero;

        while (n > 0) {
            n /= 10;
            xifres++;
        }

        System.out.println("El número " + numero + " té " + xifres + " xifres.");
    }
}
