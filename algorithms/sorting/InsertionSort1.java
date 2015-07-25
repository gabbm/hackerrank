import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class InsertionSort1 {

    public static void insertIntoSorted(int[] ar) {
        int number2sort, j;
        
        for(int i=0; i<ar.length; i++){
            number2sort = ar[i];
            j = i;
            
            while(j>0 && ar[j-1]>number2sort){
                ar[j] = ar[j-1];
                j--;
                
                printArray(ar);
            }
            
            if(ar[j] != number2sort){
                ar[j] = number2sort;
                printArray(ar);
            }
        }
    }
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}
 
