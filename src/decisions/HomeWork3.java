package decisions;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numer=sc.nextInt();
		int Deno=sc.nextInt();
		int result = 0;
		if(Deno != 0) {
			result=numer/Deno;
			System.out.println("result is " +result);
		}else {
			System.out.println("Denomenator cannot be zero");
		}
	}

}
