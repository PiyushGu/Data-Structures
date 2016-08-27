package Tree;

public class MorrisTravel {

	public void PrintMorrisTravel(TreeNode root)
	{
		if(root == null)
		{
			return;
		}
		
		TreeNode current = root;
		while(current != null)
		{
			if(current.left == null)
			{
				System.out.println(current.key);
				current = current.right;
			}
			else
			{
				TreeNode prev = current.left;
				
				while(prev.right != null && prev.right!= current)
				{
					prev = prev.right;
				}
				
				if(prev.right == null)
				{
					prev.right = current;
					current = current.left;
				}
				else
				{
					prev.right = null;
					System.out.println(current.key);
					current = current.right;
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

		MorrisTravel tree = new MorrisTravel();
		System.out.println("Inorder");
		tree.PrintMorrisTravel(root);

	}
}
