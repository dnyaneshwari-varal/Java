package Array2D;
import java.util.*;
public class AddPercentage {

	static void diplay(double arr[][],int row,int clm) {
		System.out.println("matrix is: ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<clm;j++){
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
	}
	static void priceCheck(double arr[][],int row,int clm) {
		
		for(int i=0;i<row;i++) {
			double total=0;
			for(int j=0;j<clm;j++){
				if(arr[i][j]>=100) {
					arr[i][j]=arr[i][j]+(arr[i][j]*0.05);
					//System.out.println("after add of 5% "+arr[i][j]);
				}
				total=total+arr[i][j];
			}System.out.println("total for person "+(i+1) +" is "+total);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rows: ");
		int row=sc.nextInt();
		System.out.println("enter clm: ");
		int clm=sc.nextInt();
		double arr[][]=new double[row][clm];
		System.out.println("enter price of items ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<clm;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		diplay(arr,row,clm);
		priceCheck(arr,row,clm);
	}

}
/*
 enter rows: 
2
enter clm: 
2
enter price of items 
100
100
100
100
matrix is: 
100.0 100.0 
100.0 100.0 
total for person 1 is 210.0
total for person 2 is 210.0
*/
