import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;


public class DateDisplay {
    public static String getDay(String day, String month, String year) {
    	String dayOfWeek = null;
    	if(Integer.valueOf(year) > 2000 && Integer.valueOf(year)<3000) {
    		LocalDate localDate = LocalDate.of(Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(day));
    		dayOfWeek = String.valueOf(localDate.getDayOfWeek());
    	}
    	return dayOfWeek;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        System.out.println(getDay(day, month, year));
    }
}