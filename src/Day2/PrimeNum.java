package Day2;
import java.util.*;
public class PrimeNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number: ");
		int num=sc.nextInt();
		int count=0;
		int i=2;
		while(i<num) {
			if(num%i==0)
				break;
			else
				count++;
			i++;
		}if(count==num-2) 
			System.out.println(num+" is prime number");
		else 
			System.out.println(num+" is not prime number");
		
		

	}

}
