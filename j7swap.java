package javaprogram;

import java.util.Scanner;

public class j7swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c,d;
		
		Scanner sc=new Scanner(System.in);
	     
       System.out.print("enter the value of a =>");
       a=sc.nextInt();
       
       System.out.print("enter the value of b =>");
       b=sc.nextInt();
       
       System.out.println("Before swap a = " +a + " b = "+b);
       
       c=a;
       a=b;   		        
       b=c;
       
       System.out.println("After swap a = " +a + " b = "+b);

	}

}
