//find simple interest
package MethodsDemo;
import java.util.*;
public class SimpleIntrest {
	
	static void simpleInt(int p,float r, int t) {
		double SI=0;
		SI=(p*r*t)/100;
		System.out.println("simple intrest is "+SI);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter principal");
		int principal=sc.nextInt();
		System.out.println("enter Rate");
		float Rate=sc.nextInt();
		System.out.println("enter Time");
		int time=sc.nextInt();
		simpleInt(principal, Rate, time);
	}

}
/*output
enter principal
1000
enter Rate
5
enter Time
1
simple intrest is 50.0 */
