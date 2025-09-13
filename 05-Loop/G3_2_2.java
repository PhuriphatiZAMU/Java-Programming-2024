import java.util.Scanner;
public class G3_2_2 {
  public static void main(String args[]) {

    Scanner input = new Scanner(System.in);

        System.out.println("Enter the mouth number: ");
        
        int mounthnum = input.nextInt();
        
        String mounth = switch (mounthnum) {
            
            case 1, 3, 5, 7, 8, 10, 12 -> ("31");
            
            case 2 -> ("28-29");
            
            case 4, 6, 9, 11 -> ("30");
            
            default -> ("ไม่มีเดือนดังกล่าว");
            
        };
        System.out.printf("%s วัน",mounth);
  }
}