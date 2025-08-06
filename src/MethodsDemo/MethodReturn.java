package MethodsDemo;
import java.util.*;
public class MethodReturn {
	static int add(int num1,int num2) {
		int result=num1+num2;
		return result;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num1 ");
		int num1=sc.nextInt();
		System.out.println("enter num2 ");
		int num2=sc.nextInt();
		int result=add(num1,num2);
		System.out.println("addition is "+result);
	}

}
