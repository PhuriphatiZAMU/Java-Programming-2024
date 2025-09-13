import java.util.Scanner;
public class MonthSwitchCaseArrow {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    System.out.print("ใส่เลขเดือน: ");
    int M = input.nextInt();
        String month = switch (M){
            case 1 -> "Jan";
            case 2 -> "Feb";
            case 3 -> "Mar";
            case 4 -> "Apr";
            case 5 -> "May";
            case 6 -> "Jun";
            case 7 -> "Jul";
            case 8 -> "Aug";
            case 9 -> "Sep";
            case 10 -> "Oct";
            case 11 -> "Nov";
            case 12 -> "Dec";
            default -> "ไม่มีเดือนนี้";
        };
   System.out.print("เดือน: "+month);
  }
}
