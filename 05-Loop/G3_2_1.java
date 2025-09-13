import java.util.Scanner;
public class G3_2_1 {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    
        System.out.println("Enter two numbers: ");
        
        int a = input.nextInt();
        int b = input.nextInt();
        
        if (a > b){
            
            System.out.println("a > b");
            
        }else if (a < b){
            
            System.out.println("a < b");
            
        }else{
            
            System.out.println("a = b");
            
        }
        
  }
}