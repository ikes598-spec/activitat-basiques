import java.util.Scanner;

public class HoresMinutsSegons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 4; i++) {
            System.out.println("Entra els segons:");
            int segons = sc.nextInt();

            int hores = segons / 3600;
            int minuts = (segons % 3600) / 60;
            int segonsRestants = segons % 60;

            System.out.println("Hores: " + hores);
            System.out.println("Minuts: " + minuts);
            System.out.println("Segons: " + segonsRestants);
        }
    }
}
