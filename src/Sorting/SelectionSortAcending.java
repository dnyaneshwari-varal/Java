package Sorting;
import java.util.*;
public class SelectionSortAcending {
	static void SelectionAscending(int arr[]) {
		int temp=0;
		for(int i=0;i<5;i++) {
			int small=i;
			for(int j=i+1;j<5;j++) {
				
				if(arr[small]>arr[j]) {
					small=j;
				}
			}if(i != small) {
				temp=arr[i];
				arr[i]=arr[small];
				arr[small]=temp;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("enter array element: ");
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
			
		
		}
		SelectionAscending(arr);
		System.out.println("after sorting Ascending order: ");
		
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
			
		}

	}

}

/*output
 enter array element: 
12
1
16
2
34
after sorting Ascending order: 
1
2
12
16
34
*/
