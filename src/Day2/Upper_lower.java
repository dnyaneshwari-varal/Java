package Day2;
import java.util.*;
public class Upper_lower {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter lower number");
		int lower=sc.nextInt();
		System.out.println("enter upper number");
		int upper=sc.nextInt();
		
		for(int i=lower; i<upper; i=i+3) {
			System.out.println(i);
		}

	}

}
