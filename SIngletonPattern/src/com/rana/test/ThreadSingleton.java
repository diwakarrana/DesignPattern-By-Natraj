package com.rana.test;

import com.rana.singleton.SingletonPrinter;

public class ThreadSingleton implements Runnable {

	@Override
	public void run() {
		// i will create multiple thread of this code.
		SingletonPrinter p1 = SingletonPrinter.getInstance();
		System.out.println(p1.hashCode()+"  "+Thread.currentThread().getName());
		
	}

}
