package Tree;

import java.util.Stack;

public class TreeInSpiralForm {

	Stack<TreeNode> s1 = new Stack<TreeNode>();
	Stack<TreeNode> s2 = new Stack<TreeNode>();
	
	public void PrintTreeInSpiralForm(TreeNode root)
	{
		if(root == null)
			return;
		s1.push(root);
		
		while(!s1.isEmpty() || !s2.isEmpty())
		{
			while(!s1.isEmpty())
			{
				TreeNode node = s1.pop();
				
				System.out.println(node.key);
				
				if(node.right != null)
					s2.push(node.right);
				if(node.left != null)
					s2.push(node.left);
				
			}
			while(!s2.isEmpty())
			{
				TreeNode node = s2.pop();
				
				System.out.println(node.key);
				
				if(node.left != null)
					s1.push(node.left);
				if(node.right != null)
					s1.push(node.right);
					
			}
			
			
		}
	}
	
	public static void main(String[] args)
	{
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		
		TreeInSpiralForm tree = new TreeInSpiralForm();
		System.out.println("Sprial Form");
		tree.PrintTreeInSpiralForm(root);
	
	
	}
}
