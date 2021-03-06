import java.util.*;

public class Source {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        printFifthElementFromEnd(stack);
    }
    static void printFifthElementFromEnd(Stack<Integer> stack) {
        // Write your code here
        if(stack.size()<5)
        {
            System.out.println("There are not enough elements in the stack");
        }
        else{
            int c=stack.size()-4;//c=5 for top
            int out=0;
            while(c>0)
            {
                out=stack.pop();
                c--;
            }
            System.out.println(out);
        }
        
    }
}