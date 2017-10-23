/*
Declare two integers, 25 and 70.

Create a method named addNumbers() which adds the two together and outputs the result to the console.


Your main method can **only** call the method addNumbers().
*/
public class Methods
{
   public static void main(String[] args)
   {
      int a = 25;
      int b = 70;
      int d = addNumbers(a,b);
      System.out.println(a + " + " + b + " = " + d );
   }
      public static int addNumbers(int a, int b)
      {
         int c = a + b;
         return c;
      }

}
