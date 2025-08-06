package MethodsDemo;
import java.util.*;
public class HW1 {
	static int powerOfNum(int num,int power) {
		int result=1;
		
		for(int i=0;i<power;i++) {
			result=result*num;
			
		}return result;
	}

	public static void main(String[] args) {
		int power,num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		num=sc.nextInt();
		System.out.println("enter power");
		power=sc.nextInt();
		int result=powerOfNum(num,power);
		System.out.println("ans is "+result);
		
		

	}

}
//output
/*
enter number
3
enter power
4
ans is 81
*/

