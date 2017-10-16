public class OskarEn001_007 {

    public static void main(String[] args){

        numberCountPrinter(100);

    }


    //Thought I would generalize the task a bit
    private static void numberCountPrinter(int a){
        int index = 0;

        while(index < a){
            index ++; //put it before so that it starts with value 1, non programmers don't start counting at 0
            System.out.println("This is sentence number " + index);

        }


    }
}
