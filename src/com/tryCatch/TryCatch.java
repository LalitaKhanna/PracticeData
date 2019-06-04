package com.tryCatch;

public class TryCatch {
	void exception() throws Exception
	{
		int arr[]= {5,6,7,8,9};
		System.out.println(arr[6]);
		
	}

	public static void main(String[] args) 
	{
	TryCatch o = new TryCatch();
		try {
			o.exception();
		} catch(Exception e){
			System.out.println("Error :" + e.getMessage());
		}
	}
}
