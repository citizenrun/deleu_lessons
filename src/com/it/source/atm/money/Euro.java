package com.it.source.atm.money;

public class Euro extends Money {
	int par[] = {3,25,70,250,300,600};
	int value = 0;
	
	public Euro(int value) {
		this.value = value;
	}

	public int getValue(){
		return value;
	}
	
	public int[] getPar() {
        return par;
    }
}