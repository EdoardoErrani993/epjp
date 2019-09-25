package s105ex;

public class MyList {
	private Node head; // sto creando un reference
	private int sizeValue = 0;

	public void add(int value) {
		Node node = new Node(value);
		sizeValue++;

		if (head == null) {
			head = node;
			return;
		}

		Node cur = head;
		Node nextNode = cur.getNext();
		while (nextNode != null) {
			cur = nextNode;
			nextNode = cur.getNext();
		}
		cur.setNext(node);
	}

	public int get(int pos) {
		if (this.head == null) {
			return 0;
		}

		if (this.head != null && pos > this.getSize()) {
			return 0;
		}

		int index = 0;
		while (index <= pos) {
			Node cur = head;
			Node nextNode = cur.getNext();
			while (nextNode != null) {
				cur = nextNode;
				nextNode = cur.getNext();
				index++;
			}
			
			
			
		}
		index++;

		return index;
	}

	public int getSize() { // quanti nodi ho creato
//
//		if (head == null) {
//			return 0;
//		}
//		int count = 0;
//
//		Node cur = head;
//		Node nextNode = cur.getNext();
//		while (nextNode != null) {
//			cur = nextNode;
//			nextNode = cur.getNext();
//			count++;
//		}
//		count++;

//		return count;
		return sizeValue;
	}

}
