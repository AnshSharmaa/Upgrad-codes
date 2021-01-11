import java.util.*;

public class Source {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        thirdMaxInteger(arr);
    }

    // Method to find the third maximum integer in the array
    static void thirdMaxInteger(int[] arr) {
        if(arr.length==1||arr.length==2){System.out.print("The array doesn't have a third maximum element");System.exit(0);}
        int first = arr[0], second = Integer.MIN_VALUE, 
                            third = Integer.MIN_VALUE; 
        for (int i = 1; i < arr.length; i++) { 
            if (arr[i] > first) { 
                third = second; 
                second = first; 
                first = arr[i]; 
            } 
            else if (arr[i] > second) { 
                third = second; 
                second = arr[i]; 
            } 
            else if (arr[i] > third) { 
                third = arr[i]; 
            } 
        } 
        if(first==second && second==third)System.out.print("The array doesn't have a third maximum element"); 
        else
        System.out.print(third); 
    }
    
}