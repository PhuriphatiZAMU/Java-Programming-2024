public class QuadraticSolver {
    public static void main(String[] args) {
        // กำหนดค่า a, b, c
        double a = 1;
        double b = 3;
        double c = -4;
        
        // คำนวณค่า discriminant (b^2 - 4ac)
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        
        // ตรวจสอบว่า discriminant เป็นบวกหรือไม่
        if (discriminant > 0) {
            // มี 2 รากจริง
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            
            // แสดงผลลัพธ์
            System.out.println("The roots are: x1 = " + x1 + " and x2 = " + x2);
        } else if (discriminant == 0) {
            // มีรากเดียว
            double x1 = -b / (2 * a);
            System.out.println("The root is: x = " + x1);
        } else {
            // ไม่มีรากจริง
            System.out.println("There are no real roots.");
        }
    }
}