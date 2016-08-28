package Tree;

public class IndenticalTrees {

	public boolean CheckIfTreeIdentical(TreeNode t1, TreeNode t2)
	{
		if(t1 == null && t2 == null)
			return true;
		
		return (t1.key == t2.key && CheckIfTreeIdentical(t1.left,t2.left) && 
				CheckIfTreeIdentical(t1.right,t2.right));
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		
		TreeNode root2 = new TreeNode(1);
		root2.left = new TreeNode(2);
		root2.right = new TreeNode(3);
		root2.left.left = new TreeNode(4);
		root2.left.right = new TreeNode(5);

		IndenticalTrees tree = new IndenticalTrees();
		System.out.println(tree.CheckIfTreeIdentical(root,root2));
		

	}
	
}
