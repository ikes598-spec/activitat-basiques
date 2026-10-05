import java.util.Scanner;

public class MultiplicarAmbSumes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Operand 1:");
        int operand1 = sc.nextInt();
        System.out.println("Operand 2:");
        int operand2 = sc.nextInt();

        int producte = 0;
        for (int i = 0; i < operand2; i++) {
            producte += operand1;
        }

        System.out.print(operand1);
        for (int i = 1; i < operand2; i++) {
            System.out.print(" + " + operand1);
        }
        System.out.println(" = " + producte);
    }
}
