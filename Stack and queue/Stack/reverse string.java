// its partially correct
import java.util.*;

public class Source{
    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);
        String data = in.next();
        //System.out.println(data);
        Stack<Character> s = new Stack<Character>();
        char[] ch = data.toCharArray();
        for (int i = 0; i < data.length(); i++)
        {    
            s.push(ch[i]);
        }
        while (!s.isEmpty())
        {
            System.out.print(s.pop());
        }
    }
}
