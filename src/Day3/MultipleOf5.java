package Day3;
import java.util.*;
public class MultipleOf5 {
	
	public static void main(String []str) {
		String option;
		Scanner sc=new Scanner(System.in);
		int num=1;
		while(num !=0) {
		  System.out.println("enter num ");
		   num=sc.nextInt();
		   if(num%5==0) {
			 System.out.println(num+" is multiple of 5");
		   }else
			   continue;
		}
	}
}
