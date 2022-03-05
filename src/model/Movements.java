package model;

public class Movements {
	
	private int revenues,expenses;
	
	public Movements(int revenues,int expenses) {
		this.revenues=revenues;
		this.expenses=expenses;		
	}

	public int getRevenues() {
		return revenues;
	}

	public int getExpenses() {
		return expenses;
	}
	
}
