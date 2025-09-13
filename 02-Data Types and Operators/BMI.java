public class BMI {
    public static void main(String[] args) {
        
        // กำหนดค่าน้ำหนัก (กิโลกรัม)
        double weight = 60;
        
        // กำหนดค่าความสูง (เมตร)
        double height = 1.80;
        
        // คำนวณ BMI
        double bmi = weight / Math.pow(height, 2);
        
        // แสดงผลลัพธ์
        System.out.println("Your BMI is: " + bmi);
        
    }
}