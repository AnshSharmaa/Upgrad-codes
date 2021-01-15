import java.util.Scanner;

class Source{
 public static int sum(int n) {
    if (n == 0) 
            return 0; 
    else 
        return (n % 10 + sum(n / 10));
   }
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int num = sc.nextInt();
    System.out.println(sum(num));
   } 
}
