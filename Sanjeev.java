package hello;

import java.util.Scanner;
import java.lang.Math;

public class Sanjeev {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a =s.nextInt();
		int b=(int) Math.sqrt(a);
		
		for(;b>1;b--)
		{
			if(a%b==0)
			{
				System.out.println("It is not a prime number");
			}
			break;
		}
		if(a%b!=0) 
		{
	    	System.out.println("It is a prime number");
		
		}
	}
}
