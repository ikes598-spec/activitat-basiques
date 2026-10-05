import java.util.Scanner;

public class PositiuNegatiuFinsZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Introdueix un número: ");
            int numero = sc.nextInt();

            if (numero == 0) {
                System.out.println("Adeu!");
                break;
            }

            if (numero > 0) {
                System.out.println("És positiu");
            } else {
                System.out.println("És negatiu");
            }
        }
    }
}
