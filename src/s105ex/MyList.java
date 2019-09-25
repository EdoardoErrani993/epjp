package s105ex;


public class MyList {
	private Node head; //sto creando un reference

	public void add(int value) {
		Node node = new Node(value);
		
		if (head == null) {
			head = node;
		}
		
		
	/*	
		Node cur = head;
		Node nextNode = cur.getNext();
		while (nextNode != null) {
			cur = nextNode;
			nextNode = cur.getNext();
		}
		cur.setNext(node);*/
	}
/*public int get() {
	return head;
}*/

}
