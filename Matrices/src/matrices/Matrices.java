package matrices;

public class Matrices
{
    public static void main(String[] args)
    {
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int[][] matrix2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };
        
        int[][] result = addMatrices(matrix1, matrix2);
        
        for (int[] row : result)
        {
            for (int value : row)
            {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
    
    static int[][] addMatrices(int[][] matrix1, int[][] matrix2)
    {
        int rows = matrix1.length;
        int columns = matrix2[0].length;
        
        if (matrix2.length != rows || matrix2[0].length != columns)
        {
            throw new IllegalArgumentException("Matrices must have the same dimensions");
        }
        
        int[][] result = new int[rows][columns];
        
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }
}
