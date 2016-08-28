package Tree;

public class MirrorOfTree {

	public TreeNode GetMirrorOfTree (TreeNode node)
	{
		if(node == null)
			return node;
		
		TreeNode left = GetMirrorOfTree(node.left);
		TreeNode right = GetMirrorOfTree(node.right);
		
		node.left = right;
		node.right = left;
		return node;
	}
	
	public void Inorder(TreeNode root)
	{
		if(root == null)
			return;
		
		Inorder(root.left);
		System.out.println(root.key);
		Inorder(root.right);
	}
	public static void main(String[] args)
	{
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);

		MirrorOfTree tree = new MirrorOfTree();
		System.out.println("Original tree = ");
		tree.Inorder(root);
		root = tree.GetMirrorOfTree(root);
		System.out.println("Mirror tree = ");
		tree.Inorder(root);
		
	}
}
