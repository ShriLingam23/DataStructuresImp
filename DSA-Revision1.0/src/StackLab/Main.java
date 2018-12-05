package StackLab;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		StackX stackX= new StackX(5);
		stackX.push('a');
		stackX.push('b');
		stackX.push('c');
		stackX.push('d');
		stackX.push('e');
		
		while(!stackX.isEmpty()) {
			System.out.println(stackX.pop());
		}
		
		System.out.print("Enter the Expression : ");
		String exp=sc.nextLine();
		
		BracketChecker checker = new BracketChecker(exp);
		boolean result = checker.check();
		
		if(result)
			System.out.println("Valid Expression");
		else
			System.out.println("InValid Expression");
		
		System.out.print("\nEnter the Line to be Reversed : ");
		String in=sc.nextLine();
		
		Reverser reverser = new Reverser(in);
		System.out.println(reverser.reverse());
		

	}

}
