public class MatrixUtilities {

    public static void show(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.println(matrix[row][column]);
            }
        }
    }

    public static boolean isMatrix(int[][] array) {
        int firstRowLength = array[0].length;
        for (int row = 1; row < array.length; row++) {
            if (array[row].length != firstRowLength) {
                return false;
            }
        }
        return true;
    }

    public static boolean isIdentity(int[][] identityMatrix) {
        int rows = identityMatrix.length;
        int columns = identityMatrix[0].length;
        if (rows != columns)
            return false;
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                if (row == column) {
                    if (identityMatrix[row][column] != 1)
                        return false;
                } else {
                    if (identityMatrix[row][column] != 0)
                        return false;
                }
            }
        }
        return true;
    }

    public static int[][] multiplyBy (int[][] matrix, int value) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] resultMatrix = new int[rows][columns];
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                resultMatrix[row][column] = matrix[row][column] * value;
            }
        }
        return resultMatrix;
    }
    public static boolean areCompatibleForSum(int[][] matrix1, int[][] matrix2) {
        boolean sameRows = matrix1.length == matrix2.length;
        boolean sameColumns = matrix1[0].length == matrix2[0].length;
        return sameRows && sameColumns;
    }

    public static int[][] sumOf(int[][] matrix1, int[][] matrix2) {
        if (!areCompatibleForSum(matrix1, matrix2)) {
            return null;
        }
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] sumMatrix = new int[rows][columns];
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                sumMatrix[row][column] = matrix1[row][column] + matrix2[row][column];
            }
        }
        return sumMatrix;
    }
}
