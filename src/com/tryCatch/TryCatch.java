package com.tryCatch;

public class TryCatch {

	public static void main(String[] args) throws Exception {
		//System.out.println(10/0);
		try {
			System.out.println(10/0);
		} catch(Exception e){
			System.out.println("Error :"+e.getMessage());
			//System.out.println(10/0);
			//System.exit(0);
			//throw new Exception();
		}finally {
			System.out.println("Prince Uppal");
		}
	}
}
