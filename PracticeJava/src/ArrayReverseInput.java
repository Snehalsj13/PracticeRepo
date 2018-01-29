import java.io.*;
import java.util.*;

public class ArrayReverseInput {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner scanner = new Scanner(System.in);
    	Integer N = scanner.nextInt();
    	scanner.nextLine();
    	try {
    		if(N >= 1 && N<= Math.pow(10, 3)) {
        		int A[] = new int[N];
        		int i;
        		int nextNumber;
        		for(i = 0; i < N; i++) {
        			nextNumber = scanner.nextInt();
        			if(nextNumber >= 1 && nextNumber <= Math.pow(10, 4)) {
        				A[i] = nextNumber;
        			}else
        				break;
        		}
        		scanner.close();
        		
        		for(i = 1; i <= N; i++) {
        			System.out.print(A[N-i] + " ");
        		}
        	}
    	}catch(Exception e) {
    		e.printStackTrace();
    	}    	
    	
    }
}