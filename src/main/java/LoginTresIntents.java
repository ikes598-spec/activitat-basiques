import java.util.Scanner;

public class LoginTresIntents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuariCorrecte = "cponts";
        String passwordCorrecte = "qw34T1234";

        int intents = 0;
        boolean encertat = false;

        while (intents < 3 && !encertat) {
            System.out.println("Introdueix el nom d'usuari:");
            String usuari = sc.nextLine();
            System.out.println("Introdueix la contrasenya:");
            String password = sc.nextLine();

            if (usuari.equals(usuariCorrecte) && password.equals(passwordCorrecte)) {
                System.out.println("Usuari i contrasenya correctes!");
                encertat = true;
            } else {
                System.out.println("Usuari o contrasenya incorrectes.");
                intents++;
            }
        }

        if (!encertat) {
            System.out.println("Usuari bloquejat!");
        }
    }
}
