package javaprogram;

import java.util.Scanner;

public class j5salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int salary;
		double donation;
		double after;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the value of Salary =>");
		salary=sc.nextInt();
		
		donation =salary*0.2;
		after = salary - donation;
		
		System.out.println("Your Salary = " +  salary);
		System.out.println("Your Dontation = " +  donation);
		System.out.println("After Deduction = " +  after);
		
	}

}
