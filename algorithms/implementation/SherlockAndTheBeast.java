import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockAndTheBeast {

    public static void main(String[] args) {
        int t, n;
        Scanner scanner;
        
        scanner = new Scanner(System.in);
        t = scanner.nextInt();
        
        for(int i=0; i<t; i++){
            n = scanner.nextInt();
            
            System.out.println(calculateDecentNumber(n));
        }
    }
    
    static String calculateDecentNumber(int n){
        int digits;
        int threes = 0;
        int fives = 0;
        StringBuilder stringBuilder;
        
        digits = n;
        while(digits > 0){
            if(digits%3 == 0){
                fives = digits;
                break;
            }
            
            digits -=5;
        }
        
        threes = n - digits;
        
        if(digits < 0 || threes%5 != 0){
            return "-1";
        }
        
        stringBuilder = new StringBuilder(n);
        
        while(fives-- > 0){
            stringBuilder.append("5");
        }
        
        while(threes-- > 0){
            stringBuilder.append("3");
        }
        
        return stringBuilder.toString();
    }
}
