public class CentimeterToInch {
    public static void main(String[] args) {
        // กำหนดค่าความยาวเป็นเซนติเมตร
        double centimeter = 3.34;
        
        // ค่าที่ใช้ในการแปลง (1 เซนติเมตร = 0.393701 นิ้ว)
        double conversionFactor = 0.393701;
        
        // แปลงหน่วยจากเซนติเมตรเป็นนิ้ว
        double inches = centimeter * conversionFactor;
        
        // แสดงผลลัพธ์
        System.out.printf("%.2f เซนติเมตร เท่ากับ %.2f นิ้ว%n", centimeter, inches);
    }
}