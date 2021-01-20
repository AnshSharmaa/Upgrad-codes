import java.util.*;

public class Source {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        deleteFirstHalf(stack);
       // System.out.print(stack);
    }

    // Method to delete the first half of the elements from the bottom of the stackand print the remaining elements
    static void deleteFirstHalf(Stack<Integer> stack) {
        Stack<Integer> bruh=new Stack<>();
        Stack<Integer> wow=new Stack<>();
        int i=0,z=(stack.size()/2);
        for(i=0;i<stack.size();i++){;
            int x = stack.pop();
            if(i<=z){bruh.push(x);}
        }
        while(!bruh.empty()){
            wow.push(bruh.pop());
            
        }/**/
        //System.out.println(stack.pop()+" "+i+" "+z);
        System.out.println(wow);
    }
}