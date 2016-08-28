package Tree;

public class HeightOfTree {

	public int FindHeightOfTree(TreeNode node)
	{
		if(node == null)
			return 0;
		
		int lh = FindHeightOfTree(node.left);
		int rh = FindHeightOfTree(node.right);
		
		return Math.max(lh, rh) + 1;
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		

		HeightOfTree tree = new HeightOfTree();
		System.out.println(tree.FindHeightOfTree(root));
		

	}
	
}
