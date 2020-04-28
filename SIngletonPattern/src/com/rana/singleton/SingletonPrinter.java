package com.rana.singleton;

public class SingletonPrinter {
	//example of lazy instantiation.....
	private static SingletonPrinter INSTANCE = null;
	
	private SingletonPrinter() {
		
	}
	
	//factory method......
	
	public static SingletonPrinter getInstance() {
		if(INSTANCE == null)
			INSTANCE = new SingletonPrinter();
		return INSTANCE;
	}
	
	public void print(String msg) {
		System.out.println(msg);
	}
}
