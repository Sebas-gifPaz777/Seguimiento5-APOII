package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Movements {
	
	private int revenues,expenses;
	private LocalDate date;
	private String defDate;
	private String defRevenues;
	private String defExpenses;
	
	public Movements(int revenues,int expenses,LocalDate date) {
		this.revenues=revenues;
		this.expenses=expenses;	
		this.date=date;
		defDate= date.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
		defRevenues=String.valueOf(revenues);
		defExpenses=String.valueOf(expenses);
	}

	public int getRevenues() {
		return revenues;
	}

	public int getExpenses() {
		return expenses;
	}
	
	public LocalDate getDate() {
		return date;
	}

	public String getDefDate() {
		return defDate;
	}
	
	public String getDefRevenues() {
		return defRevenues;
	}
	
	public String getDefExpenses() {
		return defExpenses;
	}
}
