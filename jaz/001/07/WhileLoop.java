/*
Use a while loop to print the String "This is the sentence number x" 100 times.

E.G.:

This is the sentence number 1
This is the sentence number 2
This is the sentence number 3
...
This is the sentence number 100


Not only tedious, but typing them one by one is **not** allowed.
*/
public class WhileLoop
{
   public static void main(String[] args)
   {
      int i = 1;
      while(i <= 100)
         {
            System.out.println("This is the sentence number " + i);
            i++;
         }
   }
}
