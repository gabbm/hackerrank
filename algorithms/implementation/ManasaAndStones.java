import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ManasaAndStones {    
    public static void main(String[] args) {
        int T;
        int leftRocks, rightRocks;
        List<Case> testCases;
        List<Integer> orderedLastStones;
        Scanner scanner;
        Set<Integer> lastStones;
        StringBuilder lastStonesString;
        scanner = new Scanner(System.in);
        T = scanner.nextInt();
        
        testCases = loadCases(scanner, T);
        
        for(Case testCase : testCases){
            lastStones = new HashSet<Integer>();
            leftRocks = testCase.n - 1;
            
            for(rightRocks = 0; rightRocks < testCase.n; rightRocks++){
                lastStones.add(((leftRocks - rightRocks) * testCase.a) + (rightRocks * testCase.b));
            }
            
            orderedLastStones = new ArrayList<Integer>(lastStones);
            Collections.sort(orderedLastStones);
            
            lastStonesString = new StringBuilder();
            for(Integer lastStone : orderedLastStones){
                lastStonesString.append(lastStone);
                lastStonesString.append(SEPARATOR);
            }
            
            System.out.println(lastStonesString.toString());
        }
    }
    
    static class Case{
        int a;
        int b;
        int n;
    }
    
    private static final String SEPARATOR = " ";
    
    private static List<Case> loadCases(Scanner scanner, int T){
        Case testCase = null;
        int counter = 0;
        int scannerValue;
        List<Case> testCases;

        testCases = new ArrayList<Case>();
        
        while(scanner.hasNext()){
            if(counter == 0){
                testCase = new Case();
                testCase.n = scanner.nextInt();
            }else if(counter == 1){
                testCase.a = scanner.nextInt();
            }else if(counter == 2){
                testCase.b = scanner.nextInt();
            }
            
            if(++counter == 3){
                testCases.add(testCase);
                counter = 0;
            }
        }
        
        return testCases;
    }
}
