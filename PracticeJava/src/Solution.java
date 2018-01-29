import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	 static String electionWinner(String[] votes) {
		 Map<String, Integer> mapOfCandidateAndVotes = new HashMap<String, Integer>();
		 
		// maxVote = 1;
		 for(String vote : votes ) {
			 if(mapOfCandidateAndVotes.containsKey(vote)) {
				 mapOfCandidateAndVotes.put(vote, mapOfCandidateAndVotes.get(vote)+1);
			 }else {
				 mapOfCandidateAndVotes.put(vote, 1);
			 }
		 }
		 
		 if(!mapOfCandidateAndVotes.isEmpty() && mapOfCandidateAndVotes.size() > 0) {
			 
		 }
		 
		 return null;
	    }
	 
	/* static String[] braces(String[] values) {
		 String[] resultArray = new String[values.length];
		 Stack<Character> stackOfBrackets = new Stack<Character>();
		 for(int i  = 0; i < values.length; i++) {
			 for(int j = 0; j <values[i].length(); j++ ) {
				 if()) {
					 
				 }
			 }
			 resultArray[i] = "YES";
		 }
		 return resultArray;
	    }

	 */
	/* static String mergeStrings(String a, String b) {
	        String result = " ";
	        int i = 0, j = 0;
	        
	        if(a.length() >= b.length()) {
	        	for(i= 0; i < a.length(); i++) {
	        		result = result + a.charAt(i);
	        		
	        		while(j < b.length()) {
	        			result = result + b.charAt(i);
	        			j++;
	        			break;
	        		}
	        	}
	        }else if(a.length() < b.length()) {
	        	for(i = 0; i<b.length(); i++) {
	        		while(j < a.length()) {
	        			result = result + a.charAt(j);
		        		j++;
		        		break;
	        		}
	        		result = result + b.charAt(i);
	        	}	        	
	        }
	        
	        return result;
	    }
	 
	 static int[] getOneBits(int n) {
		 List<Integer> positions = new ArrayList<Integer>();
		 String binary = Integer.toBinaryString(n);
		 int count = 0;
		 char[] arr = binary.toCharArray();
		 
		 for(int j = 0; j < arr.length; j++) {
			 if(Integer.parseInt(String.valueOf(arr[j])) == 1) {
				 positions.add(j+1);
			 }
		 }
		 
		 int[] resultArray = new int[positions.size() + 1];
		 resultArray[0] = positions.size();
		 
		 for(int i = 1; i <= resultArray.length ; i++) {
			 resultArray[i] = positions.get(i);
		 }
		 
		return resultArray;
	  }
	 */
	 
	 public static void main(String[] args) throws IOException {
	        Scanner in = new Scanner(System.in);
	        final String fileName = System.getenv("OUTPUT_PATH");
	        BufferedWriter bw = null;
	        if (fileName != null) {
	            bw = new BufferedWriter(new FileWriter(fileName));
	        }
	        else {
	            bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        }

	        String res;
	        int votes_size = 0;
	        votes_size = Integer.parseInt(in.nextLine().trim());

	        String[] votes = new String[votes_size];
	        for(int i = 0; i < votes_size; i++) {
	            String votes_item;
	            try {
	                votes_item = in.nextLine();
	            } catch (Exception e) {
	                votes_item = null;
	            }
	            votes[i] = votes_item;
	        }

	        res = electionWinner(votes);
	        bw.write(res);
	        bw.newLine();

	        bw.close();
	    }
	}
