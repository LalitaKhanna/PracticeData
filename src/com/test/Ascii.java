package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strList1 = Arrays.asList("a", "efg", "mca", "gha", "kgha", "ajk");
		System.out.println("=========================");
		List<Long> list=strList1.stream().filter(x -> !x.isEmpty()).filter(y -> y.contains("a"))
				.map(z->getAscii(z)).collect(Collectors.toList());
				
				System.out.println(list);
	}

	static long getAscii(String i) {
		// TODO Auto-generated method stub
		//StringBuilder sb = new StringBuilder();
		// String i = "Awelcome";
		char[] letters = i.toCharArray();
		long result = 0;
		for (char ch : letters) {
			result += ((byte) ch);
			
		}
		System.out.println(i+"--"+result);
		return result;
	}

	}


