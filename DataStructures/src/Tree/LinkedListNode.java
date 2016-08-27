package Tree;

public class LinkedListNode {
	
	public TreeNode value;
	public LinkedListNode next;
	
	public LinkedListNode()
	{
		
	}
	
	public LinkedListNode(TreeNode node)
	{
		value = node;
		next = null;
	}
}
