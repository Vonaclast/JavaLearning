/*
Declare two integers, 6 and 9.

Create a method named multiplyNumbers() which takes two integers as parameters, and returns the result of their multiplication.

Output the result to the console.


Your main method can **only** output the solution thanks to the value returned from the method.
*/

public class MethodsPlus
{
   public static void main(String[] args)
   {
      int a = 6;
      int b = 9;
      int d = multiplyNumbers(a,b);
      System.out.println(a + " * " + b + " = " + d);
   }

   public static int multiplyNumbers(int a, int b)
   {
      int c = a*b;
      return c;
   }
}
