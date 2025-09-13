import java.util.Scanner;
public class SimpleCalculator {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    System.out.println("Simple Arithmetic Calculator");
    
    System.out.print("Enter the first number: ");
    double num1 = input.nextDouble();
    
    System.out.print("Enter the second number: ");
    double num2 = input.nextDouble();
    
    System.out.print("Enter an operator (+, -, *, /, ^): ");
    char operator = input.next().charAt(0);
    
    double result = switch (operator){
        case '+'-> num1 + num2;
        case '-'-> num1 - num2;
        case '*'-> num1 * num2;
        case '/'-> num1 / num2;
        case '^'-> Math.pow(num1,num2);
        default -> throw new IllegalArgumentException("Invalid operator!");
       
    };
    System.out.print(num1 + " " + operator + " " + num2 + "=" + result);
    }
}