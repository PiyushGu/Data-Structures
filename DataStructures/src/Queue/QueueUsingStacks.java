package Queue;

public class QueueUsingStacks {

	LinkedListNode stack1,stack2;
	
	public void Enqueue(int k){
		
		if(stack1 == null){
			stack1 = new LinkedListNode(k);
			return;
		}
		
		stack1 = pushInStack(stack1,k);
	}
	
	public int Dequeue(){
		
		if(stack1 == null && stack2 == null){
			System.out.println("Queue Empty");
			return -1;
		}
		
		if(stack2 == null){
			while(stack1 != null )
			{
				int value = stack1.value;
				stack1 = stack1.next;
				stack2 = pushInStack(stack2,value);
			}
		}
		
		int item = stack2.value;
		
		stack2 = stack2.next;
		
		return item;
	}
	
	LinkedListNode pushInStack(LinkedListNode stack, int value){
		
		if(stack == null)
		{
			stack = new LinkedListNode(value);
			return stack;
		}
		
		LinkedListNode temp = new LinkedListNode(value);
		temp.next = stack;
		stack = temp;
		
		return stack;
	}

	public static void main(String[] args){
		
		QueueUsingStacks queue = new QueueUsingStacks();
		
		queue.Enqueue(1);
		queue.Enqueue(2);
		queue.Enqueue(3);
		queue.Enqueue(4);
		System.out.println("Item = " + queue.Dequeue());
		System.out.println("Item = " + queue.Dequeue());
		System.out.println("Item = " + queue.Dequeue());
		System.out.println("Item = " + queue.Dequeue());
		System.out.println("Item = " + queue.Dequeue());
		
		
		
	}

}
