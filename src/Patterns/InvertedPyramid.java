package Patterns;
public class InvertedPyramid {
    public static void main(String[] args) {
        int row = 4;
        int x=1;
        for(int i=1;i<=row;i++) {
        	for(int j=0;j<i-1;j++) {
        		System.out.print(" ");
        	}
        	for(int k=1;k<=2*row-x;k++) {
        		System.out.print("*");
        		
        	}x=x+2;
        	System.out.println();
        }

        
    }
}

/*

output=
*******
 *****
  ***
   *


*/