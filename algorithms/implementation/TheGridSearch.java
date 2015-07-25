import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TheGridSearch {

    public static void main(String[] args) {
        boolean finded, firstLine;
        int T, R, r, C, c, currentRow, currentPosition;
        Scanner scanner;
        String currentLine;
        String[] G, P;
        
        scanner = new Scanner(System.in);
        T = Integer.valueOf(scanner.nextLine());
        
        for(int i=0; i<T; i++){
            currentLine = scanner.nextLine();
            R = Integer.valueOf(currentLine.split(" ")[0]);
            C = Integer.valueOf(currentLine.split(" ")[1]);
            
            G = new String[R];
            for(int j=0; j<R; j++){
                G[j] = scanner.nextLine();
            }
            
            currentLine = scanner.nextLine();
            r = Integer.valueOf(currentLine.split(" ")[0]);
            c = Integer.valueOf(currentLine.split(" ")[1]);
            
            P = new String[r];
            for(int j=0; j<r; j++){
                P[j] = scanner.nextLine();
            }
            
            currentRow = 0;
            currentPosition = 0;
            finded = false;
            firstLine = true;
            
            for(int j=0; j<R; j++){
                if(G[j].indexOf(P[currentRow]) != -1){
                    if(firstLine){
                        currentPosition = G[j].indexOf(P[currentRow]);
                        firstLine = false;
                        currentRow++;
                    }else{
                        if(currentPosition != G[j].indexOf(P[currentRow])){
                            firstLine = true;
                            currentRow = 0;
                        }else{
                            if(currentRow == r-1){
                                finded = true;
                                break;
                            }else{
                                currentRow++;
                            }
                        }
                    }
                }
            }
            
            if(finded){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        

    }
}
