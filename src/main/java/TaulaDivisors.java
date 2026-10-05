import java.util.Scanner;

public class TaulaDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entra l'inici dels dividends:");
        int inici = sc.nextInt();
        System.out.println("Entra el final dels dividends:");
        int fi = sc.nextInt();

        System.out.print("     ");
        for (int dividend = inici; dividend <= fi; dividend++) {
            System.out.printf("%3d", dividend);
        }
        System.out.println();

        for (int divisor = 1; divisor <= 10; divisor++) {
            System.out.printf("%2d  ", divisor);
            for (int dividend = inici; dividend <= fi; dividend++) {
                if (dividend % divisor == 0) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
    }
}
