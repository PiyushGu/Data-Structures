package Queue;

public class Queue_LinkedList {

    Queue_Node front,rear;
    
    public void Enqueue(int value)
    {
        Queue_Node node = new Queue_Node(value);
        
        if(front == null)
        {
            front = rear = node;
            return;
        }
        
        rear.next = node;
        rear = node;
        
    }
    
    public int Dequeue()
    {
        if (front == null)
            return -1;
         
        Queue_Node temp;
        
        temp = front;
        
        front = front.next;
        
        if(front == null)
            rear = null;
           
        return temp.value;
    }
    
    public static void main(String[] args)
    {
        Queue_LinkedList queue = new Queue_LinkedList();
        
        queue.Enqueue(10);
        
        System.out.println("Value = " + queue.Dequeue());
        
        queue.Enqueue(30);
        
        queue.Enqueue(20);
        
        queue.Enqueue(40);
        
        System.out.println("Value = " + queue.Dequeue());
        
        
    }
    
}
