import java.util.Scanner;

class Source {
   public static boolean palindrome(int[] num, int index,int end) {
   if (index >= end) { 
        return true; 
    } 
    if (num[index] == num[end]) { 
        return palindrome(num, index + 1, end - 1); 
    } 
    else { 
        return false; 
    } 
}   
  

   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int num[] = new int[5];
       for(int i=0; i< 5;i++)
           num[i]=sc.nextInt();
       boolean answer =palindrome(num, 0,4);
       System.out.println(answer);
   }
}
