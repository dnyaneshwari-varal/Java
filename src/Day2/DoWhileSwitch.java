package Day2;
import java.util.*;
public class DoWhileSwitch {

	public static void main(String[] args) {
		int option,num1,num2,total;
		String choice;
		do
		{
		System.out.println("enter two numbers:");
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.println("Enter your choice\n1.add\n2.sub\n3.mult\n5.divide");
		
		option=sc.nextInt();
		
		switch(option){
		
		case 1:
			total=num1+num2;
			System.out.println("addition is "+total);
			break;
		case 2:
			total=num1-num2;
			System.out.println("subtraction is "+total);
			break;
		case 3:
			total=num1*num2;
			System.out.println("multiplication is "+total);
			break;
		case 4:
			total=num1/num2;
			System.out.println("division is "+total);
			break;
			
		}
		System.out.println("do you wish to continue");
		choice=sc.next();
		}
		
		while(choice.equals("yes"));

	}

}
