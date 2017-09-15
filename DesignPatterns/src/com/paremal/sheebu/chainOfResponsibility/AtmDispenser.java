package com.paremal.sheebu.chainOfResponsibility;

public class AtmDispenser {

	public AtmDispenser() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		DispenseChain d1= new Rupees2000Dispencer(2000, " 2000 Rupees Note");
		DispenseChain d2= new Rupees2000Dispencer(500, " 500 Rupees Note");
		DispenseChain d3= new Rupees2000Dispencer(100, " 100 Rupees Note");
		DispenseChain d4= new Rupees2000Dispencer(50, " 50 Rupees Note");
		DispenseChain d5= new Rupees2000Dispencer(20, " 20 Rupees Note");
		DispenseChain d6= new Rupees2000Dispencer(10, " 10 Rupees Note");
		DispenseChain d7= new Rupees2000Dispencer(5, " 5 Rupees Note");
		DispenseChain d8= new Rupees2000Dispencer(2, " 2 Rupees Note");
		DispenseChain d9= new Rupees2000Dispencer(1, " 1 Rupees Note");
		d1.setNextChain(d2);
		d2.setNextChain(d3);
		d3.setNextChain(d4);
		d4.setNextChain(d5);
		d5.setNextChain(d6);
		d6.setNextChain(d7);
		d7.setNextChain(d8);
		d8.setNextChain(d9);
		d1.dispense(new Currency(998));
	}

}
