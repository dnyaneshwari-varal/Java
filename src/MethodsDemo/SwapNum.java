package MethodsDemo;

import java.util.Scanner;

public class SwapNum {
	static void swap(int a,int b){
		int temp=a;
		a=b;
		b=temp;
		System.out.println("value of a is  "+a);
		System.out.println("value of b is  "+b);
		
		
	}

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("value of a is: ");
		a=sc.nextInt();
		System.out.println("value of b is: ");
		b=sc.nextInt();
		swap(a,b);
		

	}

}
