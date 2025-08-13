package Sorting;
import java.util.*;
public class BubbleSort {
	static void bubble(int arr[]) {
		int temp=0;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
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
		bubble(arr);
		System.out.println("after sorting Ascending order: ");
		
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
			
		}
	}

}

/*
 output
 enter array element: 
12
13
2
26
4
after sorting Ascending order: 
2
4
12
13
26
*/
