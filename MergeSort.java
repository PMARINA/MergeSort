import java.util.LinkedList;
public class MergeSort implements Sorter {
	private static int x;
	private static int y;
	private static int boundry;
	@Override
	public int[] location() {
//If the head moves around between calls of location()
//		if(boundry == 0){
//			System.out.println("Boundries have not yet been set");
//		}
//		if(x>0)x-=1;
//		else{
//			x = boundry; y-=1;
//		}
//		return new int[]{x,y};
//If the head is stationary, and we need to look for it
		if(boundry == 0)System.out.println("Boundries have not yet been set");
		return new int[]{(int)(Math.random() * boundry),(int)(Math.random() * boundry)};
	}

	@Override
	public LinkedList sort(LinkedList aList) {
		return null;
	}

	@Override
	public void setBoundaries(int side) {
		boundry=side;
		y = x = boundry;
	}

	@Override
	public void drawSorter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawFinal() {
		// TODO Auto-generated method stub
		
	}
	
}
