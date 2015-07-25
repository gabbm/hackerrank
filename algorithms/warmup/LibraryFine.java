import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LibraryFine {

    public static void main(String[] args) {
        Calendar expectedCalendar, returnCalendar;
        long fine;
        int day, month, year, differenceYear;
        Scanner scanner;
        SimpleDateFormat simpleDateFormat;

        try{
            scanner = new Scanner(System.in);
            expectedCalendar = Calendar.getInstance();
            returnCalendar = Calendar.getInstance();
            simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

            day = scanner.nextInt();
            month = scanner.nextInt();
            year = scanner.nextInt();

            expectedCalendar.setTime(simpleDateFormat.parse(day + "/" + month + "/" + year));

            day = scanner.nextInt();
            month = scanner.nextInt();
            year = scanner.nextInt();

            returnCalendar.setTime(simpleDateFormat.parse(day + "/" + month + "/" + year));
            
            if(expectedCalendar.compareTo(returnCalendar) < 0){
                fine = 0;
            }else{
                if(expectedCalendar.get(Calendar.YEAR) == returnCalendar.get(Calendar.YEAR)){
                    if(expectedCalendar.get(Calendar.MONTH) == returnCalendar.get(Calendar.MONTH)){
                        fine = 15 * Math.abs(returnCalendar.get(Calendar.DAY_OF_MONTH) - expectedCalendar.get(Calendar.DAY_OF_MONTH));
                    }else{
                        fine = 500 * Math.abs(returnCalendar.get(Calendar.MONTH) - expectedCalendar.get(Calendar.MONTH));
                    }
                }else{
                    fine = 10000;
                }
            }
            
            System.out.println(fine);
        }catch(ParseException e){
            e.printStackTrace();
        }
    }
}
