import java.util.Arrays;

class nextClosestTime {
	static char min;
	static char max;
	static char[] time;

	
	public static String solution(String s) {
	    time = s.toCharArray();
	    min=(char)Math.min(Math.min(time[0],Math.min(time[1],time[3])),time[4]);
	    max=(char)Math.max(Math.max(time[0],Math.max(time[1],time[3])),time[4]);
	    solve(4);//try looking for solution from last digits to first digits
	    if(time[0]=='#'){ //no solution found, turn to another day
	        Arrays.fill(time,min);
	        time[2]=':';
	    }
	    return new String(time);
	}
	public static void solve(int i){//from the ith position, look for smallest value that is bigger than it
	    if(i<0){//didn't find any, mark no solution, need to turn to another day
	        time[0]='#';
	        return;
	    }
	    if(i==2){//':' sign, jump cross it
	        solve(1);
	        return;
	    }
	    char ans = max;
	    for(int j=0;j<5;j++){//try to find a suitable number to replace ith position
	        if(j!=2&&time[j]>time[i]) ans=(char)Math.min(ans,time[j]);
	    }
	    if(ans==time[i]||!isvalid(i,ans)){//didn't find a suitable one or the one found is not valid, go to i-1
	        solve(i-1);
	        return;
	    }
	    time[i]=ans;//set the number
	    for(int j=i+1;j<5;j++){//set the following number to smallest value possible
	        if(j!=2)time[j]=min;
	    }
	}
	public static boolean isvalid(int i,char ans){
	    if(i==3)return ans<'6';
	    if(i==1)return time[i-1]<'2'||(time[i-1]=='2'&&ans<'4');
	    if(i==0)return ans<'2'||(ans=='2'&&time[i+1]<'4');
	    return true;
	}
	
	public static void main(String[] args) {
		String s = solution("00:00");
		System.out.println(s);
	}
}
