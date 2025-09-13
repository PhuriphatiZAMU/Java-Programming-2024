import java.util.Scanner;

public class ScannerExercise {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("text: ");
        String text = input.nextLine(); // อ่าน 1 token และ คืนค่า \n
       
        System.out.print("text2: ");
        String text2 = input.nextLine(); // Read the entire line of text
        
        System.out.print("text3: ");
        String text3 = input.nextLine(); //5
        
        // Fill in the blanks to complete the following input statements
        
        System.out.print("int: ");
        int d = input.nextInt(); //1
        
        System.out.print("double: ");
        double e = input.nextDouble(); //2
        
        System.out.print("long: ");
        long f = input.nextLong(); //3
        
        System.out.print("boolean: ");
        boolean isHungry = input.nextBoolean(); //4

        // Print out the collected information
        System.out.println("Text: " + text);
        System.out.println("Text2: " + text2);
        System.out.println("d: " + d);
        System.out.println("e: " + e);
        System.out.println("f: " + f);
        System.out.println("isHungry: " + isHungry);
        System.out.println("Text3: " + text3);

        input.close(); // Close the scanner to free resources
    }
}
