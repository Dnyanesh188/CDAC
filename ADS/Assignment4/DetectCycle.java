

class DetectCycle{
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
	Boolean detectLoop(){
		Node slow = head;
		Node fast = head.next;
		while(fast!=null){
			fast = fast.next;
			if(fast !=null){
				fast = fast.next;
				slow = slow.next;
			}
			if(fast == slow){
				return true;
			}
		}
		return false;
	}
	public static void main(String [] args){
		DetectCycle l = new DetectCycle();
		
		l.insert(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);
		l.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = third;
		
		boolean detect = l.detectLoop();
		
		System.out.println(detect);
		
		
	}
}