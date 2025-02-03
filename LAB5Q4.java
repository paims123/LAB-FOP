package lab5q4;

public class LAB5Q4 {

    public static void main(String[] args) {
        	
        int[][] matrix = {{1, 5, 7},{3, 6, 9},{5, 3, 8}};

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        int[][] rotated = rotate90Degrees(matrix);
        System.out.println("\nRotated Matrix:");
        printMatrix(rotated);
    }

    public static int[][] rotate90Degrees(int[][] matrix) {
        int n = matrix.length;
        int[][] result = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[j][n - 1 - i] = matrix[i][j];
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

		
		
	

