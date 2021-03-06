import java.util.Scanner;
class Source {

   public static void main(String ss[]) {
       Scanner scanner = new Scanner(System.in);
       int sizeArray1 = scanner.nextInt();
       int sizeArray2 = scanner.nextInt();
       int sortedArray1[] = getArrayInput(sizeArray1, scanner);
       int sortedArray2[] = getArrayInput(sizeArray2, scanner);

       int descendingMerge[]=mergeBothInDescendingOrder(sortedArray1, sortedArray2);
        
       for(int i=descendingMerge.length-1;i>=0;i--){
           System.out.println(descendingMerge[i]);
       }

    }
    public static int[] getArrayInput(int n,Scanner sc){
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static int[] mergeBothInDescendingOrder(int[] arr1,int[] arr2){
        int[] arr=new int[arr1.length+arr2.length];
        int i = 0, j = 0, k = 0; 
        while (i<arr1.length && j <arr2.length) 
        {
            if (arr1[i] < arr2[j]) 
                arr[k++] = arr1[i++]; 
            else
                arr[k++] = arr2[j++]; 
        } 
        while (i < arr1.length) 
        {
            arr[k++] = arr1[i++]; 
        }
        while (j < arr2.length)
        {
            arr[k++] = arr2[j++];
        }  
        return arr;
    }
}