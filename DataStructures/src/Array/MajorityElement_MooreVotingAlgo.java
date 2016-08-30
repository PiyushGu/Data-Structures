package Array;

public class MajorityElement_MooreVotingAlgo {

	public void PrintMajorityElement(int[] array,int size)
	{
		int candidate = FindCandidate(array,size);
		
		if(IsElementMaximum(array,size,candidate))
			System.out.println("Majority candidate element = " + candidate);
		else
			System.out.println("No Majority candidate");
		
	}
	
	public int FindCandidate(int[] array,int size)
	{
		int majorityIndex = 0, count = 1;
		
		for(int i = 1; i < size; i++)
		{
			if(array[majorityIndex] == array[i])
				count++;
			else
				count--;
			if(count == 0)
			{
				majorityIndex = i;
				count = 1;
			}
			
		}
		
		return array[majorityIndex];
	}
	
	public boolean IsElementMaximum(int[] array,int size,int candidate)
	{
		int n = 0;
		
		for(int i = 0; i< size ; i++)
		{
			if(array[i] == candidate)
				n++;
		}
		
		if(n > size/2)
			return true;
		return false;
	}
	
	public static void main(String[] args)
	{
		MajorityElement_MooreVotingAlgo majority = new MajorityElement_MooreVotingAlgo();
		
		int[] array = {1,3,3,3,2};
		
		majority.PrintMajorityElement(array,5);
		
	}
	
	
}
