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
	static Node merge(Node head1 ,Node head2){
		if(head1 == null) return head2;
		if(head2 == null) return head1;
		
		if(head1.data < head2.data){
			head1.next = merge(head1.next ,head2);
			return head1;
		}
		else{
			head2.next = merge(head1,head2.next);
			return head2;
		}
	}
}

class MergeTwo{
	public static void main(String[] args){
		LinkedList.Node head1 = new LinkedList.Node(1);
		LinkedList.Node two = new LinkedList.Node(2);
		LinkedList.Node three = new LinkedList.Node(3);
		LinkedList.Node four = new LinkedList.Node(4);
		
		head1.next = two;
		two.next = three;
		three.next = four;
		
		LinkedList.Node head2 = new LinkedList.Node(5);
		LinkedList.Node two1 = new LinkedList.Node(6);
		LinkedList.Node three1 = new LinkedList.Node(7);
		LinkedList.Node four1 = new LinkedList.Node(8);
		head2.next = two1;
		two1.next = three1;
		three1.next = four1;
		
		LinkedList.Node node = LinkedList.merge(head1,head2);
		
		while(node!=null){
			System.out.print(node.data + " ");
			node = node.next;
		}
	}
}