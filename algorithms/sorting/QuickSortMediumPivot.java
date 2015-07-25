import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class QuickSortMediumPivot {

    public static void main(String[] args) {
        int n;
        int[] array;
        Scanner scanner;
        
        scanner = new Scanner(System.in);
        n = scanner.nextInt();
        
        array = new int[n];
        for(int i=0; i<n; i++){
            array[i] = scanner.nextInt();
        }
        
        quicksort(array, 0, array.length-1);
        
        printArray(array);
    }
    
    private static void quicksort(int[] array, int left, int right){
        int index;
        
        index = partition(array, left, right);
        
        if(left<index-1){
            quicksort(array, left, index-1);
        }
        if(index<right){
            quicksort(array, index, right);
        }
    }
    
    private static int partition(int[] array, int left, int right){
        int i=left, j=right;
        int tmp;
        int pivot;
        
        pivot = array[(left+right)/2];
        
        while(i<=j){
            while(array[i]<pivot){
                i++;
            }
            while(array[j]>pivot){
                j--;
            }
            
            if(i<=j){
                tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
            }
        }
                
        return i;
    }
    
    private static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
