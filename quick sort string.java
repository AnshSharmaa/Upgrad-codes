import java.util.*;

 class Source {

   public static void quickSort(String array[], int left, int right) {
       if (left < right) {
           int position = part(array, left, right);
           quickSort(array, left, position - 1);
           quickSort(array, position + 1, right);
       }
        
   }
    public static int part(String arr[], int l, int h) 
    { 
        int piv = arr[h].length();  
        int i = (l-1);
        for (int j=l; j<h; j++) 
        { 
            if (arr[j].length() < piv) 
            { 
                i++; 
                String temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
        String temp = arr[i+1]; 
        arr[i+1] = arr[h]; 
        arr[h] = temp; 
        return i+1; 
    } 
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String[] x=new String[n];
        for(int i=0;i<n;i++){
            x[i]=s.next();
           //System.out.println(x[i]+ "*");
        }
        /*for(int i=0;i<x.length;i++){
            System.out.println(x[i]+ "*");
        }*/
        quickSort(x,0,x.length-1);
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }
    }
}