import java.util.*;

public class Source {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int n) {
            data = n;
            next = null;
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        head = null;
        if (n > 0) {
            head = new Node(s.nextInt());
            Node temp = head;
            for (int i = 1; i < n; i++) {
                temp.next = new Node(s.nextInt());
                temp = temp.next;
            }
        }
        int k = s.nextInt();
        System.out.println(search(k));
    }

    // Method to search for k in the given LinkedList
    static boolean search(int k) {
        Node current = head; 
        while (current != null) 
        { 
            if (current.data == k) 
                return true;   
            current = current.next; 
        } 
        return false;}
}
