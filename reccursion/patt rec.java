import java.lang.String;
import java.util.Scanner;

public class Source{
    public static void func2(int n){
        if (n < 1) 
    return; 
    System.out.print( "*"); 
    func2(n - 1); 
    }
    public static void func(int n) {
        if (n < 1){
         return; 
        }
        func(n - 1); 

    
    func2(n);
    System.out.println (); 
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        func(n);
    }

}
