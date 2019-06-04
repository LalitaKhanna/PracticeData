package com.tryCatch;

public class TryCatch {

	public static void main(String[] args) 
	{
		try {
			System.out.println(10/0);
		} catch(Exception e){
			System.out.println("Error :can not divide by zero");
		}finally {
			System.out.println("finaaly block");
		}
	}
}
