package com.test;

public class FibonacciSer {
	
	static int first =1, sec=3, next;
	static int size = 10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("fibonacci Series");
		System.out.println(first);
		System.out.println(sec);
		FibonacciSer fibonacciSer=new FibonacciSer();
		fibonacciSer.getFeboonicSeries();
		
	}
	
	public void getFeboonicSeries(){
		
		for(int i = 0; i<=size-2 ; i++)
		{
			    next = sec + first;
				first = sec;
				sec = next;
				System.out.println(next);
				
			
		}
	}

}
