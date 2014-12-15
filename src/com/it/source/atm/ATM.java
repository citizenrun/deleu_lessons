package com.it.source.atm;

import com.it.source.atm.collections.Box;
import com.it.source.atm.logic.Logic;
import com.it.source.atm.money.Hryvnia;
public class ATM {
	
	public void insertClientValue(int clientValue){
		Box<Hryvnia> bag = new Box<Hryvnia>();
		Logic logic = new Logic(bag);
		Hryvnia cash = new Hryvnia(clientValue);
		boolean checkresult = logic.checkConterfeit(cash);
		
		if (checkresult){
			logic.consume(cash);
		} else {
		logic.garbage();		
		}
	}
	
}
