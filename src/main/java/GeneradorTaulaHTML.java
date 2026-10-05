import java.util.Scanner;

public class GeneradorTaulaHTML {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entra el número de files:");
        int files = sc.nextInt();
        System.out.println("Entra el número de columnes:");
        int columnes = sc.nextInt();

        System.out.println("<table border='1'>");
        for (int fila = 1; fila <= files; fila++) {
            System.out.println("    <tr>");
            for (int columna = 1; columna <= columnes; columna++) {
                System.out.println("        <td>" + fila + "," + columna + "</td>");
            }
            System.out.println("    </tr>");
        }
        System.out.println("</table>");
    }
}
