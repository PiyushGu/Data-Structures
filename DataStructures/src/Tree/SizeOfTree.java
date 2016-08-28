package Tree;

public class SizeOfTree {
	
	public int GetSizeOfTree(TreeNode node){
		if(node == null)
			return 0;
		return GetSizeOfTree(node.left) + 1 + GetSizeOfTree(node.right);
	}
	
	public static void main(String[] args)
	{
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);

		SizeOfTree tree = new SizeOfTree();
		System.out.println("Size of tree = " + tree.GetSizeOfTree(root));
		
		
	}
}
