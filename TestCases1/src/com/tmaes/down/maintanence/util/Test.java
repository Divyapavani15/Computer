package com.tmaes.down.maintanence.util;

class vehicle {
	void start()
	{
		System.out.println("vehicle starting");
	}
}
class bike extends vehicle {
	void start()
	
	{
		System.out.println("bike starting safely");
	}
}
class Test {
	public static void main(String args[])
	{
		bike b = new bike();
	
		b.start();
	}
}
