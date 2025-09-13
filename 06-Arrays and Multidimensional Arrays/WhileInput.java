import java.util.Scanner;
public class WhileInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Enter a number: ");
            int num = input.nextInt();

            if (num == -1) {
                break;
            }
            
            sum += num;
        }

        System.out.println("\nSum of positive numbers: " + sum);
        input.close();
    }
}
