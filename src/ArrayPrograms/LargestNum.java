package ArrayPrograms;
import java.util.*;
public class LargestNum {
	static int largeNum(int[] arr) {
		int largeN=1;
//		for(int i=0;i<arr.length;i++) {
//			System.out.println("array elements: "+arr[i]);
//		}
		for(int i=0;i<5;i++) {
		    if(largeN<arr[i]) {
		    	largeN=arr[i];
		    }
		}return largeN;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("enter array elements: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int largeN=largeNum(arr);
		System.out.println("largest num is: "+largeN);

	}

}

//output
/*
 enter array elements: 
2
5
8
12
1
largest num is: 12
*/
