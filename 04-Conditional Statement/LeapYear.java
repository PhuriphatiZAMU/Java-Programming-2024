import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // รับค่าปีจากผู้ใช้
        System.out.print("กรุณาใส่ปี: ");
        int year = input.nextInt();

        // ตรวจสอบเงื่อนไขปีอธิกสุรทิน
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " เป็นปีอธิกสุรทิน");
        } else {
            System.out.println(year + " ไม่เป็นปีอธิกสุรทิน");
        }

    }
}