import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CavityMap {

    public static void main(String[] args) {
        int n;
        Integer[][] matrix;
        Scanner scanner;
        String[] row;
        
        scanner = new Scanner(System.in);
        n = Integer.valueOf(scanner.nextLine());
        
        matrix = new Integer[n][n];
        
        for(int i=0; i<n; i++){
            row = scanner.nextLine().split("(?!^)");

            for(int j=0; j<n; j++){
                matrix[i][j] = Integer.valueOf(row[j]);
            }
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0 
                   || j==0 
                   || i == n-1 
                   || j == n-1){
                    System.out.print(matrix[i][j]);
                }else{
                    if(matrix[i][j] > matrix[i-1][j]
                      && matrix[i][j] > matrix[i][j-1]
                      && matrix[i][j] > matrix[i+1][j]
                      && matrix[i][j] > matrix[i][j+1]){
                        System.out.print("X");
                    }else{
                        System.out.print(matrix[i][j]);
                    }
                }
            }
            
            System.out.println();
        }
        
    }
}
