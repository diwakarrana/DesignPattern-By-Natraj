package com.rana.test;

import com.rana.singleton.SingletonPrinter;

public class SingletonCloningTest {

	public static void main(String[] args) {
		SingletonPrinter sp2 =null;
		SingletonPrinter sp = null;
		
		 sp = SingletonPrinter.getInstance();
		
		try {
			 sp2 = (SingletonPrinter)sp.doClone();
		}catch(CloneNotSupportedException  c) {
			c.printStackTrace();
		}
		
		System.out.println(sp.hashCode()+"  "+sp2.hashCode());
	}
}
