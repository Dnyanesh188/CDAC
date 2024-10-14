

class DoublyLinkedList{
	Node head;
	static class Node{
		Node next ;
		Node prev;
		int data;
		Node(int data){
			this.data = data;
			next = prev = null;
		}
	}
	void insert(int value){
		Node newNode = new Node(value);
		if(head == null){
			head = newNode ;
			return;
		}
		if(head.next == null){
			head.next = newNode;
			newNode.prev = head;
			return;
		}
		Node trev = head;
		while(trev.next != null){
			trev = trev.next;
		}
		
		trev.next = newNode;
		newNode.prev = trev;
	}
	void delete(int value){
		if(head == null) return;
		if(head.next == null) {
			if(head.data == value)
			    head = null;
			return;
		}
		Node p = head;
		Node curr = head;
		while(curr != null){
			if(curr.data == value){
				break;
			}
			p = curr;
			curr = curr.next;
		}
		if(curr == null) return;
		if(curr.next == null){
			p.next = null;
			curr.prev = null;
		}
		p.next = curr.next;
		curr.next.prev = p;
		curr.next = null;
		curr.prev = null;
	}
	void forwardTraverse(){
		if(head == null) return;
		if(head.next == null){
			System.out.print(head.data + " ");
			return;
		}
		Node trev = head;
		while(trev !=null){
			System.out.print(trev.data + " ");
			trev = trev.next;
		}
	}
	void reverseTraverse(){
		if(head == null) return;
		if(head.next == null){
			System.out.print(head.data + " ");
			return;
		}
		Node trev = head;
		while(trev.next !=null){
			trev = trev.next;
		}
		while(trev != null){
			System.out.print(trev.data + " ");
			trev = trev.prev;
		}
	}
	Node reverse(){
		if(head == null) return head;
		if(head.next == null) return head;
		
		Node p = null;
		Node curr = head;
		Node next = null;
		
		while(curr!=null){
			next = curr.next;
			curr.next = p;
			p = curr;
			curr = next;
		}
		Node curr1 = p;
		Node next1 = null;
		Node prev1 = null;
		
		while(curr1!=null){
			next1 = curr1.prev;
			curr1.prev = prev1;
			prev1 = curr1;
			curr1 = next1;
		}
		return p;
	}
	void forwardTraverseR(Node n){
		if(n == null) return;
		if(n.next == null){
			System.out.print(n.data + " ");
			return;
		}
		Node trev = n;
		while(trev !=null){
			System.out.print(trev.data + " ");
			trev = trev.next;
		}
	}
	
}

class ReverseDoubly{
	public static void main(String args[]){
		DoublyLinkedList l = new DoublyLinkedList();
		l.insert(10);
		l.insert(20);
		l.insert(30);
		l.insert(40);
		l.insert(50);
		DoublyLinkedList.Node n = l.reverse();
		l.forwardTraverseR(n);
	}
}
	