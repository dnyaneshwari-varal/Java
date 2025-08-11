package MethodsDemo;
import java.util.*;
public class HW2FindArea {
	//area=3.14*r^2
	static double circleRadius(float r) {
		double area=3.14*(r*r);
		return area; 
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter radius");
		float radius=sc.nextFloat();
		double area=circleRadius(radius);
		System.out.println("Area of circle is: "+area);
		

	}

}
/*
 output
enter radius
4.5
Area of circle is: 63.585
*/
