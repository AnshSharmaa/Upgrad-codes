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
        kthNodeFromEnd(k);
    }

    // Method to find kth element from the end in the LinkedList
    static void kthNodeFromEnd(int k) {
        int len = 0; 
        Node temp = head; 
        while (temp != null) { 
            temp = temp.next; 
            len++; 
        } 
        if (len < k){ 
            System.out.print("Not Possible");   
            return; 
        }
        temp = head; 
        for (int i = 1; i < len - k + 1; i++) 
            temp = temp.next; 
  
        System.out.println(temp.data); 
    }
}
