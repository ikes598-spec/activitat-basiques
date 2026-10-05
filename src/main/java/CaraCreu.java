import java.util.Random;

public class CaraCreu {
    public static void main(String[] args) {
        Random random = new Random();
        int creus = 0;

        for (int i = 0; i < 100; i++) {
            if (random.nextInt(2) == 1) {
                creus++;
            }
        }

        int cares = 100 - creus;
        System.out.println("Cares: " + cares);
        System.out.println("Creus: " + creus);
    }
}
