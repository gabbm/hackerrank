import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ChocolateFeast {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
        }
    }
    
    private static long Solve(int N, int C, int M){
        int wrappers = 0;
        long chocolatesEaten = 0;
        
        while(N >= C || wrappers >= M){
            if(wrappers >= M){
                wrappers -= M;
            }else{
                N -= C;
            }
            
            chocolatesEaten++;
            wrappers++;
        }
        
        return chocolatesEaten;
    }
    
    
}
