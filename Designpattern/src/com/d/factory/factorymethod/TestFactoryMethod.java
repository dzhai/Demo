package com.d.factory.factorymethod;

import org.junit.Test;

public class TestFactoryMethod {
	@Test
	public void testFactoryMethod() {
       String data="";
       ExportFactory exprotFactory=new ExportHtmlFactory();
       ExportFile ef=exprotFactory.factory("fiancial");
       ef.exprot(data);
	}
}
