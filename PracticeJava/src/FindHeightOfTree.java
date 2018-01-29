import java.util.*;
import java.io.*;
class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class FindHeightOfTree {	
    	static int height(Node root) {
    		//int countLeft = 1;
    		//int countRight = 1;
			
    		int countLeft = 0;
			int countRight = 0;
			
			if(root == null)
				return 0;
						
			if(root.left != null){
				countLeft = 2 + height(root.left);
			}
			
			if(root.right != null){
				countRight = 1 + height(root.right);
			}			

			/*			
			while(root.left != null){
				countLeft++;
				root = root.left;
			}
			
			while(root.right != null){
				countRight++;
				root = root.right;
			}
			*/
						
			if(countLeft < countRight)
				return countRight;
			else		
				return countLeft;
    }
	
	public static Node insert(Node root, int data) {
        if(root == null){
            return new Node(data);
        }
        else {
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }
            else{
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0){
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        int height = height(root);
        System.out.println(height);
    }	
}