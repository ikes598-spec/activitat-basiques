import java.util.Scanner;

public class TaulaMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entra un número:");
        int numero = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " × " + i + " = " + (numero * i));
        }
    }
}
