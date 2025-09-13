import java.util.Scanner;
public class SumNTree {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("โปรดระบุเลข n: ");
        int n = input.nextInt();
        
        
        int num = 0; 
        for (int i = 1; i <= n; i++) { 
            for (int j = 1; j <= i; j++) { 
                num += i; 
                System.out.print(num + " ");
               
            }
            System.out.println();
        }
            
    }
}

