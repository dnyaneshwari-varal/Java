package Day2;
import java.util.*;
public class BankEx {

	public static void main(String[] args) {
		int Balance,add,withdraw,option,amount,rema,dep;
		String choice;
		do {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter balance ");
			Balance=sc.nextInt();
			System.out.println("enter amount ");
			amount=sc.nextInt();
			System.out.println("select option:\n1.withdraw\n2.deposite\n3.check balance ");
			option=sc.nextInt();
		
			switch(option) {
			case 1:
				if(Balance <= 1000) {
					System.out.println("can''t withdraw");	
					
				}
				if(Balance <amount) {
					System.out.println("not sufficient balance");
					
					
				}if(Balance >1000 && Balance >amount) {
				rema=Balance-amount;
				withdraw=Balance-rema;
				System.out.println("amount withdraw "+withdraw);
				Balance=Balance-withdraw;
				System.out.println("total balance is: "+Balance);
			    
				}
				break;
			case 2:
				Balance=Balance+amount;
				System.out.println(amount+ "amount is added(deposite) ");
				System.out.println("total balance is: "+Balance);
			    break;
            
			case 3:
				System.out.println("balance is: "+Balance);
			    break;
			}
			
			System.out.println("do you wish to continue");
			choice=sc.next();
		
			
		}
		while(choice.equals("yes"));

	}

}
