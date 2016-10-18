
public class MergeSort implements Sorter {
	private static int x;
	private static int y;
	private static int boundry;
	private static Node first;

	@Override

	public MergeSort() {
		first = null;
	}

	public int[] location() {
		// If the head is stationary
		// if(boundry == 0){
		// System.out.println("Boundries have not yet been set");
		// }
		// if(x>0)x-=1;
		// else{
		// x = boundry; y-=1;
		// }
		// return new int[]{x,y};
		// If the head moves around between calls of location()
		x = (int) (Math.random() * boundry);
		y = (int) (Math.random() * boundry);
		if (boundry == 0)
			System.out.println("Boundries have not yet been set");
		return new int[] { x, y };
	}

	@Override
	public LinkedList sort(LinkedList aList) {
		// Somehow convert aList to a node, to actually make it a linked list,
		// or somehow get the head, make this bList
		Node bList = null; // See previous comment
		MergeSortForLinkedList a = new MergeSortForLinkedList();
		a.append(bList);
		Node cList = a.MergeSort(bList);// Sorted now
		// Somehow convert between cList (node) and LinkedList, call this dList
		LinkedList dList = null;// See previous comment
		return dList;
	}

	@Override
	public void setBoundaries(int side) {
		boundry = side;
		y = x = boundry;
	}

	@Override
	public void drawSorter() {
		StdDraw.setCanvasSize(boundry, boundry);
		StdDraw.setPenColor();
		StdDraw.point(x, y);

	}

	@Override
	public void drawFinal() {
		// Have no idea how to do this. Need info on how to draw the image
		// through standard draw, as Token Keepers are not using StdDraw, but
		// rather JFrame.
		// What I plan on doing:
		// iterate through the linked list, using its payload (hopefully a path)
		// to find an image corresponding to the node, which I will then draw
		// using stdDraw.picture();.

	}

}
