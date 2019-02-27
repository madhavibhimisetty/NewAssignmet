package Assignment3;

public class BinarySearchTree {
	class Node { 
	        int key; 
	        Node left, right; 
	        public Node(int item) { 
	            key = item; 
	            left = right = null; 
	        } 
	    } 
		static Node root; 
		BinarySearchTree() {  
	        root = null;  
	    } 

		public static boolean search(Node root, int value) {

        while (root != null) {
            if ((int) root.key == value)
                return true;

            if (value < (int) root.key)
                root = root.left;

            else
                root = root.right;
        }

        return false;
    }
		void insert(int key) { 
		       root = insertRec(root, key); 
		    } 
	  
		Node insertRec(Node root, int key) { 
			  
	        if (root == null) { 
	            root = new Node(key); 
	            return root; 
	        } 
	        if (key < root.key) 
	            root.left = insertRec(root.left, key); 
	        else if (key > root.key) 
	            root.right = insertRec(root.right, key); 
	  
	       
	        return root; 
	        } 
		void inorder()  { 
		       inorderRec(root); 
		    } 
		  void inorderRec(Node root) { 
		        if (root != null) { 
		            inorderRec(root.left); 
		            System.out.println(root.key+" "); 
		            inorderRec(root.right); 
		        } 
		    } 
		void Preorder()   {
			Preorderrec(root);  
			}
		    void Preorderrec(Node node) 
		    { 
		        if (node == null) 
		            return; 
		        System.out.print(node.key+" "+"\n"); 
		        Preorderrec(node.left); 
		        Preorderrec(node.right); 
		    } 
		 void Postorder()  {  
			 Postorderrec(root); 
			 }
		 void Postorderrec(Node node) 
		    { 
		        if (node == null) 
		            return; 
		        Postorderrec(node.left); 
		        Postorderrec(node.right); 
		        System.out.print(node.key + " "+"\n"); 
		    } 
		 int getLeafNodeCount()  
		    { 
		        return getLeafNodeCount(root); 
		    } 
		   
		    int getLeafNodeCount(Node node)  
		    { 
		        if (node == null) 
		            return 0; 
		        if (node.left == null && node.right == null) 
		            return 1; 
		        else
		            return getLeafNodeCount(node.left) + getLeafNodeCount(node.right); 
		    } 
		  int maxHeight(Node node)  
		    { 
		        if (node == null) 
		            return 0; 
		        else 
		        {
		            int lDepth = maxHeight(node.left); 
		            int rDepth = maxHeight(node.right); 
		            if (lDepth > rDepth) 
		                return (lDepth + 1); 
		             else 
		                return (rDepth + 1); 
		        } 
		    } 
		 public static void main(String[] args) { 
		        BinarySearchTree tree = new BinarySearchTree(); 
		        tree.insert(50); 
		        tree.insert(30); 
		        tree.insert(20); 
		        tree.insert(40); 
		        tree.insert(70); 
		        tree.insert(60); 
		        tree.insert(80);
		        System.out.println("\nInorder traversal::");
		        tree.inorder();
		        System.out.println("Preorder traversal:: ");
		        tree.Preorder();
		        System.out.println("Postorder traversal:: ");
		        tree.Postorder();
		        System.out.println("Leaf node count::"+tree.getLeafNodeCount());
		        System.out.println("Search element is present in Binary Tree or not::"+tree.search(root,10));
		        System.out.println("Height of tree is : "+tree.maxHeight(tree.root)); 
		    } 
		} 
	    
	      
	    
	    
	  
	        
	  
	   
	    
	  
	     
	    


