import java.util.LinkedList;
public class MergeSort implements Sorter {
	private static int x = 0;
	private static int y = 0;
	private static int boundry;
	@Override
	public int[] location() {
		if(boundry == 0){
			System.out.println("Boundries have not yet been set");
		}
		if(x<boundry)x+=2;
		else{
			x = 0; y+=2;
		}
		return new int[]{x,y};
	}

	@Override
	public LinkedList sort(LinkedList aList) {
		
	}

	@Override
	public void setBoundaries(int side) {
		boundry=side;	
	}
	
}
