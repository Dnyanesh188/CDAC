class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};

class Solution {
    public Node flatten(Node head) {
        if(head == null) return head;

        Node node = null;
        Node trev = head;
        while(trev.next != null){
            if(trev.child != null){
                node = trev;
                trev = trev.next;
                break;
            }
            trev = trev.next;
        }
        if(node == null) {
            if(trev.child != null){
                node = trev;
                trev = null;
            }
            else{
                return head;
            }
        }

        Node next = node.child;
        node.child = null;
        node.next = flatten(next);
        node.next.prev = node;

        if(trev != null){
            Node temp = next;
            while(temp.next !=null){
                temp = temp.next;
            }
            temp.next = trev;
            trev.prev = temp;
        }
        return head;

    }
}