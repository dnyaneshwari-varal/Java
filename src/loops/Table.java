//print tables
package loops;
import java.util.*;
public class Table {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int tableOf =sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			int temp=tableOf;
			System.out.println(temp +"*" + i +"= " +temp*i);
			
		}
		

	}

}
