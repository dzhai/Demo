package com.d.factory.factorymethod.demo2;

public class ExprotFinancialPdfFile implements ExportFile {

	@Override
	public boolean exprot(String data) {
		System.out.println("导出财务版PDF文件");
		return true;
	}

}
