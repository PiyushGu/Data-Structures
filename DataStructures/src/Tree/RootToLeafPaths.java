package Tree;

public class RootToLeafPaths {

	public void PrintRootToLeafPaths(TreeNode node,int[] paths,int pathLength)
	{
		if(node == null)
			return;
		paths[pathLength++] = node.key;
		
		if(node.left == null && node.right == null)
		{

			PrintPath(paths,pathLength);
		}
		
		if(node.left != null)
			PrintRootToLeafPaths(node.left,paths,pathLength);
		
		if(node.right != null)
			PrintRootToLeafPaths(node.right,paths,pathLength);
	}
	
	public void PrintPath(int[] array,int length)
	{
		for(int i = 0 ; i < length; i++)
		{
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);

		RootToLeafPaths tree = new RootToLeafPaths();
		System.out.println("Paths ");
		tree.PrintRootToLeafPaths(root,new int[1000],0);
		
		
	}
}
