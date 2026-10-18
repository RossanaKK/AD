public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {5, 12, 7},
                {9, 3, 14}
        };
        MatrixUtilities.show(matrix);
        int[][] array = {
                {8, 2},
                {4, 15, 6},
                {1}
        };
        boolean result = MatrixUtilities.isMatrix(array);
        System.out.println(result);
        int[][] identityMatrix = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };
        boolean identity = MatrixUtilities.isIdentity(identityMatrix);
        System.out.println(identity);
        int[][] multiplication = MatrixUtilities.multiplyBy(matrix, 3);
        MatrixUtilities.show(multiplication);
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] matrix2 = {
                {7, 8, 9},
                {10, 11, 12}
        };
        boolean compatible = MatrixUtilities.areCompatibleForSum(matrix1, matrix2);
        System.out.println(compatible);
        int[][] sum = MatrixUtilities.sumOf(matrix1, matrix2);
        if (sum != null) {
            MatrixUtilities.show(sum);
        } else {
            System.out.println("Não foi possível somar as matrizes.");
        }
        CharacterDrawingUtilities.drawFilledRectangle('+', 12, 6);
        CharacterDrawingUtilities.drawEmptyRectangle('+', 12, 6);
    }
}

