package Queue;

public class Queue_Arrays {
    int front, rear, size,capacity;
    int[] data;

 public Queue_Arrays (int capacity){
    data = new int[capacity];
    this.capacity = capacity;
    size = 0;
    front = 0;
    rear = capacity - 1;
}

public boolean IsEmpty(){
    return size == 0;
}

public boolean IsFull(){
    return size == capacity;
} 
public void Enqueue(int value){
    if(IsFull())
        return;
    
    rear = (rear+1)%capacity;
    size = size +1;
    data[rear] = value;
    System.out.println("Inserted Item = " + value);
}    

public int Dequeue()
{
    if(IsEmpty())
        return Integer.MIN_VALUE;
     
    int value = data[front];
    data[front] = -1;
    front = (front + 1)%capacity;
    size = size - 1;
    
    System.out.println("Deleted Item = " + value);
    
    return value;
    
}

public int Front(){
    if(IsEmpty())
        return Integer.MIN_VALUE;
        
     return data[front];
}

public int Rear(){
     if(IsEmpty())
        return Integer.MIN_VALUE;
        
     return data[rear];
}

public static void main(String[] args){
	
	Queue_Arrays queue = new Queue_Arrays(5);
	
	queue.Enqueue(1);
	
	System.out.println("Value " + queue.Dequeue());
	
	queue.Enqueue(5);
	
}
}


