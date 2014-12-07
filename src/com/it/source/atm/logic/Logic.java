package com.it.source.atm.logic;

import com.it.source.atm.collections.Box;
import com.it.source.atm.money.Hryvnia;

public class Logic {
		
	Box<Hryvnia> bag;

	public Logic(Box<Hryvnia> bag){
		this.bag = bag;
	}
	
	public boolean checkConterfeit(Hryvnia bank){
		boolean isConterfeit = false;
		for (int i = 0; i < bank.getPar().length; i++){
			if ( bank.getPar()[i] == bank.getValue()){
				isConterfeit = true;
				break;
			}
		}
		
		return isConterfeit;
		
	}
	
	public void garbage() {
		System.out.println("Stop! Police!");
		
	}

	public void consume(Hryvnia cash) {
		System.out.println("Good job!");
				bag.add(cash); 
	
	}
	
}
