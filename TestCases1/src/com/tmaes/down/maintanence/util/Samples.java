package com.tmaes.down.maintanence.util;

public class Samples implements Addition {

	public static void main(String[] args) {
		Samples s = new Samples();
		System.out.println(s.additionofint(10,50,30));
		System.out.println(s.additionofstr("computer"," system ","class"));

	}

	
	public int additionofint(int a, int b, int c) {
		int d = a+b+c;
		return d;
	}

	
	public String additionofstr(String a, String b, String c) {
		String z = a+b+c;
				
		return z;
	}

}
