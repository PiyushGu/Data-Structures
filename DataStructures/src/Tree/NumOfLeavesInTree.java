package Tree;

public class NumOfLeavesInTree {

	public int GetNumOfLeaves(TreeNode node)
	{
		if(node == null)
			return 0;
		if(node.left == null && node.right == null)
			return 1;
		return GetNumOfLeaves(node.left) + GetNumOfLeaves(node.right);
		
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);

		NumOfLeavesInTree tree = new NumOfLeavesInTree();
		System.out.println("Num of Leaves = "+ tree.GetNumOfLeaves(root));
		

	}
}
