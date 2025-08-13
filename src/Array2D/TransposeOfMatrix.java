package Array2D;
import java.util.*;
public class TransposeOfMatrix {
	static void transposeM(int arr[][],int row,int clm) {
//		for(int i=0;i<row;i++) {
//			for(int j=0;j<clm;j++) {
//				arr[i][j]=arr[j][i];
//			}
//		}
		System.out.println("transpose matrix is: ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<clm;j++) {
				System.out.print(arr[j][i]);
			}System.out.println();
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row: ");
		int row=sc.nextInt();
		System.out.println("enter clm: ");
		int clm=sc.nextInt();
		int arr[][]=new int[row][clm];
		for(int i=0;i<row;i++) {
			for(int j=0;j<clm;j++) {
				arr[i][j]=sc.nextInt();
			}
		}System.out.println(" matrix is: ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<clm;j++) {
				System.out.print(arr[i][j]);
			}System.out.println();
		}
		transposeM(arr,row,clm);
	}

}


/*
 enter row: 
3
enter clm: 
3
1
2
3
4
5
6
7
8
9
 matrix is: 
123
456
789
transpose matrix is: 
147
258
369
*/
 