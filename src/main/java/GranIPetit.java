import java.util.Scanner;

public class GranIPetit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entra el número gran:");
        int gran = sc.nextInt();

        System.out.println("Entra el número petit:");
        int petit = sc.nextInt();

        while (gran > petit) {
            System.out.println("Gran = " + gran + "   Petit = " + petit);
            gran = gran / 2;
            petit = petit * 2;
        }
    }
}
