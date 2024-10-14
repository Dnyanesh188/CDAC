

class Reverse{
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
	Node reverse(Node head){
		if(head == null) return head;
		if(head.next == null) return head;
		Node curr = head;
		Node next = null;
		Node prev = null;
		
		while(curr!=null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
	void display(Node node){
		Node trev = node;
		while(trev !=null){
			System.out.print(trev.data + " ");
			trev = trev.next;
		}
	}
	public static void main(String [] args){
		Reverse l = new Reverse();
		l.insert(1);
		l.insert(2);
		l.insert(3);
		l.insert(4);
		l.insert(5);
		System.out.println("Without Reverse");
		l.display(l.head);
		Node node = l.reverse(l.head);
		System.out.println();
		l.display(node);
		
		
	}
	
}