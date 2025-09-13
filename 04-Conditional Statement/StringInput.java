import java.util.Scanner;
public class StringInput {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    System.out.print("text1: ");
    String text1 = input.next(); 
    input.nextLine();
    System.out.print("text2: ");
    String text2 = input.nextLine(); // Read the entire line of text


    System.out.println(text1 + " " +text2);
  }
}