/*
Use a for loop to print the String "This is line number x" 100 times.

E.G.:

This is line number 1
This is line number 2
This is line number 3
...
This is line number 100

Not only tedious, but typing them one by one is **not** allowed.
*/
public class ForLoop
{
   public static void main(String[] args)
   {
         for(int i = 1; i <= 100; i++)
         {
               System.out.println("This is line number " + i);
         }
   }
}
