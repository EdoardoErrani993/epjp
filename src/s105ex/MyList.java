package s105ex;

public class MyList {
	private Node head; // sto creando un reference
	private int sizeValue;

	public void add(int value) {
		Node node = new Node(value);
		sizeValue++;

		if (head == null) {
			head = node;
		} else {

			Node cur = head;
			Node nextNode = cur.getNext();
			while (nextNode != null) {
				cur = nextNode;
				nextNode = cur.getNext();
			}
			cur.setNext(node);
		}

	}

	public int get() {
		return this.get(0);
	}

	public int get(int pos) {

	//	if (this.head == null) {
	//		return 0;
		//}

		if (this.head != null && pos > this.getSize()) {
			return 0;
		}

		int index = 0;
		Node cur = head;
		Node nextNode = cur.getNext();
		while (index <= pos && nextNode != null) {
			cur = nextNode;
			nextNode = cur.getNext();
			index++;
		}
		index++;
		return cur.getValue();

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

	public void pop() {
		if (head == null) {
			System.out.println("Lista vuota");
		}
		head = head.getNext();
		this.sizeValue--;
	}

}
