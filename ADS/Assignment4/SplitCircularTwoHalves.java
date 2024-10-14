class LinkedList{
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data =data;
			this.next = null;
		}
	}
	
	void append(int value){
		Node newNode = new Node(value);
		if(head == null){
			head = newNode;
			return;
		}
		if(head.next == null){
			head.next = newNode ;
			return;
		}
		Node trev = head;
		while(trev.next != null){
			trev = trev.next;
		}
		trev.next =newNode;
	}
	void makeCircular(){
		Node trev = head;
		while(trev.next != null){
			trev = trev.next;
		}
		trev.next = head;
	}
	
	Node findMid(){
		if(head == null) return null;
		if(head.next == null) return head;
		
		Node fast = head;
		Node slow = head;
		
		while(fast != head){
			System.out.println(fast.data);
			fast = fast.next;
			if(fast != head){
				fast = fast.next ;
				slow = slow.next;
			}
		}
		return slow;
	}
	
	void display(Node node){
		if(node == null) return;
		Node trev = node.next;
		System.out.print(node.data + " ");
		while(trev != node){
			System.out.print(trev.data + " ");
			trev = trev.next;
		}
	}
	
}

class SplitCircularTwoHalves{
	public static void main(String[] args){
		LinkedList l = new LinkedList();
		l.append(10);
		l.append(20);
		l.append(30);
		l.append(40);
		l.append(50);
		l.append(60);
		l.display(l.head);
		l.makeCircular();
		
		LinkedList.Node  mid = l.findMid();
		System.out.println(mid.data);
		/*LinkedList.Node head2 = null;
		if(mid != null){
			if(mid.next != null){
				head2 = mid.next;
				mid.next = null;
				LinkedList.Node trev = head2;
				while(trev.next !=l.head){
					trev = trev.next;
				}
				System.out.println(trev.data);
				trev.next = null;
			}
		}
		
		l.display(l.head);
		l.display(l.head);
		System.out.println();
		l.display(head2); **/
		
	}
}