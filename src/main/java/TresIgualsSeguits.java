import java.util.Scanner;

public class TresIgualsSeguits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entra un número:");
        int anterior = sc.nextInt();
        int seguits = 1;

        while (true) {
            System.out.println("Entra un número:");
            int numero = sc.nextInt();

            if (numero == anterior) {
                seguits++;
            } else {
                anterior = numero;
                seguits = 1;
            }

            if (seguits == 3) {
                System.out.println("Has entrat 3 cops seguits el número " + numero + ". Adeu!");
                break;
            }
        }
    }
}
