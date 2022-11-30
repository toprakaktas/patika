public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("Matrix: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }

        System.out.println("Transpose: ");

        for (int row = 0; row < matrix.length+1; row++) {
            for (int column = 0; column < matrix.length; column++) {
                System.out.print(matrix[column][row] + " ");
            }
            System.out.println();
        }
    }
}

