class LinkedList{
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	void insert(int value){
		Node newNode = new Node(value);
		if(this.head == null){
			this.head = newNode;
			return;
		}
		if(this.head.next == null){
			this.head.next = newNode;
			return;
		}
		Node trev = head;
		while(trev.next !=null){
			trev = trev.next;
		}
		trev.next = newNode;
	}
	
	
	
	Node findMiddle(){
		if(head == null) return head;
		if(head.next == null) return head;
		
		Node slow = head;
		Node fast =head;
		
		while(fast != null){
			fast = fast.next;
			if(fast != null){
				fast = fast.next;
				slow = slow.next;
			}
		}
		return slow;
	}
	
}
class FindMiddle{
	public static void main(String [] args){
		LinkedList l = new LinkedList();
		l.insert(1);
		l.insert(2);
		l.insert(3);
		l.insert(4);
		l.insert(5);
		
		LinkedList.Node node = l.findMiddle();
		
		System.out.print(node.data);
		
	}
}