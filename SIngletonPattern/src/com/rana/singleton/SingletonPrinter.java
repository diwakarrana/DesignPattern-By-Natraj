package com.rana.singleton;

public class SingletonPrinter implements Cloneable{
	//example of lazy instantiation.....
	private static SingletonPrinter INSTANCE = null;
	
	private SingletonPrinter() {
		
	}
	
	//factory method......
	//synchronized method to prevent singleton class from breaking singleton  behaviour
	/*synchronized public static SingletonPrinter getInstance() {
		if(INSTANCE == null)
			INSTANCE = new SingletonPrinter();
		return INSTANCE;
	}*/
	
	//synchronized block is more preferable than method because it makes limited lines of code
	//synchronized ..

	 public static SingletonPrinter getInstance() 
	 {
		 //here i am using class level lock because block is there in static block
		 if(INSTANCE == null) {
			 synchronized (SingletonPrinter.class) {
						if(INSTANCE == null)
							INSTANCE = new SingletonPrinter();
			 			}//end of block
		 			}//end of if
		return INSTANCE;
	 }//end of method
	
	
	public void print(String msg) {
		System.out.println(msg);
	}
	
	
	
	public Object doClone() throws CloneNotSupportedException {
		return super.clone();
	}
}
