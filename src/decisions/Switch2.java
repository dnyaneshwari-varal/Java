package decisions;
import java.util.*;
public class Switch2 {

	public static void main(String[] args) {
		// Add
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1: ");
		int num1=sc.nextInt();
		System.out.println("Enter num2: ");
		int num2=sc.nextInt();
		
		int option;
		System.out.println("enter your choice\n 1 Add \n 2 Sub\n 3 Mult\n 4 Div\n");
		option=sc.nextInt();
		switch(option) {
		case 1:System.out.println("Addition"+(num1+num2));
		break;
		case 2:System.out.println("Subtraction"+(num1-num2));
		break;
		case 3:System.out.println("Multiplication"+(num1*num2));
		break;
		case 4:System.out.println("Divide"+(num1/num2));
		break;
		default:System.out.println("Invalid Input");
		
		}
		

	}

}
