import java.util.*;


 class Source {
   public static int getLinearSearchUnsuccessfulComparisonCount(int[] arr, int key) {
   int att=0;
   for(int i=0;i<arr.length;i++){
       if(arr[i]==key){
           return att;
       }
       att++;
   }
   return att;
   }
   public static void main(String[] args){
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=s.nextInt();
       }
       int k=s.nextInt();
       System.out.print(getLinearSearchUnsuccessfulComparisonCount(arr,k));
   }
 }
