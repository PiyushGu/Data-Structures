package Tree;

public class TreeTraversalDFS {

	
	public void printPreOrder(TreeNode node)
	{
		if(node == null)
			return;
		
		System.out.println(node.key);
		printPreOrder(node.left);
		printPreOrder(node.right);
	}
	
	public void printInOrder(TreeNode node)
	{
		if(node == null)
			return;
		
		printInOrder(node.left);
		System.out.println(node.key);
		printInOrder(node.right);
	}
	
	public void printPostOrder(TreeNode node)
	{
		if(node == null)
			return;
		
		printPostOrder(node.left);
		printPostOrder(node.right);
		System.out.println(node.key);
	}
	
	public static void main(String[] args)
	{
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		
		TreeTraversalDFS tree = new TreeTraversalDFS();
		System.out.println("Pre Order");
		tree.printPreOrder(root);
		
		System.out.println("In Order");
		tree.printInOrder(root);
		
		System.out.println("Post Order");
		tree.printPostOrder(root);
	
	}
}
