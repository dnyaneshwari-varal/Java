package MethodsDemo;
import java.util.*;
public class OddEvenMethod {
	
	static void oddEven(int num) {
		if(num%2==0) {
			System.out.println(num+" is even");
		}else
			System.out.println(num+" is odd");
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num");
		int num=sc.nextInt();
		oddEven(num);

	}

}
