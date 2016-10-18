class MergeSortForLinkedList {
	private Node first;

	public MergeSortForLinkedList() {
		first = null;
	}

	public boolean isEmpty() {
		boolean isEmpty = (first == null);
		return isEmpty;
	}
	

	public void insert(int val) {
		Node nNode = new Node(val);
		nNode.next = first;
		first = nNode;
	}

	public void append(Node result) {
		first = result;
	}

	public Node extractFirst() {
		return first;
	}

	public Node MergeSort(Node ogHead) {
		if (ogHead == null || ogHead.next == null)
			return ogHead;
		Node x = ogHead;
		Node y = ogHead.next;
		while ((y != null) && (y.next != null)) {
			ogHead = ogHead.next;
			y = (y.next).next;
		}
		y = ogHead.next;
		ogHead.next = null;
		return merge(MergeSort(x), MergeSort(y));
	}

	public Node merge(Node x, Node y) {
		Node tmp = new Node();
		Node head = tmp;
		Node z = head;

		while ((x != null) && (y != null)) {
			if (x.item <= y.item) {
				z.next = x;
				z = x;
				x = x.next;
			} else {
				z.next = y;
				z = y;
				y = y.next;
			}
		}

		z.next = (x == null) ? y : x;
		return head.next;
	}
}