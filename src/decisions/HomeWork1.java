package decisions;
import java.util.*;
public class HomeWork1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Age ");
	int Age=sc.nextInt();
	System.out.println("Enter Gender ");
	char Gender=sc.next().charAt(0);
	
	if(Age > 25) {
		if(Gender=='F')
		   System.out.println(" eligible for policy 1");
		else
			if(Gender=='M')
		   System.out.println("gender is M eligible for policy 2");
			
	}else
		System.out.println("eligible for policy 3");

	}

}
