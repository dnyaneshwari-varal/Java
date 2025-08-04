package Day2;

public class FactWhile {

	public static void main(String[] args) {
		int i=1;
		int num=5;
		int fact=1;
		while(i<=num) {
			fact=fact*i;
			//System.out.println(fact);
			i++;
		}
		System.out.println(fact);

	}

}
