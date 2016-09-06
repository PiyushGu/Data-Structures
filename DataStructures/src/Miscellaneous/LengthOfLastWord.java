package Miscellaneous;

public class LengthOfLastWord {

	public int GetLengthOfLastWord(String s)
	{
		int len = 0;
		int i = 0 ;
		int j = s.length()-1;
		
		for(; s.charAt(j)== ' ' &&  j >=0 ; j--  );
		
		for(i= j ;s.charAt(i)!= ' ' &&  i >=0 ; i-- )
			len++;
		
		return len;
		
	}
}
