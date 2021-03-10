package javaprogram;

import java.util.Scanner;

public class j1PRN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int p,r,n;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Present value =>");
		p=sc.nextInt();
		
		System.out.print("Enter Rate value =>");
		r=sc.nextInt();
		
		System.out.print("Enter No of year value =>");
		n=sc.nextInt();
		
		System.out.println("Interest  = " + (p*r*n)/100);
		
	}

}
