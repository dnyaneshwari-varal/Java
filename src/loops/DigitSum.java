//sum of digits from number
package loops;
import java.util.*;
public class DigitSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		//int temp=num;
		int n=0;
		for(int temp=num;temp >0; temp/=10) {
			int digit=temp%10;
			n=n+digit;
		    
			
		}
		System.out.println(n);

	}

}
