package Queue;

import java.util.ArrayList;
import java.util.List;

public class MaximumOfAllSubArray
{
    class Deque
    {
        LinkedListNode front, back;
        
        public void pushBack(int k)
        {
            LinkedListNode temp = new LinkedListNode(k);
            
            if(front == null)
            {
                front = back = temp;
                
                return;
            }
            temp.prev = back;
            back.next = temp;
            back = temp;
        }
        
        //act as queue
        public int popFront()
        {
            if(front == null)
                return Integer.MIN_VALUE;
            
            int value = front.value;
            front = front.next;
            front.prev = null;
            
            if(front == null)
                back= front;
                
            return value;
            
        }
        
        //act as stack
        public int popBack()
        {
            if(back== null)
                return Integer.MIN_VALUE;
            
            int value = back.value;
            
            back= back.prev;
            
            if(back== null)
                front = null;
            else
                back.next = null;
            
            return value;
        }
        
        public int front()
        {
            if(front == null)
                return Integer.MIN_VALUE;
            
            return front.value;
        }
        
        public int back()
        {
            if(back== null)
                return Integer.MIN_VALUE;
            
            return back.value;
        }
        
        public boolean empty()
        {
            return front == null;
        }
        
    }
    
    public List<Integer> FindMaximumOfAllSubArray(int[] nums,int n,int k)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        Deque queue = new Deque();
        int i = 0;
        for(i = 0; i < k; i++)
        {
        
            while(!queue.empty() && nums[i] > nums[queue.back()])
            {
                queue.popBack();
            } 
            
            queue.pushBack(i);
        }
        
        for(;i<n;i++)
        {
            if(!queue.empty())
                result.add(nums[queue.front()]);
                
            while(!queue.empty() && queue.front() <= i-k)
            {
                queue.popFront();
            }
            
            while(!queue.empty() && nums[queue.back()] <= nums[i])
            {
                queue.popBack();
            }
            
            queue.pushBack(i);
        }
        
        result.add(nums[queue.front()]);
        
        return result;
           
    }
    
    public static void main(String[] args)
    {
    	int[] nums = {12,1,78,90,57,89,56};
        
        List<Integer> result = (new MaximumOfAllSubArray()).FindMaximumOfAllSubArray(nums,7,3);
        
        for(int num : result)
            System.out.println(num);
      
    }
}