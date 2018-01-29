import java.util.Scanner;

public class PrintfUse{
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String s1;
            int x;
            System.out.println("================================");
            for(int i=0;i<3;i++){
                s1=sc.next();
                x=sc.nextInt();
                System.out.printf("%-15s%03d\n",s1,x);
            }
            System.out.println("\n================================");
            sc.close();
    }
}