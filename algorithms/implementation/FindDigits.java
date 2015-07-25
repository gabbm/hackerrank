import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindDigits {

    public static void main(String[] args) {
        int n, t, currentNumber, digits;
        Integer[] results;
        List<Integer> divisorList;
        Scanner scanner;
        
        scanner = new Scanner(System.in);
        t = scanner.nextInt();
        
        for(int i=0; i<t; i++){
            n = scanner.nextInt();
            currentNumber = n;
            digits = 0;
            divisorList = new ArrayList<Integer>();
            results = new Integer[10];
            
            do{
                divisorList.add(Integer.valueOf(n%10));
                n /= 10;
            }while(n != 0);
            
            for(Integer divisor : divisorList){
                if(divisor != 0 && currentNumber%divisor == 0){
                    if(results[divisor] == null){
                        results[divisor] = 1;
                    }else{
                        results[divisor] += 1;
                    }
                }
            }
            
            for(int j=0; j<10; j++){
                if(results[j] != null && results[j] != 0){
                    digits += results[j];
                }
            }
            
            System.out.println(digits);
        }
    }
}
