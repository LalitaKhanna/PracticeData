package com.tryCatch;

public class CustomException extends Exception {
	
  public CustomException(String msg)
  {
	  super("marks cant be negative");
  }
}
