package com.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.*;

class Test{
	int i;
	int data;
	
	public Test(int i,int data){
		this.i=i;
		this.data=data;
	}
	
	@Override
	public int hashCode() {
		return 1;
	}
	
	@Override
    public boolean equals(Object o) { 
  
        // If the object is compared with itself then return true   
        if (o == this) { 
            return true; 
        } 
  
        /* Check if o is an instance of Complex or not 
          "null instanceof [type]" also returns false */
        if (!(o instanceof Test)) { 
            return false; 
        } 
          
        // typecast o to Complex so that we can compare data members  
        Test c = (Test) o; 
          
        // Compare the data members and return accordingly  
        return c.data==data;
    } 
	
	
	
}

public class Mapdemo {
	
	public static void main(String[] args) {
		Map<Test,Integer> map=new HashMap();
		String s=new String("A");
		String s1=new String("B");
		Mapdemo mapdemo=new Mapdemo();
		Set set=new HashSet();
		Test t=new Test(6,9);
		Test t1=new Test(6,8);
		Test t2=new Test(6,8);
		map.put(t,4);
		map.put(t1,6);
		map.put(t2,18);
		System.out.println(t.equals(t1));
		System.out.println(map);

		
	}
	
	
};
