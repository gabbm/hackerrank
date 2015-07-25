import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FibonacciModified {

    public static void main(String[] args) {
        int n;
        List<BigInteger> fibonacci;
        Scanner scanner;
        
        scanner = new Scanner(System.in);
        fibonacci = new ArrayList<BigInteger>();
        fibonacci.add(BigInteger.valueOf(Integer.valueOf(scanner.nextInt()).longValue()));
        fibonacci.add(BigInteger.valueOf(Integer.valueOf(scanner.nextInt()).longValue()));
        n = scanner.nextInt();
        
        for(int i=2; i<n; i++){
            fibonacci.add((fibonacci.get(i-1).multiply(fibonacci.get(i-1))).add(fibonacci.get(i-2)));
        }
        
        System.out.println(fibonacci.get(n-1).toString());
    }
}
