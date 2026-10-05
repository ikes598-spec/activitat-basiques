public class DiagonalAmbE {
    public static void main(String[] args) {
        for (int fila = 1; fila <= 9; fila++) {
            for (int columna = 1; columna <= 9; columna++) {
                if (fila == columna) {
                    System.out.print("E ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
