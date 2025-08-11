package ArrayPrograms;
import java.util.*;
public class Even_Odd {
	static int evenOdd(int[] arr) {
		int count1=0;
		int count2=0;
		for(int i=0;i<arr.length;i++) {
		   if( arr[i]%2==0) {
			   count1++;
		   }else
			   count2++;
			   
		}
		System.out.println("array element is odd "+count2);
		return count1;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		System.out.println("Enter array elements: ");
		for(int i=0;i<arr.length;i++) {
		    arr[i]=sc.nextInt();
		}
		int resulteven=evenOdd(arr);
		
			System.out.println("array elements are even "+resulteven);

	}

}

/*output
Enter array elements: 

1
2
3
4
5
6
7
8
9
10
array element is odd 5
array elements are even 5
*/
