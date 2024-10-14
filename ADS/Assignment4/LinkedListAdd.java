

class LinkedListAdd{
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
	
	public static void add(Node head1, Node head2,int rem,Node node){
		if(head1 == null && head2 == null && rem == 0){
			return;
		}
		if(head1 == null && head2 == null && rem != 0){
			int sum = rem;
			Node newNode = new Node(sum%10);
			node.next = newNode;
			node = newNode;
			return;
		}
		if(head1 == null && head2 != null){
			int sum = rem + head2.data;
			Node newNode = new Node(sum%10);
			node.next = newNode;
			node = newNode;
			add(head1,head2.next,sum/10,node);
		}
		if(head1 != null && head2 == null){
			int sum = rem + head1.data;
			Node newNode = new Node(sum%10);
			node.next = newNode;
			node = newNode;
			add(head1.next,head2,sum/10,node);
		}
		else{
			int sum = head1.data + head2.data + rem;
			Node newNode = new Node(sum%10);
			node.next = newNode;
			node = newNode;
			add(head1.next,head2.next,sum/10,node);
		}
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
	public static void main(String [] args){
		LinkedListAdd l1 = new LinkedListAdd();
		l1.insert(2);
		l1.insert(4);
		l1.insert(3);
		
		LinkedListAdd l2 = new LinkedListAdd();
		l2.insert(5);
		l2.insert(6);
		l2.insert(4);
		
		int rem =0;
		Node newNode = new Node(-1);
		Node trev = newNode;
		add(l1.head,l2.head,0,trev);
		
		l1.forwardTraverseR(newNode.next);
		
	}
}