public class Node {
	public int item;
	public Node next;

	public Node(int val) {
		item = val;
	}

	public Node() {

	}

	public void printNode() {
		System.out.println("[" + item + "] ");
	}
}
