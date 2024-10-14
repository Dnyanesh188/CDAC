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
	int getLength(Node head){
		Node trev = head;
		int len = 0;
		while(trev != null){
			len++;
			trev = trev.next;
		}
		return len;
	}
	Node findNthformlast(Node head , int position){
		int length = getLength(head);
		int finalPosi = length -position;
		if(finalPosi <0) return head;
		
		while(finalPosi!=0){
			head = head.next;
			finalPosi--;
		}
		return head;
	}
}

class FindNth{
	public static void main(String[] args){
		LinkedList l = new LinkedList();
		l.insert(10);
		l.insert(20);
		l.insert(30);
		l.insert(40);
		l.insert(50);
		LinkedList.Node node = l.findNthformlast(l.head,2);
		System.out.println(node.data);
	}
}