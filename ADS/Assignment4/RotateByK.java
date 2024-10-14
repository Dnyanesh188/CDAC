

class RotateByK{
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
	int getLength(){
		Node trev = head;
		int len = 0;
		while(trev!=null){
			len++;
			trev = trev.next;
		}
		return len;
	}
	void rotateByK(int k){
		if(head == null) return;
		if(head.next == null) return;
		int len = getLength();
		k = k% len;
		if(k == 0) return;
		
		while(k>0){
			Node curr = head;
			head = head.next;
			Node trev = curr;
			while(trev.next != null){
				trev = trev.next;
			}
			trev.next = curr;
			curr.next = null;
			k--;
		}
		
	}
	void display(Node n){
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
	public static void main(String[] args){
		RotateByK l = new RotateByK();
		l.insert(10);
		l.insert(20);
		l.insert(30);
		l.insert(40);
		l.insert(50);
		int k = 2;
		l.display(l.head);
		System.out.println();
		l.rotateByK(k);
		l.display(l.head);
	}
}

