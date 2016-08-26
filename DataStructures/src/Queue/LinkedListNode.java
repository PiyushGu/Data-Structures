package Queue;

public class LinkedListNode {

	public int value;
	public LinkedListNode next;
	public LinkedListNode prev;
	
	public LinkedListNode(){
		
	}
	
	public LinkedListNode(int k){
		value = k;
		next = null;
		prev = null;
	}
}
