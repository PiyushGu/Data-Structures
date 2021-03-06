package Tree;

import java.util.LinkedList;

public class BFS {

	public void PrintBFSBruteForce(TreeNode node) {
		int height = GetHeight(node);

		for (int i = 0; i < height; i++)
			PrintBFSUsingRecursion(node, i);
	}

	public int GetHeight(TreeNode node) {
		if (node == null)
			return 0;

		int lh = GetHeight(node.left);
		int rh = GetHeight(node.right);

		if (lh < rh)
			return rh + 1;
		else
			return lh + 1;
	}

	void PrintBFSUsingRecursion(TreeNode node, int level) {
		if (node == null)
			return;

		if (level == 0)
			System.out.println(node.key);
		else if (level > 0) {
			PrintBFSUsingRecursion(node.left, level - 1);
			PrintBFSUsingRecursion(node.right, level - 1);
		}
	}

	public void PrintBFSUsingQueueLib(TreeNode root) {
		java.util.Queue<TreeNode> queue = new LinkedList<TreeNode>();

		queue.add(root);

		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();

			System.out.println(node.key);

			if (node.left != null)
				queue.add(node.left);

			if (node.right != null)
				queue.add(node.right);
		}

	}

	public void PrintBFS(TreeNode root) {
		Queue queue = new Queue();

		queue.Enqueue(root);

		while (!queue.Empty()) {
			TreeNode node = queue.Dequeue();

			System.out.println(node.key);

			if (node.left != null)
				queue.Enqueue(node.left);

			if (node.right != null)
				queue.Enqueue(node.right);
		}

	}

	class Queue {
		LinkedListNode front, rear;

		public void Enqueue(TreeNode node) {
			LinkedListNode item = new LinkedListNode(node);
			if (front == null) {
				front = rear = item;
				return;
			}

			rear.next = item;
			rear = item;

		}

		public TreeNode Dequeue() {
			if (front == null)
				return null;

			TreeNode item = front.value;
			front = front.next;

			return item;

		}

		public boolean Empty() {
			return front == null;
		}
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);

		BFS tree = new BFS();
		System.out.println("BFS");
		tree.PrintBFS(root);
		System.out.println("BFS");
		tree.PrintBFSUsingQueueLib(root);

		System.out.println("BFS");
		tree.PrintBFSBruteForce(root);

	}
}