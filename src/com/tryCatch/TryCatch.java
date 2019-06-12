package com.tryCatch;

import java.io.IOException;

public class TryCatch {
	// final , finally ,finalize;
	/*
	 * public TryCatch(String name, int marks) throws CustomException { if (marks <
	 * 0) { throw new CustomException("msg" + marks); } else {
	 * 
	 * }
	 * 
	 * }
	 */

	public void getException() throws IOException {
		System.out.println(10 / 0);
	}

	public static void main(String[] args) {
		/*
		 * TryCatch o = null; try { o = new TryCatch("prince", -67); } catch
		 * (CustomException e) { System.out.println("error:" + e.getMessage()); }
		 */

		TryCatch catch1 = new TryCatch();
		try {
			catch1.getException();
		} catch (Exception e) {
		} finally {

		}

	}
}