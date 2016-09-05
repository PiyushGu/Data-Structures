package Miscellaneous;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class RemoveInvalidParantheses {
	public List<String> removeInvalidParentheses(String s) {

		if (s == null)
			return null;
		Queue<String> queue = new LinkedList<String>();
		Set<String> visited = new HashSet<>();
		List<String> result = new ArrayList<>();

		queue.add(s);
		visited.add(s);

		boolean found = false;

		while (!queue.isEmpty()) {
			String t = queue.poll();

			if (isValid(t)) {
				result.add(t);
				found = true;
			}

			if (found)
				continue;

			for (int i = 0; i < t.length(); i++) {
				if (t.charAt(i) != '(' && t.charAt(i) != ')')
					continue;

				String newStr = t.substring(0, i) + t.substring(i + 1);

				if (!visited.contains(newStr)) {
					queue.add(newStr);
					visited.add(newStr);
				}

			}

		}
		return result;

	}

	boolean isValid(String s) {
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c == '(')
				count++;

			if (c == ')' && count-- == 0) {
				return false;
			}
		}

		return count == 0;
	}
}
