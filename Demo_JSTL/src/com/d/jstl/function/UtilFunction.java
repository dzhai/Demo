package com.d.jstl.function;

public class UtilFunction {

	public static String formatFileSize(String sizeString) {
		long size=Long.parseLong(sizeString);
		String result = "";
		if (size > 1024 * 1024) {
			result = size / 1024 / 1204 + " MB";
		} else if (size > 1024) {
			result = size / 1024 / 1204 + " KB";
		} else {
			result = size + " B";
		}
		return result;
	}
}