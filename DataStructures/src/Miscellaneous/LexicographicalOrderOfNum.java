package Miscellaneous;

import java.util.ArrayList;
import java.util.List;

public class LexicographicalOrderOfNum {
	public List<Integer> lexicalOrder(int n) {

		List<Integer> result = new ArrayList<Integer>();
		int current = 1;
		for (int i = 0; i < n; i++) {
			result.add(current);
			if (current * 10 <= n) {
				current *= 10;
			} else if ((current % 10 != 9 && (current + 1) <= n))
				current = current + 1;
			else {
				while ((current / 10) % 10 == 9)
					current /= 10;
				current = current / 10 + 1;
			}
		}

		return result;
	}
}
