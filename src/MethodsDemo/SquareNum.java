package MethodsDemo;
import java.util.*;
public class SquareNum {
	static void squareNum(int num) {
		int squ=num*num;
		System.out.println("Square of num "+num +" is "+squ);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		int num=sc.nextInt();
		squareNum(num);

	}

}
