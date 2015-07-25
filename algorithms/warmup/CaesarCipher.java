import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CaesarCipher {

    public static void main(String[] args) {
        char[] splittedMessage;
        int position2Convert, n, k;
        Scanner scanner;
        String message, caesarMessage;
        
        scanner = new Scanner(System.in);
        caesarMessage = "";
        
        n = Integer.valueOf(scanner.nextLine());
        message = scanner.nextLine();
        k = Integer.valueOf(scanner.nextLine());
        
        splittedMessage = message.toCharArray();
        for(int i=0; i<n; i++){
            if(Character.isLetter(splittedMessage[i])){
                if(splittedMessage[i] >= 'A' && splittedMessage[i] <= 'Z'){
                    position2Convert = splittedMessage[i] - 'A' + k;
                    position2Convert = position2Convert % 26;

                    caesarMessage += (char) (position2Convert + 'A');
                }else{
                    position2Convert = splittedMessage[i] - 'a' + k;
                    position2Convert = position2Convert % 26;

                    caesarMessage += (char) (position2Convert + 'a');
                }
            }else{
                caesarMessage += splittedMessage[i];
            }
        }
        
        System.out.println(caesarMessage);
    }
}
