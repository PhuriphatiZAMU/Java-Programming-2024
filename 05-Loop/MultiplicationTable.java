import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input n: ");
        int n = input.nextInt();
        for (int i = 1;  i <= 12;  i++) {
            int y = n * i;
        System.out.println(n + "*" + i +" = "+y);
        }
    }



    }
    

