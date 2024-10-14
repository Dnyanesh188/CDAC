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
	void removeDuplicates(){
		Node trev = head;
		while(trev!=null){
			if(trev.next != null  ){
				while(trev.next != null && trev.data == trev.next.data)
				trev.next = trev.next.next;
			}
			trev = trev.next;
		}
	}
	void display(){
		Node trev = head;
		while(trev !=null){
			System.out.print(trev.data + " ");
			trev = trev.next;
		}
	}
}

class RemoveDuplicates{
	public static void main(String [] args){
		LinkedList l = new LinkedList();
	l.insert(1);
	l.insert(1);
	l.insert(2);
	l.insert(3);
	l.insert(3);
	l.insert(4);
	l.display();
	System.out.println();
	l.removeDuplicates();
	l.display();
	}
	
}

