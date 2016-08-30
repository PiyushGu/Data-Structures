package Array;

public class NumberOccuringOddTimes {

	public int GetNumberOccuringOddTime(int[] array, int size)
	{
		int num = array[0];
		for(int i=1; i < size; i++)
			num = array[i] ^ num;
		
		return num;
	}
	
	public static void main(String[] args)
	{
		NumberOccuringOddTimes occur = new NumberOccuringOddTimes();
        int ar[] = new int[]{2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
        int n = ar.length;
        System.out.println(occur.GetNumberOccuringOddTime(ar, n));
	}
}
