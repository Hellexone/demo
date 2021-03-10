package javaprogram;

import java.util.Scanner;

public class j6Salary2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double salary,finalsalary,da,ma,hra;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the Value of Salary=");
		salary=sc.nextDouble();
		
		da=salary*0.15;
		ma=salary*0.20;
		hra=salary*0.25;
	    finalsalary =salary+ da + ma + hra;
		
		System.out.println("your DA = " + da);
		
		System.out.println("your MA = " + ma);
		
		System.out.println("your HRA = " + hra);
		
		System.out.println("your final salary = " + finalsalary);
		

	}

}
