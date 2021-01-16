import java.lang.String;
import java.util.Scanner;

public class Source{
    // function to print the required pattern
    public static String func(int n) {
          if (n < 1){
         return ""; 
        }
        String s=func(n - 1);
        for(int i=0;i<n;i++)
        {
            s=s+"*";
        }
        s=s+"\n";
        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print(func(n));
    }

}
