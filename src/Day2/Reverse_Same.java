package Day2;
import java.util.*;
public class Reverse_Same {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter num ");
		int num=sc.nextInt();
		int temp=num;
		int rev=0;
		
		for( ;temp>0;temp/=10) {
			int rem=temp%10;
			rev=rev*10+rem;
			
		}System.out.println(rev);
		if(num==rev)
			System.out.println("num and rev is same");
		else
			System.out.println("num and rev is not same");
			

	}

}
