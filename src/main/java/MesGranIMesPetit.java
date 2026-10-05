import java.util.Scanner;

public class MesGranIMesPetit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mesGran = 0;
        int mesPetit = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.println("Introdueix un número:");
            int numero = sc.nextInt();

            if (i == 1) {
                mesGran = numero;
                mesPetit = numero;
            } else {
                if (numero > mesGran) {
                    mesGran = numero;
                }
                if (numero < mesPetit) {
                    mesPetit = numero;
                }
            }
        }

        System.out.println("El número més gran és: " + mesGran + " i el més petit: " + mesPetit);
    }
}
