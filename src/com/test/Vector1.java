package com.test;

import java.util.ArrayList;

public class Vector1 {

static int size, cap, inc;
 private int [] vec;
 public void  Vector(int size)
 {
     this.size = size;
     this.cap = size + inc;
     
 }

public int getSize()
{
    return size;
}

public int getcap()
{
    return cap;
}
public void print(int arr[])
{
	size = arr.length;
	for(int i=0; i<=size;i++)
		System.out.println(arr[i]);
}

   public static void main(String[] args)

{
	int arr[] = {10,20,30,40,50};
	Vector1 obj =new Vector1();
	System.out.println("done");
	//obj.print(arr);
}
}
