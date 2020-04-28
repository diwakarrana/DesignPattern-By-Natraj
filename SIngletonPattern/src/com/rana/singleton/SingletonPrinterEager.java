package com.rana.singleton;

public class SingletonPrinterEager {
	//example of Eager instantiation.....
	private static final SingletonPrinterEager INSTANCE = new SingletonPrinterEager();
	
	private SingletonPrinterEager() {
		//no operation
	}
	
	//factory method......
	
	public static SingletonPrinterEager getInstance() {
		return INSTANCE;
	}
	
	public void print(String msg) {
		System.out.println(msg);
	}
}
