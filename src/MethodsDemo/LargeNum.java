package MethodsDemo;
//find largest num from 2 number return from method return write in if else and print in main method 
import java.util.*;
public class LargeNum {
	
	static int largestNum(int num1, int num2) {
		if(num1>num2) {
			return num1;
		}else
			return num2;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num1 ");
		int num1=sc.nextInt();
		System.out.println("enter num2 ");
		int num2=sc.nextInt();
		int largenum=largestNum(num1,num2);
		System.out.println("largest num is: "+largenum);
		

	}

}
//output
/*
enter num1 
13
enter num2 
17
largest num is: 17
*/

