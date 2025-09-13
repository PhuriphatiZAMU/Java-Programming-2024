import java.util.Scanner;

public class Sum35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ป้อนค่า n: ");
        int n = input.nextInt();

        int sum = 0; 
        
        for (int i = 1; i <= n; i++) { 
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        System.out.println("ผลรวมของเลขที่หารด้วย 3 หรือ 5 ลงตัว: " + sum);
    }
}
