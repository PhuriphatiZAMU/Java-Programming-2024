import java.util.Scanner;

public class G2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        //รับค่า P
        System.out.println("โปรดใส่ค่า P: ");
        int P = input.nextInt();
        
        //รับค่า r
        System.out.println("โปรดใส่ค่า r: ");
        double r = input.nextDouble();
        double rn = r / 100;
        
        //รับค่า t
        System.out.println("โปรดใส่ค่า t: ");
        int t = input.nextInt();     
        
        //คำนวณ
        double A = P * Math.pow(1 + rn / 1, 1 * t);
        
        
        System.out.println("ค่า A เมื่อกำหนด" + "t = " + t + " คือ: " + A );
        
     
    }
}