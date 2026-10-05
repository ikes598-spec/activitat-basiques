import java.util.Scanner;

public class SequenciaDe3en3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quin ha de ser el final de la seqüència?");
        int finalSeq = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= finalSeq; i += 3) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(i);
        }

        System.out.println(sb);
    }
}
