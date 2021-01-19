import java.util.*;

public class Source {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        deleteFirstHalf(stack);
    }

    // Method to delete the first half of the elements from the bottom of the stackand print the remaining elements
    static void deleteFirstHalf(Stack<Integer> stack) {
        Stack<Integer> s=new Stack<Integer>();
    int n=stack.size()-(int)Math.floor(stack.size()/2);
        while(n>0)
        {
            s.push(stack.pop());
            n--;
        }
        while(!stack.isEmpty())
        {
            stack.pop();
        }
        while(!s.isEmpty())
        {
            stack.push(s.pop());
        }
        System.out.println(stack);
    }
}
