package Assignment_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please, Enter your amount : ");
		double income_Amount = scanner.nextDouble();
		ChildBranch childBranch = new ChildBranch(income_Amount);
		
		System.out.println("Enter your increment amount : ");
		double increment_Amount = scanner.nextDouble();
		childBranch.increment(increment_Amount);
		
		System.out.println("Enter your decrement amount : ");
		double decrement_Amount = scanner.nextDouble();
		if(decrement_Amount > income_Amount) {
			System.out.println("Insufficient Amount");
		}else {
			childBranch.decrement(decrement_Amount);
		}
		
		childBranch.total_Amount();

	}

}
