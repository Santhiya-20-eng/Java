
import java.util.Scanner;
public class Prob1 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int val=sc.nextInt();
        for(int i=1;i<=12;i++)

        {
            int result=val*i;
            System.out.println(val+"x"+i+"="+result);
        }
    }
}