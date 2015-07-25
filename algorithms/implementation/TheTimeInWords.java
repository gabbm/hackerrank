import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TheTimeInWords {

    private static final String[] completeTime = {
        "o' clock",
        "quarter past",
        "half past",
        "quarter to"
    };
    
    private static final String[] tensNames = {
        "",
        "ten",
        "twenty"
    };

    private static final String[] numNames = {
        "",
        "one",
        "two",
        "three",
        "four",
        "five",
        "six",
        "seven",
        "eight",
        "nine",
        "ten",
        "eleven",
        "twelve",
        "thirteen",
        "fourteen",
        "fifteen",
        "sixteen",
        "seventeen",
        "eighteen",
        "nineteen"
    };
    
    public static void main(String[] args) {
        int H, M;
        Scanner scanner;
        String carryNumber;
        
        scanner = new Scanner(System.in);
        H = scanner.nextInt();
        M = scanner.nextInt();
        
        if(M == 0){
            System.out.println(numNames[H] + " " + completeTime[0]);
        }else if(M == 15){
            System.out.println(completeTime[1] + " " + numNames[H]);
        }else if(M == 30){
            System.out.println(completeTime[2] + " " + numNames[H]);
        }else if(M == 45){
            System.out.println(completeTime[3] + " " + numNames[H+1]);
        }else{
            if(M < 20){
                System.out.println(numNames[M] + " minutes past " + numNames[H]);
            }else if(M < 30){
                carryNumber = numNames[M%10];
                M /= 10;
                
                if(carryNumber.compareToIgnoreCase("") != 0){
                    System.out.println(tensNames[M%10] + " " + carryNumber + " minutes past " + numNames[H]);
                }else{
                    System.out.println(tensNames[M%10] + " minutes past " + numNames[H+1]);
                }
            }else{
                M = 60 - M;
                
                if(M < 20){
                    System.out.println(numNames[M] + " minutes to " + numNames[H+1]);
                }else if(M < 30){
                    carryNumber = numNames[M%10];
                    M /= 10;

                    if(carryNumber.compareToIgnoreCase("") != 0){
                        System.out.println(tensNames[M%10] + " " + carryNumber + " minutes to " + numNames[H+1]);
                    }else{
                        System.out.println(tensNames[M%10] + " minutes to " + numNames[H+1]);
                    }
                }
            }
        }
    }
}
