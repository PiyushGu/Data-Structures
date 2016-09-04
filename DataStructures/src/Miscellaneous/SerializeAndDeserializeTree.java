package Miscellaneous;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

import Tree.TreeNode;

/* Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SerializeAndDeserializeTree {

	final String Splitter = ",";
	final String NN = "X";

	// Encodes a tree to a single string.
	public String serialize(TreeNode root) {

		StringBuilder buffer = new StringBuilder();
		SerializeOutput(root, buffer);
		return buffer.toString();

	}

	public void SerializeOutput(TreeNode root, StringBuilder builder) {
		if (root == null) {
			builder.append(NN).append(Splitter);
		} else {
			builder.append(root.key).append(Splitter);
			SerializeOutput(root.left, builder);
			SerializeOutput(root.right, builder);
		}
	}

	// Decodes your encoded data to tree.
	public TreeNode deserialize(String data) {
		Deque<String> queue = new LinkedList<String>();
		queue.addAll(Arrays.asList(data.split(Splitter)));
		TreeNode root = GetNode(queue);
		return root;
	}

	public TreeNode GetNode(Deque<String> queue) {
		String val = queue.remove();
		if (val.equals("X"))
			return null;
		else {
			TreeNode node = new TreeNode(Integer.valueOf(val));
			node.left = GetNode(queue);
			node.right = GetNode(queue);
			return node;
		}
	}
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));

