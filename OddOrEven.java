import java.util.Scanner;
 
class OddOrEven
{
   public static void main(String args[])
   {
      int num;
      System.out.println("Enter the number to be checked ");//changed the statement
      Scanner in = new Scanner(System.in);
      num = in.nextInt();
 
      if ( num % 2 == 0 )
         System.out.println(" even number.");//changed the statement
      else
         System.out.println(" odd number.");//changed the statement
   }
}
//Changed variable x with num