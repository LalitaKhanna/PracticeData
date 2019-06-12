package com.test;

import java.util.Scanner;

public class TestDemo {
	public static void reverse(char arr[])
	{ int  r = arr.length-1;
		int l=0;
		while(l<r) {
		if(!Character.isAlphabetic(arr[l]))
		l++;
		else if(!Character.isAlphabetic(arr[r]))
			r--;
		else {
			char temp = arr[l];
			arr[l] = arr[r];
			arr[r]= temp;
			l++;
			r--;
			
		}
	}}
	public static void main(String []argh){
		 String str = "a!!!b.c.d,e'f,ghi"; 
		 char[] arr = str.toCharArray();
		 System.out.println("input string--  "  +  str);
		 reverse(arr);
		 String rev =new String(arr);
		 System.out.println("reversed string--  "  +  rev);
    }
}