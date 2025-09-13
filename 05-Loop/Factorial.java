import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // รับค่า n จากผู้ใช้
        System.out.print("Enter an integer n: ");
        int n = input.nextInt();

        // ตรวจสอบว่าค่า n ต้องไม่ติดลบ
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // คำนวณ Factorial ด้วย for loop
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            // แสดงผลลัพธ์
            System.out.println(factorial);
        }
    }
}