package com.test;

public class CircularLl {
	static class node
	{
		int data;
		node next;
		node(int data)
		{
			this.data= data;
		}
	}
	public int size=0;
	public node head = null;
	public node tail = null;
	 public void Add(int data)
	 {
		 node n = new node(data);
		 if(size==0)
		 {
			 head = n;
			 tail = n;
			 n.next = head;
		 }else
		 {
			 node temp = head;
			 n.next = temp;
			 head =n;
			 tail.next = head;
		 }
		 size++;
	 }
	 public void AddEnd(int data) {
		 if(size==0)
			 Add(data);
		 else {
			 node n = new node(data);
			 tail.next = n;
			 tail = n;
			 tail.next = head;
			 size++;
			  }
		 System.out.println("\nNode " + data + " is added at the end of the list");
	 }
	public void delete()
	{
		if(size==0)
			System.out.println("list is empty");
		else
			head = head.next;
		   tail.next=head;
		   size--;
	}
	public int AddIndex(int index)
	{
		if(index>size) {
			return -1;
		}
		else
		{
			node n = head;
			while(index-1!=0)
			{
				n= n.next;
				index--;
			}
			return n.data;
			
		}
	}
	  public void print()
	  {
		  System.out.print("Circular Linked List:");
	        Node temp = head;
		  if(size<=0)
				System.out.println("list is empty");
		  else
		  {
			  do
			  {
				  
			  }
			  
		  }
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Lalita Khanna");
		

		  
		  
	}

}
