//print factorial of number 2 to 7
package Day2;

public class Pattern5 {
     public static void main(String[] args) {
    	 for(int num=2; num<=7; num++) {
    		 int fact=1;
    		 for(int i=1; i<=num; i++) {
    			 fact=fact*i;
    		 }System.out.println(fact);    	 }
     }
}
