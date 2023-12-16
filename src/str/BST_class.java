package str;
import java.util.*;

class BST_class { 
    class Node { 
        int key; 
        Node left, right; 
   
        public Node(int data){ 
            key = data; 
            left = right = null; 
        } 
    }

     Node root; 
  
    BST_class(){ 
        root = null; 
    } 
    
    void insert(int key)  { 
        root = insert_Recursive(root, key); 
    } 
    Node insert_Recursive(Node root, int key) { 
        if (root == null) { 
            root = new Node(key); 
            return root; 
        } 
        if (key < root.key) 
            root.left = insert_Recursive(root.left, key); 
        else if (key > root.key) 
            root.right = insert_Recursive(root.right, key); 
        return root; 
    } 
   
    void inorder(Node root) { 
    	 if (root == null) {
             return;
         }
    	 
        // Traverse the left subtree
    	 inorder(root.left);

        // Visit the current node
        System.out.print(root.key + " ");

        // Traverse the right subtree
        inorder(root.right);
    
        //add code here
    	
    } 
   

    void postorder(Node root) { 

    	if (root == null) {
            return;
        }
    	 
            // First recur on left subtree
    		postorder(root.left);
     
            // Then recur on right subtree
    		postorder(root.right);
     
            // Now deal with the node
            System.out.print(root.key + " ");
        

    } 
   

    
    public static void main(String[] args) { 
        BST_class bst = new BST_class(); 
        String msg = "";
        int num=0,  i = 0;
        Scanner input = new Scanner(System.in);

        for(i=0; i<10; i++) {
            msg = input.nextLine();
            num = Integer.parseInt(msg);
            bst.insert(num);
        }
        System.out.println("In order ...");
        bst.inorder(bst.root); 
        System.out.println("\nPost order ...");
        bst.postorder(bst.root); 
        input.close();
    }
}
