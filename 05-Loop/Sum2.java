import java.util.Scanner;
public class Sum2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n = input.nextInt();
        System.out.print("Enter m: ");
        int m = input.nextInt();
            if (m > n){
                int sum = 0;
                for (int i = n; i <= m; i++){
                    sum += i;
                }
                System.out.println(sum);
            }
    }

}

