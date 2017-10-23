/*
Declare two integers, 100 and 20.

On different lines, output to the console the following:

100+20;
100-20;
100*20;
100/20;
100%20;

You must use the variables to make the calculations, don't type the numbers directly.
*/

public class MathBasics{
   public static void main(String[] args) {
      int a = 100;
      int b = 20;

      int add = a + b;
      int subtract = a - b;
      int multiply = a * b;
      int divide = a/b;
      int remainder = a%b;

      System.out.print(
      a + " + " +  b + " = " + add + "\n" +

      a + " - " + b + " = " + subtract + "\n" +

      a + " * " + b + " = " + multiply + "\n" +

      a + " / " + b + " = " + divide + "\n" +

      a + " % " + b + " = " + remainder + "\n");


   }
}
