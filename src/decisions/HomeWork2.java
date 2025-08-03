//check number is divisible by 5 or not
package decisions;
import java.util.*;
public class HomeWork2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num%5==0) 
			System.out.println(num +" is divide by 5");
		else
			System.out.println(num +" is not divisible by 5");
		

	}

}
