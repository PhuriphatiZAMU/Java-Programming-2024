import java.util.Scanner;
public class Even {
  public static void main(String args[]) {
    
    Scanner input = new Scanner(System.in);
    
        System.out.println("ป้อนตัวเลข: ");
    
        int n = input.nextInt();
        
	    System.out.println("เลขคู่ระหว่าง 1 ถึง 10: ");
	
        for (int i = 2;  i <= n; i= i+2){
            
            System.out.println(i);
            
        }
    
  }
}