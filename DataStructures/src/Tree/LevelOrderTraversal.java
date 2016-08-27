package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

	public void PrintLevelOrderLineByLine(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();

		if (root == null)
			return;

		queue.add(root);

		while (!queue.isEmpty()) {
			int size = queue.size();

			while (size-- > 0) {
				TreeNode node = queue.poll();

				System.out.print(node.key + " ");

				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);

		LevelOrderTraversal tree = new LevelOrderTraversal();
		System.out.println("BFS");
		tree.PrintLevelOrderLineByLine(root);

	}

}
