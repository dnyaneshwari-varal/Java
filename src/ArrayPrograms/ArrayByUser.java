package ArrayPrograms;
import java.util.*;
public class ArrayByUser {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		System.out.println("enter array value ");
		for(int i=0;i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("array values are ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		

	}

}
//output
/*
enter array value 
1
2
3
4
5
array values are 
1
2
3
4
5
*/
