package Day2;
import java.util.*;
public class Program3DoWhile {

	public static void main(String[] args) {
		int sum=0, num;
		do {
			System.out.println("enter the num: ");
			Scanner sc=new Scanner(System.in);
			num=sc.nextInt();
			sum=sum+num;
			
		}while(num>0);
		
		System.out.println(sum);
	}

}
