package Array2D;
import java.util.*;
public class AddMarks {
	static void accpetMarks(int arr1[][],int row,int clm) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter elements arr1: ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<clm;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
//		System.out.println("enter elements arr2: ");
//		for(int i=0;i<row;i++) {
//			for(int j=0;j<clm;j++) {
//				arr2[i][j]=sc.nextInt();
//			}
//		}
	}
	
	
	static void displayMarks(int arr1[][],int row,int clm) {
		
		System.out.println("display elements arr1: ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<clm;j++) {
				System.out.print(arr1[i][j]+" ");
			}System.out.println();
		}
//		System.out.println("display elements arr2: ");
//		for(int i=0;i<row;i++) {
//			for(int j=0;j<clm;j++) {
//				System.out.print(arr2[i][j]+" ");
//			}
//		}
	}
	
	static void addmarks(int arr1[][],int row,int clm) {
		int add = 0,avg;
		
		for(int i=0;i<row;i++) {
			for(int j=1;j<clm;j++) {
				add=add+arr1[i][j];
			}avg=(add/(clm-1));
			System.out.println("average of roll num: "+(i+1) +"is"+ avg);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of rows:");
		int row=sc.nextInt();
		System.out.println("enter value of clm:");
		int clm=sc.nextInt();
		int arr1[][]=new int[row][clm];
		//int arr2[][]=new int[row][clm];
		//int arr3[][]=new int[row][clm];
		accpetMarks(arr1,row,clm);
		displayMarks(arr1,row,clm);
		addmarks(arr1,row,clm);
	}

}

/*
enter value of rows:
3
enter value of clm:
4
enter elements arr1: 
1
23
24
25
2
34
35
37
3
24
45
35
display elements arr1: 
1 23 24 25 
2 34 35 37 
3 24 45 35 
average of roll num: 1is24
average of roll num: 2is48
average of roll num: 3is59
*/
