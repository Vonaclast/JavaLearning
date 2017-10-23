/*
Declare two integers, 21 and 15.

Add together the two variables in a third variable, and using *if* and *else* statements, check the following condition:

If their sum is bigger than 40, print "It is bigger than 40."

else, if the sum is smaller than 40 **and** bigger than 30, print "It is between 30 and 40."
*/

public class Conditions
{
   public static void main(String[] args)
   {
         int a = 21;
         int b = 15;
         int c = a + b;

         if(c > 40) System.out.println("The sum is bigger than 40.");
         else if (30 < c && c <40) System.out.println("The sum is between 30 and 40.");
   }
}
