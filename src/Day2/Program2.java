//ask the user to enter num. and find the sum of the num. stop accepting num when user enter 0 or negative values. print sum.
package Day2;
import java.util.*;
public class Program2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num: ");
		int num=1;
		int sum=0;
		while(num>0) {
			System.out.println("enter num: ");
			num=sc.nextInt();
			if(num>0) {
				sum=sum+num;
			}else {
				System.out.println("num is less oe equal to 0: ");
				break;
			}
		
			//sum=sum+num;
			
			
		}System.out.println(sum);

	}

}
