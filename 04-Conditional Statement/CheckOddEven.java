import java.util.Scanner;
public class CheckOddEven {   // saved as "CheckOddEven.java"
   @SuppressWarnings("resource")
   public static void main(String[] args) {
      System.out.print("Enter an integer: ");
      Scanner input = new Scanner(System.in);
      int number = input.nextInt();       // set the value of number here!
      System.out.println("The number is " + number);
      if (number % 2 == 0) {
         System.out.println("number is even");
      } else {
         System.out.println("number is odd");
      }
   }
}