package com.d.factory.factorymethod;

import org.junit.Test;

public class TestCase {

	@Test
	public void test() {
		testfiancial();
		System.out.println("---");
		teststandard();
	}

	public void testfiancial() {
		String data = "";
		ExportFactory exprotFactory = new ExportHtmlFactory();
		ExportFile ef = exprotFactory.factory("fiancial");
		ef.exprot(data);
	}

	public void teststandard() {
		String data = "";
		ExportFactory exprotFactory = new ExportHtmlFactory();
		ExportFile ef = exprotFactory.factory("standard");
		ef.exprot(data);
	}
}
