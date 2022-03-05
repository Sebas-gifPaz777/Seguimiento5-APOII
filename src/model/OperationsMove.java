package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class OperationsMove {

	private ArrayList<Movements> list= new ArrayList<Movements>();
	
	
	public boolean checkMove(int revenue,int expenses, LocalDate date) {
		
		if(list.add(new Movements(revenue,expenses,date))){
			System.out.println(list.get(0).getDefDate());
			return true;
		}
		else {
			return false;
		}
	}
	
	public ArrayList<Movements> getList(){
		return list;
	}
	
}
