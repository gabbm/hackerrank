import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UtopianTree {

    public static void main(String[] args) {
        boolean doubleCycle;
        int height, t, n;
        Scanner scanner;
        
        scanner = new Scanner(System.in);
        t = scanner.nextInt();
        
        for(int i=0; i<t; i++){
            doubleCycle = true;
            height = 1;
            n = scanner.nextInt();
            
            for(int j=n; j>0; j--){
                if(doubleCycle){
                    height = height * 2;
                    doubleCycle = false;
                }else{
                    height += 1;
                    doubleCycle = true;
                }                
            }
            
            System.out.println(height);
        }
    }
}
