package javaprogram;

import java.util.Scanner;

public class j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int h,w;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the value of height =>");
		h=sc.nextInt();
		
		System.out.print("Enter the value of width =>");
		w=sc.nextInt();
		
		System.out.println("Area of triangle = " + (h*w*0.5));

	}

}
