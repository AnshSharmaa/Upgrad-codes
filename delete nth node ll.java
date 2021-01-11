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
        int index = s.nextInt();
        deleteNodeAtGivenIndex(index);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    // Method to delete the node at the given index of the LinkedList
    static void deleteNodeAtGivenIndex(int index) {
        if (head == null) 
            return; 

        Node temp = head; 
  
        if (index == 0) 
        { 
            head = temp.next; 
            return; 
        }  
        for (int i=1; temp!=null && i<index-1; i++) 
            temp = temp.next;  
        if (temp == null || temp.next == null) 
            return; 
            
        Node next = temp.next.next; 
        temp.next = next;
    }
}
