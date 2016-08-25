package Queue;

public class QueueUsingSingleStack {

    LinkedListNode stack;
    
    public void Enqueue(int k){
        
        if(stack == null){
            
            stack = new LinkedListNode(k);
            return;
        }
        
        LinkedListNode node = new LinkedListNode(k);
        node.next = stack;
        stack = node;
    }
    
    public int Dequeue(){
    
        if(stack == null){
        
            System.out.println("Underflow");
            return -1;
        }
        
        if(stack.next == null){
            
            int result = stack.value;
            stack = null;
            return result;
        }
        
        //Pop
        int item = stack.value;
        stack = stack.next;
        
        int result = Dequeue();
        
        if(stack == null){
            
            stack = new LinkedListNode(item);
        }
        else{
        
            LinkedListNode temp = new LinkedListNode(item);
            
            temp.next = stack;
            
            stack = temp;;
        }
        
        return result;
    }
    
    public static void main(String[] args){
    
        QueueUsingSingleStack  queue = new QueueUsingSingleStack();
        
        queue.Enqueue(1);
        queue.Enqueue(2);
        queue.Enqueue(3);
        queue.Enqueue(4);
        queue.Enqueue(5);
        
        System.out.println("Item = " + queue.Dequeue());
        System.out.println("Item = " + queue.Dequeue());
        System.out.println("Item = " + queue.Dequeue());
        System.out.println("Item = " + queue.Dequeue());
        System.out.println("Item = " + queue.Dequeue());
    }
}
