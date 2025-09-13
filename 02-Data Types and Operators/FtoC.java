public class FtoC {
    public static void main(String[] args) {
        // ค่าอุณหภูมิใน Fahrenheit 
        double fahrenheit = 90;
        
        // แปลง Fahrenheit เป็น Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;
        
        // แสดงผลลัพธ์
        System.out.printf("The temperature in Celsius is: %.2f°C\n", celsius);
        
    }
}