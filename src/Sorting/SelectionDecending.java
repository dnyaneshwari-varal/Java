package Sorting;

import java.util.Scanner;

public class SelectionDecending {

	
		static void SelectionDescending(int arr[]) {
			int temp=0;
			for(int i=0;i<5;i++) {
				int large=i;
				for(int j=i+1;j<5;j++) {
					
					if(arr[large]<arr[j]) {
						large=j;
					}
				}if(i != large) {
					temp=arr[i];
					arr[i]=arr[large];
					arr[large]=temp;
			     }
		   }
	   }
		

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int arr[]=new int[5];
			System.out.println("enter array element: ");
			for(int i=0;i<5;i++) 
				arr[i]=sc.nextInt();
				
			
			
			SelectionDescending(arr);
			System.out.println("after sorting descending order: ");
			
			for(int i=0;i<5;i++) 
				System.out.println(arr[i]);
		}		
			
		
	
}
/*
enter array element: 
12
34
1
2
45
after sorting descending order: 
45
34
12
2
1
 */