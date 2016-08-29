package Array;

public class PairSum {

	public boolean IsSumExists(int[] array,int sum)
	{
		int n = array.length;
		boolean[] map = new boolean[10000000];
		
		for(int i = 0 ; i< n ; i++)
		{
			int temp = sum - array[i];
			
			if(temp > 0 && map[temp])
			{	
				System.out.println("Pair with sum = "+ sum + " is " + array[i] + " and  " + temp );
				return true;
			}
			
			map[array[i]] = true;
		}
		return false;
	}
	
	public static void main(String[] args)
	{
		int[] array = {1,4,45,6,10,8};
		new PairSum().IsSumExists(array,16);
	}
}
