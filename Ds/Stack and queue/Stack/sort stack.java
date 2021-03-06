import java.util.*;

public class Source {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
       sort(stack);
      
    }

    // Method to sort the elements of the stack in ascending order
    static void sort(Stack<Integer> stack) {
        Stack<Integer> bruh=new Stack<>();
        while(!stack.empty()){
            int temp=stack.pop();
            while(!bruh.empty() && bruh.peek()>temp){
                stack.push(bruh.pop());
            }
            bruh.push(temp);
        }
         System.out.print(bruh);
    }
}