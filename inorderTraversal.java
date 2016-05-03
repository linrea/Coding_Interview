package codinginterview;

import java.util.Stack;



public class inorderTraversal
{
	public static void inorderTraversal(TreeNode root) {

        if(root == null)
	            return;
	
	        Stack<TreeNode> st=new Stack<TreeNode>();
	
	        while(!st.empty()||root!=null ){

	            if(root!=null){
	                st.push(root);
	                root = root.left;
	            }else{
	                root = st.pop();	                
	                System.out.println(root.val);
	                root = root.right;
	            }
	      }
	}
	public static void main(String[] args)
	{
		TreeNode root = new TreeNode(2);
		TreeNode newNodeB = new TreeNode(5);
		TreeNode newNodeC = new TreeNode(10);
		TreeNode newNodeD = new TreeNode(6);
		TreeNode newNodeE = new TreeNode(20);
		TreeNode newNodeF = new TreeNode(20);
		TreeNode newNodeG = new TreeNode(13);
		TreeNode newNodeH = new TreeNode(4);
		TreeNode newNodeI = new TreeNode(1);
		root.left = newNodeB;
		root.right = newNodeC;
		root.right.left = newNodeD;
		root.right.right= newNodeE;
		root.left.right = newNodeF;
		root.left.left = newNodeG;
		root.right.right.left = newNodeH;
		root.right.right.right = newNodeI;
		inorderTraversal(root);
		

	}
}
