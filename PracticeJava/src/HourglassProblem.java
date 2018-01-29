import java.io.*;
import java.util.*;

public class HourglassProblem {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	int A[][] = new int[6][6];
    	int maxSum = Integer.MIN_VALUE;
    	int sum;
    	try {
    		for(int i = 0; i < 6; i++) {
    			for(int j = 0; j < 6; j++) {
    				A[i][j] = scanner.nextInt();
    				
    				if(A[i][j] >= -9 && A[i][j]<= 9) {
    					if(i > 1 && j > 1) {
        					sum = A[i][j] + A[i][j-1] + A[i][j-2] + A[i-1][j-1] + A[i-2][j] + A[i-2][j-1] + A[i-2][j-2];
        					
        					if(sum > maxSum) {
        						maxSum = sum;
        					}
        				}
    				}else
    					break;    				
    			}
    		}
    		System.out.println(maxSum);
    		
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
}