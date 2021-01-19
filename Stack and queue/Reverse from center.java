import java.util.*;

public class Source {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        reverseSecondHalf(stack);
    }

    // Method to reverse the last half of the elements from the bottom of the stack
    static void reverseSecondHalf(Stack<Integer> stack) {
        Queue <Integer> q=new LinkedList<Integer>();
        int n=stack.size()/2;
        while(n>0)
        {
            q.add(stack.pop());
            n--;
        }
        while(!q.isEmpty())
        {
            stack.push(q.remove());
        }
        System.out.println(stack);
    }
}
