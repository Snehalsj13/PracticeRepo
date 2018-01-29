import java.util.*;
import java.io.*;

class NumberSeries{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int result = 0;
        if( 0 <= t && t <= 500) {
        	for(int i=0;i<t;i++){
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                
                if( 0 <= a && a<=50 && 0 <= b && b<=50 && 1 <= n && n <=15) {
                	result = a;
                	for(int j=0; j < n; j++) {                		
                		result = result + (int)Math.pow(2, j)*b;
                		System.out.print(result + " ");
                	}
                	System.out.println();
                }
            }
        }
        
        in.close();
    }
}
