package com.paremal.sheebu.chainOfResponsibility;

public interface DispenseChain {
	
	public void setNextChain(DispenseChain chain);
	
	public void dispense(Currency currency);
	

}
