package Tree_exp;

public class BinaryTree {
	static Node root;

	static void addValue(int data) {
		if (root == null)
			root = new Node(data);
		else {
			Node temp=root;
			while (true) {
				//System.out.println("temp" + temp.value);
				if (temp.value > data) {
					if (temp.left != null) {
						temp = temp.left;
					} else {
						temp.left = new Node(data);
						break;
					}
				} else {
					if (temp.right != null) {
						temp = temp.right;
					} else {
						temp.right = new Node(data);
						break;
					}
				}
					

			}
		}
	}
	static void printLevel()
	{
		  int h = height(root); 
	        int i; 
	        for (i=1; i<=h; i++) 
	            printNode(root, i); 
	}
	static int height(Node root)
	{
		if(root==null)
			return 0;
		else
		{
			int lefth=height(root.left);
			int righth= height(root.right);
			if(lefth>righth)
				return(lefth+1);
			else return(righth+1);
		}
		
	}
	
	static void printNode(Node root, int level) {
		if(root==null)
			return;
	    if(level==1)
				System.out.println(root.value +"");
		else if (level>1){
			printNode(root.left,level-1);
			printNode(root.right,level-1);
		}
		}
	 static void printInorder(Node node) 
	    { 
	        if (node == null) 
	            return; 
	        printInorder(node.left); 
	        System.out.print(node.value + " "); 
	        printInorder(node.right); 
	      
	    } 
	 
	public static void main(String[] args) {
		/*
		 * BinaryTree obj = new BinaryTree(); obj.root = new Node(1);
		 * System.out.println(obj.root); obj.root.left = new Node(2);
		 * System.out.println(obj.root.left); obj.root.right = new Node(3);
		 * System.out.println(obj.root.right);
		 */
		addValue(25);
		addValue(50);
		addValue(10);
		addValue(8);
		addValue(20);
		addValue(17);
		addValue(6);
		//System.out.println(root.value);
		printLevel();
		System.out.println("---");
		printInorder(root);
	}

}
