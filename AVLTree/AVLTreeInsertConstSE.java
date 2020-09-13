package AVLTree;

// Java program for insertion in AVL Tree 
public class AVLTreeInsertConstSE { 

	Node root; 

	// A utility function to get the height of the tree 
	public int height(Node N) { 
		if (N == null) 
			return 0; 

		return N.height; 
	} 

	// A utility function to get maximum of two integers 
	public int max(int a, int b) { 
		return (a > b) ? a : b; 
	} 

	// A utility function to right rotate subtree rooted with y 
	// See the diagram given above. 
	public void rightRotate(Node yp) {
	  // copy node
	  Node y = new Node(yp.key);
	  y.left = yp.left;
	  y.right = yp.right;
	  
		Node x = y.left; 
		Node T2 = x.right; 

		// Perform rotation 
		x.right = y; 
		y.left = T2; 

		// Update heights 
		y.height = max(height(y.left), height(y.right)) + 1; 
		x.height = max(height(x.left), height(x.right)) + 1; 
		
		// update pointer
		yp.key = x.key;
		yp.height = x.height;
		yp.left = x.left;
		yp.right = x.right;
	} 

	// A utility function to left rotate subtree rooted with x 
	// See the diagram given above. 
	public void leftRotate(Node xp) { 
	  // copy node
	  Node x = new Node(xp.key);
	  x.left = xp.left;
	  x.right = xp.right;
	  
		Node y = x.right; 
		Node T2 = y.left; 

		// Perform rotation 
		y.left = x; 
		x.right = T2; 

		// Update heights 
		x.height = max(height(x.left), height(x.right)) + 1; 
		y.height = max(height(y.left), height(y.right)) + 1; 
		
		// update pointer
		xp.key = y.key;
		xp.height = y.height;
		xp.left = y.left;
		xp.right = y.right;
	} 

	// Get Balance factor of node N 
	public int getBalance(Node N) { 
		if (N == null) 
			return 0; 

		return height(N.left) - height(N.right); 
	} 

	public void insert(Node node, int key) { 

		/* 1. Perform the normal BST insertion */
		if (key < node.key) {
		  if (node.left == null) {
		    node.left = new Node(key);
		  }
		  insert(node.left, key);
		} else if (key > node.key) {
			if (node.right == null) {
		    node.right = new Node(key);
		  }
		  insert(node.right, key);
		}
		
    
		/* 2. Update height of this ancestor node */
		node.height = 1 + max(height(node.left), 
							height(node.right)); 
							

		/* 3. Get the balance factor of this ancestor 
			node to check whether this node became 
			unbalanced */
		int balance = getBalance(node); 
		

		// If this node becomes unbalanced, then there 
		// are 4 cases Left Left Case 
		if (balance > 1 && key < node.left.key) {
			rightRotate(node); 
			return;
		}

		// Right Right Case 
		if (balance < -1 && key > node.right.key) {
			leftRotate(node); 
			return;
		}
		

		// Left Right Case 
		if (balance > 1 && key > node.left.key) {
			leftRotate(node.left); 
			rightRotate(node); 
			return;
		} 

		// Right Left Case 
		if (balance < -1 && key < node.right.key) { 
			rightRotate(node.right); 
			leftRotate(node); 
			return;
		} 
	} 

	public static void main(String[] args) { 
		AVLTreeInsertConstSE tree = new AVLTreeInsertConstSE(); 
		int n = 10; 
		tree.root = new Node(n);
		n--;
		while (n > 0) {
		  tree.insert(tree.root, n);
		  n--;
		}
	} 
} 

