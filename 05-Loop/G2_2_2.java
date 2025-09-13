import java.util.Scanner;
public class G2_2_2 {
  public static void main(String args[]) {

 		   Scanner input = new Scanner(System.in);

   	                 System.out.println("Enter a-z: ");
        
        			 char eng = input.next().charAt(0);
        
        			    String ENG = switch (eng) {
            
            				case 'a', 'e', 'i', 'o', 'u' -> ("เป็นสระ");
            
            				default -> ("เป็นพยัญชระ");
            
       				 };
        			System.out.printf("%s",ENG);
  }
}