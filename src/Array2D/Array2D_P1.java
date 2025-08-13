package Array2D;
import java.util.*;
public class Array2D_P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int row=sc.nextInt();
		System.out.println("enter clm ");
		int clm=sc.nextInt();
		int [][]arr=new int[row][clm];
		System.out.println("enter elements ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<clm;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
//		for(int i=0;i<row;i++) {
//			for(int j=0;j<clm;j++) {
//				System.out.print(arr[i][j]+" ");
//			}System.out.println();
//		}
// OR
		for(int i=0;i<row;i++) {
			for(int elem:arr[i]) {
				System.out.print(elem);
			}System.out.println();
		}
		

	}

}
/*output
 enter row 
3
enter clm 
3
enter elements 
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
7 8 9 */
