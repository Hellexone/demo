package javaprogram;

import java.util.Scanner;

public class j9dollartorupees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double dollar,c;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter the value of dollar=>");
		dollar=sc.nextInt();
	    
	    c=dollar*73.08;
	    		
	    System.out.println("Dollar TO Rupees = " + c);
	}

}
