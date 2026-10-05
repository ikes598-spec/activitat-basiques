public class TriangleAsteriscs {
    public static void main(String[] args) {
        for (int fila = 1; fila <= 9; fila++) {
            for (int columna = 1; columna <= fila; columna++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
