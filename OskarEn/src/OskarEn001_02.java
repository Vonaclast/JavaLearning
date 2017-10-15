public class OskarEn001_02 {

    public static void main(String[] args){


        int twenty = 20;
        int hundred = 100;

        printCalcs(twenty, hundred);


    }

    //Trying to generalize the solution, not sure if it makes sense to..
    //Can be used to do all the calculations

    public static void printCalcs(int a, int b){

        //Printing the operation as a string and then printing the calculation, will follow same format for each calc
        System.out.print(""  + a + " + " + b + " = ");
        System.out.println(a + b);

        //Minus
        System.out.print(""  + a + " - " + b + " = ");
        System.out.println(a - b);

        //Multiplication
        System.out.print(""  + a + " * " + b + " = ");
        System.out.println(a * b);

        //Division
        System.out.print(""  + a + " / " + b + " = ");
        System.out.println(a / b); //"This doesn't work as it would need a type double to present the answer");
        System.out.println((double)a/(double)b); //Adding (double) doesn't change the type but instead parses the variable


        //Modular
        System.out.print(""  + a + " % " + b + " = ");
        System.out.println(a % b);


    }
}
