// one test case doesnt work idk why


import java.util.*;
 class Source {
   public int getBinarySearchUnsuccessfulComparisonCount(int[] array, int key) {
   int first=0,last=array.length-1,att=0;
int mid = (first + last)/2;  
   while( first <= last ){  
      if ( array[mid] < key ){  
        first = mid + 1;     
      }else if ( array[mid] == key ){  
        return att;  
      }else{  
         last = mid - 1;  
      }  
      mid = (first + last)/2;  
      att++;
   }
   return 0;
  }
   public static void main(String args[] ) throws Exception {
       Source bs = new Source();
       Scanner scanner = new Scanner(System.in);
       int size = scanner.nextInt();
       int array[] = new int[size];
       for (int i = 0; i < size; i++) {
           array[i] = scanner.nextInt();
       }
       int key = scanner.nextInt();
       System.out.println(bs.getBinarySearchUnsuccessfulComparisonCount(array, key));
   }
}
