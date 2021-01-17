import java.util.*;

public class Source {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String[] x=new String[n];
        for(int i=0;i<n;i++){
            x[i]=s.next();
        }
        QSorter quickSort = new QSorter();
        quickSort.sort(x);
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }
    }
}

class QSorter {
    public void sort(String[] arr) {
        sort(arr, 0, arr.length - 1);
    }
    
    private void sort(String[] arr, int start, int end) {
        // Base Condition
        if (start >= end)
            return;
        // Partition
        int boundary = partition(arr, start, end);
        // Sort Left
        sort(arr, start, boundary - 1);
        // Sort Right
        sort(arr, boundary + 1, end);
    }
    
    private int partition(String[] arr, int start, int end) {
        int pivot = arr[end].length();
        int boundary = start - 1;
        for (int i = start; i <= end; i++)
            if (arr[i].length() <= pivot)
                swap(arr, i, ++boundary);

        return boundary;
    }

    private void swap(String[] array, int index1, int index2) {
        String temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
