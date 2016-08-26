package Queue;

import java.util.ArrayList;

public class BinaryNumbers
{
	class LinkedListNode
	{
		public String value;
		public LinkedListNode next;
		
		LinkedListNode(String value)
		{
			this.value = value;
			next = null;
		}
	}
    public ArrayList<String> GenerateBinaryNumbers(int k)
    {
        ArrayList<String> result = new ArrayList<String>();
        if(k == 0)
            return null;
            
        Queue queue = new Queue();
        
        queue.Enqueue("1");
        while(k-- > 0)
        {
            
            String value = queue.Dequeue();
            result.add(value);
            
            String valueTemp = value;
            queue.Enqueue(value.concat("0"));
            queue.Enqueue(valueTemp.concat("1"));
            
        }
        
        return result;
    }
    
    class Queue
    {
        LinkedListNode front,rear;
        
        public void Enqueue(String k)
        {
            if(front == null)
            {
                front = new LinkedListNode(k);
                rear = front;
                return;
            }
            
            LinkedListNode temp = new LinkedListNode(k);
            rear.next = temp;
            rear = temp;
        }
        
        public String Dequeue()
        {
            if(front == null)
                return null;
                
            String value = front.value;
            front = front.next;
            return value;
        }
    }
    
    public static void main(String[] args)
    {
        BinaryNumbers numbers = new BinaryNumbers();
        
        ArrayList<String> result = numbers.GenerateBinaryNumbers(10);
        
        for(String value : result)
            System.out.println(value);
    }
    
    
}