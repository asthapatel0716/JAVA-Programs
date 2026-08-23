public class MatrixOperations {
    static int[] rowSums(int[][] matrix) {
        int[] sums = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sums[i] += matrix[i][j];
            }
        }
        return sums;
    }
    static int[] columnSums(int[][] matrix) {
        int[] sums = new int[matrix[0].length];
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                sums[j] += matrix[i][j];
            }
        }
        return sums;
    }
    static int[][] add(int[][] first, int[][] second) {
        if (first.length != second.length ||
            first[0].length != second[0].length) {
            throw new IllegalArgumentException("Matrices must have the same dimensions");
        }
        int[][] result = new int[first.length][first[0].length];
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[i].length; j++) {
                result[i][j] = first[i][j] + second[i][j];
            }
        }
        return result;
    }
    static int[][] transpose(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
    static int[][] multiply(int[][] first, int[][] second) {
        if (first.length == 0 || second.length == 0 ||
            first[0].length != second.length) {
            throw new IllegalArgumentException(
                "Number of columns of first matrix must equal number of rows of second matrix"
            );
        }
        int rows = first.length;
        int columns = second[0].length;
        int common = second.length;
        int[][] result = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += first[i][k] * second[k][j];
                }
            }
        }
        return result;
    }
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] first = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] second = {
            {7, 8, 9},
            {10, 11, 12}
        };
        System.out.println("First Matrix:");
        printMatrix(first);
        System.out.println("\nRow Sums:");
        int[] rows = rowSums(first);
        for (int value : rows) {
            System.out.print(value + " ");
        }
        System.out.println("\n\nColumn Sums:");
        int[] columns = columnSums(first);
        for (int value : columns) {
            System.out.print(value + " ");
        }
        System.out.println("\n\nAddition:");
        int[][] added = add(first, second);
        printMatrix(added);
        System.out.println("\nTranspose:");
        int[][] transposed = transpose(first);
        printMatrix(transposed);
        int[][] third = {
            {1, 2},
            {3, 4},
            {5, 6}
        };
        System.out.println("\nMultiplication:");
        int[][] multiplied = multiply(first, third);
        printMatrix(multiplied);
    }
}
