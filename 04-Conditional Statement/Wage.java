import java.util.Scanner;
public class Wage {
  public static void main(String args[]) {
//   input
    Scanner input = new Scanner(System.in);
    System.out.print("Rate: ");
    double rate = input.nextDouble();
    
    System.out.print("Hours: ");
    double hours = input.nextDouble();
    
//  Process
    double pay = 0;
    
    if (hours > 40){
        pay = 40 * rate + (hours - 40) * rate * 1.5;
    }
    else{
        pay = hours * rate;
    }
  
    System.out.print("Payment: "+pay+" ฿");
  }
}