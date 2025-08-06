package MethodsDemo;
//take input as character in main then check in method its character or not if yes return 1 if no then return 1 and print it in main
import java.util.*;
public class IsCharacter {
	static int isChar(char ch) {
		if((ch >=65 && ch<=90) || (ch>=97 && ch<=122)) {
			return 1;
		}else
			return 0;

		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter character");
		char ch=sc.next().charAt(0);
		int result=isChar(ch);
		if(result==1)
			System.out.println(ch+ " is Alphabet");
		else
			System.out.println(" is not Alphabet");
		

	}

}
//output
/*
enter character
A
A is Alphabet
*/