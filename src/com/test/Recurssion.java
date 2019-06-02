package com.test;

public class Recurssion {

	/**
	 * @param args
	 */
	int fact(int n){
		if(n>=1)
		{
			return (n*fact(n-1));
		}
		else
			return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recurssion f = new Recurssion();
		//f.fact(3);
		System.out.println(f.fact(19));
		
	}
}


