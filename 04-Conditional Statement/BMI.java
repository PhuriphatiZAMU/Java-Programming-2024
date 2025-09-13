import java.util.Scanner;
public class BMI {
  public static void main(String args[]) {
    System.out.print("Height(cm): ");
      Scanner input = new Scanner(System.in);
      double Height = input.nextInt();
      double HeightM = Height / 100;
      System.out.println(HeightM + " m");
      
    System.out.print("Weight(Kg): ");
        double Weight = input.nextInt();
        
    double BMI = Weight / Math.pow(HeightM,2);
    System.out.print("Your BMI : " + BMI);
    
    if (BMI < 18.5){
        System.out.println(" น้ำหนักต่ำกว่าเกณฑ์");
    }
    else if (BMI < 23) {
        System.out.println(" สมส่วน");
    }
    else if (BMI < 25) {
        System.out.println(" น้ำหนักเกิน");
    }   
    else if (BMI < 30) {
        System.out.println(" โรคอ้วน");
    }
    else {
        System.out.println(" โรคอ้วนอันตราย");
    }    
      
    }
}
