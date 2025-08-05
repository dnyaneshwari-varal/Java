package MethodsDemo;
import java.util.*;
public class MethodAddNum {
	static void add(int num1,int num2) {
		int result=num1+num2;
		System.out.println("addition is "+result);
	}

	public static void main(String[] args) {
		int num1, num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number: ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		add(num1,num2);
		

	}

}
