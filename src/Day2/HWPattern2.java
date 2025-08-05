package Day2;

public class HWPattern2 {

	public static void main(String[] args) {
		int space=4;
		for(int i=0;i<4;i++) {
			space--;
			for(int k=space; k>0; k--) {
				System.out.print(" ");
			}for(int j=0;j<=i;j++) {
				System.out.print("* ");
				
			}System.out.println();
			
		
		}

	}

}
/* output
   * 
  * * 
 * * * 
* * * * 

*/
