package com.rana.test;

public class SingletonMultiThreadingBreak {

	public static void main(String[] args) {
		
		ThreadSingleton single = new ThreadSingleton();
		
		Thread t1 = new Thread(single);
		Thread t2 = new Thread(single);
		
		t1.start();
		t2.start();

	}

}
