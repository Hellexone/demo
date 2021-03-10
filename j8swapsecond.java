package javaprogram;

import java.util.Scanner;

public class j8swapsecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter the value of a=>");
		a=sc.nextInt();
		
		System.out.println("enter the value of b=>");
		b=sc.nextInt();
		
		System.out.println("before swap a = " +a + " b = "+a);
		
		a=a+b;
		b=a-b;
		a=a-b;
			
	    System.out.println("after swap a = " +a + " b = "+a);
		
		

	}

}
