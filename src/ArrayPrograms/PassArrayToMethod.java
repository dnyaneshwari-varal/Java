package ArrayPrograms;
import java.util.*;
public class PassArrayToMethod {
	static void show(int[] arr) {
		for(int i=0;i<5;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	

	public static void main(String[] args) {
		int[] arr=new int[5];
		System.out.println("enter the values in the array ");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		
		show(arr);
	}

}
