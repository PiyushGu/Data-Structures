package Array;

public class LargestSumContiguousArray_KandaneAlgorithm {

	public int GetLargestSumContiguousArray(int[] array, int size)
	{
		int max_so_far = 0, max_ending_here = 0;
		
		for(int i = 0; i < size; i++)
		{
			max_ending_here += array[i];
			
			if(max_ending_here < 0)
				max_ending_here = 0;
			
			if(max_so_far < max_ending_here)
				max_so_far = max_ending_here;
		}
		
		return max_so_far;
	}
	
	public static void main(String[] args)
	{
		   int a[] =  {-2, -3, 4, -1, -2, 1, 5, -3};
		   int max_sum = (new LargestSumContiguousArray_KandaneAlgorithm()).
				   GetLargestSumContiguousArray(a, a.length);
		   
		   
		   System.out.println("Maximum Sum = " + max_sum);
		   
		   int arr[] =  {-2, -3, -4, -1, -2, -1, -5, -3};
		   
		   int max_sum1 = (new LargestSumContiguousArray_KandaneAlgorithm()).
				   GetMaximumSum_IncludingNegative(arr,arr.length);
		   
		   System.out.println("Maximum Sum = " + max_sum1);
		   
	}
	
	public int GetMaximumSum_IncludingNegative(int[] array, int size)
	{
		int max_so_far = array[0],current_max = array[0];
		
		for(int i = 0;i < size ; i ++)
		{
			current_max = Math.max(current_max + array[i], array[i]);
			max_so_far = Math.max(max_so_far, current_max);
		}
		
		return max_so_far;
	}
	
}
