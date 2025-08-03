package decisions;

public class largestNum {

	public static void main(String[] args) {
		int num1=5;
		int num2=6;
		int num3=2;
		int res;
		res=(num1>num2)?(num1 >num3)?num1:num3:(num2>num3)?num2:num3;
		System.out.println(res+" largest num");


	}

}
