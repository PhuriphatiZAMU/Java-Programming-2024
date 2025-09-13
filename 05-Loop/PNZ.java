import java.util.Scanner;

public class PNZ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to input a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Determine if the number is Positive, Negative, or Zero
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        
    }
}
