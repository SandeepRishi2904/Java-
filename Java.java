package hello;

import java.util.Scanner;

public class Java {

	public static void main(String[] args) {
		hello();
		}
	static void hello()
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the 1st no:");
		int a=s.nextInt();
		System.out.println("Enter the 2nd no:");
		int b=s.nextInt();
		int c=a+b;
		System.out.println("The sum is "+c);
	}
}



