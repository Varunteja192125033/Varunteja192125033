import java.util.Scanner;
public class LeapYear {
   public static void main(String[] args){
      int year;
      int month;
      int date;

      System.out.println("Enter the Date: ");
      Scanner sd = new Scanner(System.in);
      date = sd.nextInt();
      System.out.println("Enter the Month: ");
      Scanner sm = new Scanner(System.in);
      month = sm.nextInt();
      System.out.println("Enter the Year: ");
      Scanner sc = new Scanner(System.in);
      year = sc.nextInt();

      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
         System.out.println("Given year is a leap year");
      else
         System.out.println("Given year is not a leap year");
   }
}