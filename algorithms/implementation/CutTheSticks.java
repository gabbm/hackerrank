import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CutTheSticks {

    public static void main(String[] args) {
        boolean allLooked = false;
        int n, lessValue, lastIndex, cuttedSticks;
        Integer[] sticks;
        Scanner scanner;
        
        scanner = new Scanner(System.in);
        n = scanner.nextInt();
        
        sticks = new Integer[n];
        for(int i=0; i<n; i++){
            sticks[i] = scanner.nextInt();
        }

        quicksort(sticks, 0, n-1);
        lessValue = sticks[0];
        lastIndex = 0;
        
        while(!allLooked){
            cuttedSticks = 0;
            
            for(int i=lastIndex; i<n; i++){
                if((sticks[i] - lessValue) > 0){
                    lessValue = lessValue + (sticks[i] - lessValue);
                    cuttedSticks = n - lastIndex;
                    lastIndex = i;
                    break;
                }else{
                    cuttedSticks++;
                }
                
                if(i == n-1){
                    allLooked = true;
                }
            }
            
            System.out.println(cuttedSticks);
        }
    }
    
    static int partition(Integer[] sticks, int left, int right){
        int i=left, j=right;
        int tmp;
        int pivot = sticks[(left+right)/2];
        
        while(i<=j){
            while(sticks[i]<pivot){
                i++;
            }
            while(sticks[j]>pivot){
                j--;
            }
            
            if(i<=j){
                tmp = sticks[i];
                sticks[i] = sticks[j];
                sticks[j] = tmp;
                i++;
                j--;
            }
        }
        
        return i;
    }
    
    static void quicksort(Integer[] sticks, int left, int right){
        int index = partition(sticks, left, right);
        
        if(left < index-1){
            quicksort(sticks, left, index-1);
        }
        if(index < right){
            quicksort(sticks, index, right);
        }
    }
}
