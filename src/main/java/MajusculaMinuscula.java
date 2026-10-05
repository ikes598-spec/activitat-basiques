import java.util.Scanner;

public class MajusculaMinuscula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print("Entra un caràcter: ");
            char lletra = sc.next().charAt(0);

            if (lletra >= 'A' && lletra <= 'Z') {
                System.out.println("és una lletra majúscula");
            } else if (lletra >= 'a' && lletra <= 'z') {
                System.out.println("és una lletra minúscula");
            } else {
                System.out.println("no és una lletra");
            }
        }
    }
}
