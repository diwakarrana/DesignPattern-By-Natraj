package com.rana.test;

import com.rana.singleton.SingletonPrinterEager;

public class SingletonTestEager {

	public static void main(String[] args) {
		
		SingletonPrinterEager p1 = SingletonPrinterEager.getInstance();
		SingletonPrinterEager p2 = SingletonPrinterEager.getInstance();
		p1.print("Diwakar rana first instance "+ p1.hashCode());
		p2.print("Diwakar rana second instance "+ p2.hashCode());
		
	}
}
