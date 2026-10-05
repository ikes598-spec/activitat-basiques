import java.util.Scanner;

public class PositiuNegatiuZeroBucle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 8; i++) {
            System.out.print("Entra el número " + i + ": ");
            int numero = sc.nextInt();

            if (numero > 0) {
                System.out.println("és positiu");
            } else if (numero < 0) {
                System.out.println("és negatiu");
            } else {
                System.out.println("és un zero");
            }
        }
    }
}
