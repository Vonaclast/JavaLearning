public class OskarEn001_06 {

    public static void main(String[] args) {

        int a = 21;
        int b = 15;
        int c = returnSum(a,b);
        print40(c);

    }

    public static int returnSum(int a, int b){
        return a + b;
    }

    //Example only wanted first to statements, this would however print the line falsely when the sum is <=30

    public static void print40(int c){
        if(c>40){System.out.println(c + " is bigger than 40.");}

        else {
            if(c>30){System.out.println(c + " is bigger than 30 and smaller than 40");}

            else{System.out.println(c + " is smaller than or equal to 30");}
        }
    }
}
