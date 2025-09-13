import java.util.Scanner;

public class G3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //รับค่า P
        System.out.println("Enter P: ");
        int P = input.nextInt();
        
        // รับค่า i
        System.out.print("Enter i: ");
        int i = input.nextInt();
        
        // รับค่า n
        System.out.print("Enter n: ");
        int n = input.nextInt();
        
        // คำนวณค่า i ที่ต้องใช้ในสมการ
        double inew = (i / 100.0) / 12.0;
        
        // คำนวณค่า n ที่ต้องใช้ในสมการ
        int nnew = n * 12;
        
        // คำนวณค่า M จากสมการ
        double M = (P * inew) / (1 - Math.pow(1 + inew, -nnew));
        
        // ปัดค่าตามหลักคณิตศาสตร์
        int roundedM = (int) Math.round(M);
        
        System.out.println("M is " + roundedM + " " + "P = " + P);
        
     
    }
}