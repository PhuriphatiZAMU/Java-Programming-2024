import java.util.Scanner;
public class Divided {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("input n: ");
                int x = input.nextInt();

                for( int n = 1; n <= x; n++){
                    if( x % n != 0){
                        continue;}
                    System.out.println(n);
                    }                
    }
}
