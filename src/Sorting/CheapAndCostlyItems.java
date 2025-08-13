package Sorting;
import java.util.*;
public class CheapAndCostlyItems {
	static void cheapCostly(int arr[]){
		int large,temp;
		for(int i=0;i<5;i++) {
			large=i;
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
		System.out.println("enter prizes of item: ");
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		cheapCostly(arr);

			System.out.println("highest price of item is: "+arr[0]);
			System.out.println("cheapest price of item is: "+arr[4]);
		
	}

}

/*
 output
 enter prizes of item: 
12
10
120
89
39
highest price of item is: 120
cheapest price of item is: 10
*/
