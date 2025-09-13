import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // รับค่าจำนวนเต็มบวกจากผู้ใช้งาน
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();

        if (n > 0) {
            if (isPrime(n)) {
                System.out.println("This is prime number");
            } else {
                System.out.println("Not prime");
            }
        } else {
            System.out.println("Please enter a positive integer greater than 0.");
        }

    }

    // ฟังก์ชันตรวจสอบจำนวนเฉพาะ
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // จำนวนที่น้อยกว่าหรือเท่ากับ 1 ไม่ใช่จำนวนเฉพาะ
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // หากหาร i ลงตัว แสดงว่าไม่ใช่จำนวนเฉพาะ
            }
        }
        return true; // ถ้าไม่มีตัวหารที่ลงตัว แสดงว่าเป็นจำนวนเฉพาะ
    }
}
