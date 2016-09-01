package LinkedList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class Problem1 {
	 public static void main(String[] args)
	  // The name of the file to open.
	 { 
		 
		 String input1 = 
				 "T-A D-B K-C F-D X-E V-F E-G A-H J-I Q-J P-K N-L L-M I-N Z-O O-P G-Q S-R W-S B-T C-U M-V H-W Y-X U-Y R-Z";
		 String input2 = "Axno lx Zdjhti Ptizdj. Uzc'sx lu zinu azox.";
		 
		 

		 String[] splited = input1.split(" ");
		 HashMap<Character, Character> hmap = new HashMap<Character, Character>();
		 
		 for(int i = 0; i < splited.length; i++)
		 {
			 
			 String[] split = splited[i].split("-");
			 Character first = split[0].charAt(0);
			 Character second = split[1].charAt(0);
			 
			 if(!hmap.containsKey(first))
			 {
				 hmap.put(Character.toUpperCase(first), Character.toUpperCase(second));
				 hmap.put(Character.toLowerCase(first), Character.toLowerCase(second));
			 }
     }
		 
		 StringBuffer buffer = new StringBuffer();
		 
		 for(int i = 0 ; i < input2.length() ; i++)
		 {
			 if(hmap.containsKey(input2.charAt(i)))
				 buffer.append(hmap.get(input2.charAt(i)));
			 
			 else
				 buffer.append(input2.charAt(i));
					 
		 }
		 
		 System.out.println(buffer.toString());
 }
}
