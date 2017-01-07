package date_related;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateToString {
    
    public static void main(String[] args) {
        
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss a");
        
        Date today = Calendar.getInstance().getTime();
        
        String reportDate = df.format(today); // Srting from java.util
        
        System.out.println("Current Date: " + reportDate);
    }

}
