//Armstrong number
package Day2;

public class Hw3 {

	public static void main(String[] args) {
		int num=153;
		int count=0;
		
		for(int temp=num; temp>0; temp/=10) {
			int digit=temp%10;
			count++;
		}System.out.println(count);
		
		int sum=0;
		for(int temp=num;temp>0;temp/=10) {
			int digit1=temp%10;
			int power=1;
			for(int i=0;i<count;i++) {
				power=power*digit1;
			}
			sum=sum+power;
		}
		if(num==sum)
			System.out.println("num is armstrong");
		else
			System.out.println("not armstrong");

	}

}
