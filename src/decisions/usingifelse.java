package decisions;
import java.util.*;
public class usingifelse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		System.out.println("input: ");
		
		if(ch >= 48 && ch <= 58) {
			System.out.println("ch is digit");
		}
	    
		if(ch >= 65 && ch <= 90) {
			System.out.println("uppercase");
		}
		
		else if(ch >= 97 && ch <= 122) {
			System.out.println("lowercase");
		}

	}

}
