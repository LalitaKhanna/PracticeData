package com.test;

public class CircularLl {
	
	public int size = 0;
	public Node head = null;
	public Node tail = null;

	/*
	 * public void add(int data) { Node new_node = new Node(data); if (size == 0) {
	 * head = new_node; tail = new_node; new_node.next = tail; } else if (size == 0)
	 * { //Node temp = head; new_node.next = tail ; //head head = new_node ;
	 * tail.next = head; } else { while(tail.next) } size++; }
	 */
	public void addNodeToHead(int element){
		  Node n = new Node(element);
		  if(size==0){
		   head = n;
		    tail = n;
		   n.next = head;
		  }else{
		   Node temp = head;
		   n.next = temp;
		   head = n;
		   tail.next = head;
		  }
		  size++;
		}

	public void addEnd(int data) {
		if (size == 0)
			addNodeToHead(data);
		else {
			Node n = new Node(data);
			tail = n;
			tail.next = head;
			head.next = tail;
			size++;
		}
		System.out.println("\nNode " + data + " is added at the end of the list");
	}

	public void delete() {
		if (size == 0)
			System.out.println("list is empty");
		else
			head = head.next;
		tail.next = head;
		size--;
	}

	public int addIndex(int index) {
		if (index > size) {
			return -1;
		} else {
			Node n = head;
			while (index - 1 != 0) {
				n = n.next;
				index--;
			}
			return n.data;

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Lalita Khanna");
		CircularLl circularLl=new CircularLl();
		circularLl.addNodeToHead(5);
		circularLl.addNodeToHead(7);
		circularLl.addNodeToHead(8);
		circularLl.addNodeToHead(9);
		circularLl.print(circularLl.head);

	}
	
	public void print(Node head) {
		System.out.println(tail.next );
		System.out.println(head.data);
		System.out.println(head.next.data);
		System.out.println(head.next.next.data);
		System.out.println(head.next.next.next.data);
		System.out.println(head.next.next.next.next.data);
		//System.out.println(tail.next.next.data);
		/*
		 * while(tail!=null && tail.next != tail) {
		 * System.out.println("Data :"+head.data); head=tail.next; }
		 */
	}

}
