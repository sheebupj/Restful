package com.paremal.sheebu.chainOfResponsibility;

public abstract class AbstractRupeeDispenser  {
	
	DispenseChain nextChain;
	int currencyValue;
	String displayString;

	public AbstractRupeeDispenser( int currencyValue, String displayString) {
		super();
		
		this.currencyValue = currencyValue;
		this.displayString = displayString;
	}
	public void setNextChain(DispenseChain chain){
		nextChain=chain;
	}

	public void dispense(Currency currency) {
		// TODO Auto-generated method stub
		if(currency.getAmount()<currencyValue){
			nextChain.dispense(currency);
		}else{
			int num = currency.getAmount()/currencyValue;
			int bal=currency.getAmount()%currencyValue;
			System.out.println("dispensing " + num + displayString);
			if(bal!=0){
				nextChain.dispense(new Currency(bal));
			}
		}

	}

}
