public class TriangleInvertit {
    public static void main(String[] args) {
        for (int fila = 9; fila >= 1; fila--) {
            for (int columna = 1; columna <= fila; columna++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
