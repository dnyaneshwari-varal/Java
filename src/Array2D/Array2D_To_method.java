package Array2D;
import java.util.*;
public class Array2D_To_method {
	static void passArray(int arr[][],int row,int clm) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<clm;j++) {
			    System.out.print(arr[i][j] +" ");
			}System.out.println();		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row: ");
		int row=sc.nextInt();
		System.out.println("enter clm: ");
		int clm=sc.nextInt();
		int arr[][]=new int[row][clm];
		System.out.println("enter array elements: ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<clm;j++) {
			    arr[i][j]=sc.nextInt();
			}
		}
		passArray(arr,row,clm);

	}

}
/*
enter row: 
3
enter clm: 
3
enter array elements: 
1
2
3
4
5
6
7
8
9
1 2 3 
4 5 6 
7 8 9 
*/
