import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CurrencyFormat {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        String us = null;
        String india = null;
        String china = null;
        String france = null;
        
        if(payment >= 0 && payment <= (int)Math.pow(10, 9)) {
        	Locale indiaLocale = new Locale("en","IN");
        	DecimalFormat df = new DecimalFormat("#.##");
        	
        	NumberFormat nf = NumberFormat.getInstance(Locale.US);        	
        	payment = Double.valueOf(df.format(payment));
            us = nf.format(payment);
            
            nf.getCurrencyInstance(indiaLocale);
            india = nf.format(payment);
            
            nf = NumberFormat.getInstance(Locale.CHINA);
            china = nf.format(payment);
            
            nf = NumberFormat.getInstance(Locale.FRENCH);
            france = nf.format(payment);
        }

        System.out.println("US: $" + us);
        System.out.println("India: Rs." + india);
        System.out.println("China: ¥" + china);
        System.out.println("France: " + france + " €");
    }
}
