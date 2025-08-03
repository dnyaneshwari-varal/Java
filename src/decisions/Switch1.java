package decisions;
import java.util.*;


public class Switch1 {

	public static void main(String[] args) {
		int option;
		Scanner sc=new Scanner(System.in);
		option =sc.nextInt();
		switch(option) {
		case 1:System.out.println("English");
		break;
		case 2:System.out.println("Hindi");
		break;
		case 3:System.out.println("Marathi");
		break;
		default:System.out.println("give valid input");
		}
		

	}

}
