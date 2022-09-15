import java.util.Scanner;

public class SumOfDigits
{
   public static void main(String[] args)
   {
      int num, digit, sum=0;
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter a Number: ");
      num = s.nextInt();
      
      while(num!=0)
      {
         digit = num%10;
         sum = sum + digit;
         num = num/10;
      }
          if(sum>9){
            System.out.println("\nSum is = " +sum +" Sum is more than one digit number" );
      }
          else{
      System.out.println("\nSum of Digits = " +sum);
      }
   }
}