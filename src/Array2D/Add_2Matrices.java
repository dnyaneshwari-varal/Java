package Array2D;
import java.util.*;
public class Add_2Matrices {
	
	static void acceptElement(int arr1[][],int arr2[][],int row,int clm) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter elements of arr1: ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<clm;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter elements of arr2: ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<clm;j++) {
				arr2[i][j]=sc.nextInt();
			}
		}
		
	}
	
	static void displayArr(int arr1[][],int arr2[][],int row,int clm) {
	   System.out.println("diplay elements of arr1: ");
	   for(int i=0;i<row;i++) {
		   for(int j=0;j<clm;j++) {
			  System.out.print(arr1[i][j] +" ");
		   }System.out.println();
	  }System.out.println();
	  System.out.println("diplay elements of arr2: ");
	   for(int i=0;i<row;i++) {
		   for(int j=0;j<clm;j++) {
			  System.out.print(arr2[i][j]+" ");
		   }System.out.println();
	  }
	  
	}
	static void addArray(int arr1[][],int arr2[][],int arr3[][],int row,int clm) {
		
		System.out.println("Addition of two matrices: ");
		for(int i=0;i<row;i++) {
			   for(int j=0;j<clm;j++) {
				   arr3[i][j]=arr1[i][j]+arr2[i][j];   
			   }//System.out.println();
		 }
		for(int i=0;i<row;i++) {
			   for(int j=0;j<clm;j++) {
				   System.out.print(arr3[i][j]+" ");   
			   }System.out.println();
		 }
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row");
		int row=sc.nextInt();
		System.out.println("enter row");
		int clm=sc.nextInt();

		int arr1[][]=new int[row][clm];
		int arr2[][]=new int[row][clm];
		int arr3[][]=new int[row][clm];
		
		acceptElement(arr1,arr2,row,clm);
		displayArr(arr1,arr2,row,clm); 
		addArray(arr1,arr2,arr3,row,clm);

	}

}

/*
 enter row
3
enter row
2
enter elements of arr1: 
1
2
3
4
5
6
enter elements of arr2: 
1
2
3
4
5
6
diplay elements of arr1: 
1 2 
3 4 
5 6 

diplay elements of arr2: 
1 2 
3 4 
5 6 
Addition of two matrices: 


2 4 
6 8 
10 12 */
