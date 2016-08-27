package Tree;

import java.util.Stack;

public class InorderWithoutRecursion {

	public void PrintInorder(TreeNode root) {
		Stack<TreeNode> stack = new Stack<TreeNode>();

		if (root == null)
			return;

		TreeNode current = root;

		while (current != null) {
			stack.push(current);
			current = current.left;
			
		}
		
		while (!stack.isEmpty()) {
			
			TreeNode item = stack.pop();
			System.out.println(item.key);

			if(item.right != null)
			{
				current = item.right;
				
				while(current != null)
				{
					stack.push(current);
					current = current.left;
					
				}
			}

		}
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);

		InorderWithoutRecursion tree = new InorderWithoutRecursion();
		System.out.println("BFS");

		tree.PrintInorder(root);
	}
}
