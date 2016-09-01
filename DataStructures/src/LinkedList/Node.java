package LinkedList;

import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Fashion {
	String name;
	ArrayList<String> Likes;
	ArrayList<String> Dislikes;
	boolean isFind;
}

public class Node {

	public static void main(String[] args)
	// The name of the file to open.
	{
		try {

			File input = new File("input.txt.txt");
			Scanner sc = new Scanner(input);
			sc.useDelimiter(System.getProperty("line.separator"));
			ArrayList<Fashion> fashions = new ArrayList<Fashion>();
			int i = 0;
			Fashion fashion;
			while (sc.hasNext()) {
				i++;
				fashion = new Fashion();
				fashion.name = sc.next();
				String likes = sc.next();
				String dislinkes = sc.next();
				fashion.Likes = new ArrayList<String>();
				fashion.Dislikes = new ArrayList<String>();
				for (String lk : likes.split(" "))
					fashion.Likes.add(lk);

				for (String dlk : dislinkes.split(" "))
					fashion.Dislikes.add(dlk);

				fashions.add(fashion);
			}

			Map<String, String> map = new TreeMap<String, String>();
			for (int j = 0; j < fashions.size(); j++) {
				Fashion fashion1 = fashions.get(j);
				if (!map.containsKey(fashion1.name)) {
					String name1 = fashion1.name;

					ArrayList<String> dislikes = fashion1.Dislikes;
					for (int k = j + 1; k < fashions.size(); k++) {
						Fashion f1 = fashions.get(k);
						if (!f1.isFind) {
							ArrayList<String> likes = f1.Likes;
							boolean flag = true;
							for (int x = 0; x < dislikes.size(); x++) {
								if (likes.contains(dislikes.get(x))) {
									flag = false;
									break;
								}
							}
							if (flag) {
								map.put(name1, f1.name);
								f1.isFind = true;
								map.put(f1.name, name1);
								fashion1.isFind = true;
								break;
							}
						}
					}
				}
			}

			for (String name : map.keySet()) {

				String key = name.toString();
				String value = map.get(name).toString();
				System.out.println(key + " " + value);

			}

		}

		catch (Exception e) {
			System.out.print(e.getMessage());
		}

	}
}
