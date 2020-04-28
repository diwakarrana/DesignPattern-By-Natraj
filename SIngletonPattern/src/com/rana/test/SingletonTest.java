package com.rana.test;

import com.rana.singleton.SingletonPrinter;

public class SingletonTest {

	public static void main(String[] args) {
		
		SingletonPrinter p1 = SingletonPrinter.getInstance();
		SingletonPrinter p2 = SingletonPrinter.getInstance();
		p1.print("Diwakar rana first instance "+ p1.hashCode());
		p2.print("Diwakar rana second instance "+ p2.hashCode());
		
	}
}
