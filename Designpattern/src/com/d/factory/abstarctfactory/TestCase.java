package com.d.factory.abstarctfactory;

import org.junit.Test;

public class TestCase {
	@Test
	public void test() {
		ComputerEngineer cf = new ComputerEngineer();
		AbstractFactory af = new AmdFactory();
		cf.makeComputer(af);
	}
}
