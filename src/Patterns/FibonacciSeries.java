package Patterns;
public class FibonacciSeries {
    public static void main(String[] args) {
        int first=0;
        int second=1;
        System.out.print("Fibonacci Series: " + first + " " + second);
        int next=0;
        for(int i=1;i<=10;i++) {
        	next=first+second;
        	System.out.print(" "+next);
        	first=second;
        	second=next;
        	
        }
    }
}
/*
output
Fibonacci Series: 0 1 1 2 3 5 8 13 21 34 55 89

*/