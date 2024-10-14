
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
	void delete(int value){
		if(head == null) return;
		if(head.next == null && head.data == value) {
			head = null;
			return;
		}
		Node prev =head;
		Node trev = head;
		
		while(trev!= null ){
			if(trev.data != value){
				break;
			}
			trev = trev.next;
		}
		if(trev ==null) return;
		prev.next = trev.next ;
		trev.next = null;
	}
	Boolean search(int value){
		if(head == null) return false;
		Node trev = head;
		
		while(trev != null && trev.data != value){
			trev = trev.next;
		}
		if(trev == null) return false;
		
		return true;
	}
	
	public static void main(String[] args){
		LinkedList l = new LinkedList();
		l.insert(3);
		l.insert(7);
		l.insert(5);
		l.delete(7);
		System.out.println(l.search(5));
		
	}
}