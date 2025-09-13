import java.util.Scanner;
public class Array2DInput {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int matrix[][] = new int [5][4];
        
        System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns: ");

            for (int i = 0; i < matrix.length; i++) {
        
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = input.nextInt();
                }
            }
            for (int i = 0; i < matrix.length; i++) {
        
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
    }
}
