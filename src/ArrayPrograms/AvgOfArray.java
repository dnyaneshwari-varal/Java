package ArrayPrograms;
import java.util.*;
public class AvgOfArray {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		System.out.println("enter the values: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//			for(int j=0;j<arr.length;i++) {
				sum=sum+arr[i];
//			}
		}float avg=sum/(arr.length);
		System.out.println("average is: "+avg);

	}

}
/*
 output
enter the values: 
1
2
3
4
5
average is: 3.0
*/
