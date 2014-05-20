package com.d.factory.abstarctfactory;

public class IntelFactory implements AbstractFactory {

	@Override
	public Cpu createCpu() {
		// TODO Auto-generated method stub
		return new IntelCpu(755);
	}

	@Override
	public MainBoard createMainBoard() {
		// TODO Auto-generated method stub
		return new IntelMainboard(755);
	}

}
