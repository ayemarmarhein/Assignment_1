package Assignment_1;

public class ChildBranch extends Bank implements BankFunction {

	public ChildBranch(double income_Amount) {
		super(income_Amount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void increment(double income_Amount) {
		// TODO Auto-generated method stub
		tot_Amount += income_Amount;
		System.out.println("Increment Amount : " + tot_Amount);
	}

	@Override
	public void decrement(double income_Amount) {
		// TODO Auto-generated method stub
		tot_Amount -= income_Amount;
		System.out.println("Decrement Amount : " + tot_Amount);
	}
	
	public double total_Amount () {
		System.out.println("Total Amount : " + tot_Amount);
		return tot_Amount;
	}

}
