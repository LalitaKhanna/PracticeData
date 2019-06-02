package com.test;
 
public class VectorDemo 
{
    private int arrSize; //
    private int index;  //
    private int vector[]; //
    private static final int INCREMENT_FACTOR = 5; //
 
    public VectorDemo(int arrSize)
    {
    	this.index = 0;
    	this.arrSize = arrSize;  
    	vector=new int[arrSize]; 
    }


 
    public int getSize()
    {
        return arrSize;
    }
    
    public void add(int value){
    	if((arrSize-1)== index){
    		increaseTheCapacity();
    	} else {
    		vector[index++]=value;
    	   	//System.out.println(value);
    	}
 
    }
    
    public void increaseTheCapacity(){
    	
    	//System.out.println("new capacity" );
    	this.arrSize=arrSize+5;
    	System.out.println("new size"+arrSize);
    	int newVec[]=new int[this.arrSize];
    	sort(newVec);
    }
    
    public void sort(int newVec[]){
    	for(int i=0;i<=index-1;i++){
    		newVec[i]=vector[i];
    	}
    	vector=new int[this.arrSize];
    	vector=newVec;
    }
    
    public void display(){
    	for(int i:vector){
    		System.out.println(" "+i);
    	}
    }
    
    public static void main(String... arg)
    {
    	VectorDemo vec=new VectorDemo(5);
    	vec.add(1);
    	vec.add(2);
    	vec.add(3);
    	vec.add(4);
    	vec.add(5);
    	vec.add(7);
    	vec.add(8);
    	vec.add(9);
    	vec.add(10);
    	vec.add(11);
    	vec.add(5);
    	vec.add(7);
    	vec.add(8);
    	vec.add(9);
    	vec.display();
    	//System.out.println(vec.getSize());
    	//System.out.println("Vec ArraySize"+vec.arrSize);
    
    }
}

