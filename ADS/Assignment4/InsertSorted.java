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
		if(head == null){
			head = newNode;
			return;
		}
		if(head.next == null){
			head.next = newNode;
			return;
		}
		Node trev = head;
		while(trev.next !=null){
			trev = trev.next;
		}
		trev.next = newNode;
	}
	int getLength(Node head){
		Node trev = head;
		int len = 0;
		while(trev != null){
			len++;
			trev = trev.next;
		}
		return len;
	}
	void makeCircular(){
		Node trev = head;
		while(trev.next != null){
			trev = trev.next;
		}
		trev.next = head;
	}
	void insetAtCircular(int value){
		Node newNode = new Node(value);
		if(head.data > value){
			Node trev = head.next;
			while(trev.next !=null){
				trev = trev.next;
			}
			newNode.next = head;
			trev.next = newNode;
			return;
		}
		if(head.next.data > value){
			newNode.next = head.next;
			head.next = newNode;
			return;
		}
		Node trev = head.next;
		Node prev = head;
		while(trev.next != head){
			if(trev.data > value){
				break;
			}
			prev  = trev;
			trev = trev.next;
		}
		if(trev.next == head) return;
		
		newNode.next = trev;
		prev.next = newNode;
		
	}
}

class InsertSorted{
	public static void main(String[] args){
		LinkedList l = new LinkedList();
		l.insert(1);
		l.insert(2);
		l.insert(3);
		l.insert(4);
		l.insert(5);
		l.makeCircular();
		
		l.insetAtCircular(6);
		
	}
}