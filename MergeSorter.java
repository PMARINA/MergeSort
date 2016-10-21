
import java.awt.Color;
import java.util.LinkedList;
import java.util.Random;

import StdLibraries.StdDraw;

public class MergeSort implements Sorter {
  
  private int side;
  private Integer[][] food = {{0,100,174,230}};
  private boolean[][] xyCell;
  
  private Random random = new Random();
  private int numCellVisited;
  
  /**
   * method that returns an array of integers with two elements in the format {x, y}
   * this method will be called periodically by the Driver class to get the exact location of the Sorter for the first part of the game
   * Location should change each time its called
   * 
   * If all cells have been visited already when location() is called, return null;
   * 
   * If all cells have not been visited yet, then
   *   randomly choose a cell that has not been visited yet and return the xy location as an int array,
   *   where 0th element is the x location and 1st location is y location
   * 
   */
  @Override
  public int[] location() {
    
    if (numCellVisited >= (side*side)) return null;
    
    int xrandom = -1;
    int yrandom = -1;
    
    // do not give a cell that has already been visited
    do {
      xrandom = random.nextInt(side);
      yrandom = random.nextInt(side);
    } while (!xyCell[xrandom][yrandom]);
    
    xyCell[xrandom][yrandom]= true;
    
    int[] ret = new int[2];
    ret[0] = xrandom;
    ret[1] = yrandom;
    
    numCellVisited++;
    
    return ret;
  }
  
  /**
   * will be called by the Driver when the Sorter "hits" the head in the first part of the game
   * provides the sorter with the head of the linked list that they are to sort
   * the method should then sort the LinkedList in ascending order and return the sorted Integers as a LinkedList upon completion
   */

 /* public LinkedList<Token> sort(LinkedList<Token> aList) {
	food = aList.toArray();
    new Mergesort().sort(aList);
    return aList;
  } */

  /**
   * method that provides the Sorter with the length and width of the coordinate plot through the variable side as it is a square
   * all of the values returned by the location() method will be within the coordinates of side by side
   * 0 <= x < side
   * 0 <= y < side
   * this method will be called prior to any location call
   */
 // @Override
  public void setBoundaries(int side) {
    this.side = side;
    numCellVisited = 0;
    xyCell = new boolean[side][];
    
    for (int i=0; i<side; i++){
      xyCell[i] = new boolean[side];
    }
  }
  

  
  public class Mergesort {
    private LinkedList<Token> tokens;
    private LinkedList<Token> helper;

    private int numTokens;

    public void sort(LinkedList<Token> values) {
      this.tokens = values;
      numTokens = values.size();
      this.helper = new LinkedList();
      mergesort(0, numTokens - 1);
    }

    private void mergesort(int low, int high) {
      // check if low is smaller then high, if not then the array is sorted
      if (low < high) {
        // Get the index of the element which is in the middle
        int middle = low + (high - low) / 2;
        // Sort the left side of the array
        mergesort(low, middle);
        // Sort the right side of the array
        mergesort(middle + 1, high);
        // Combine them both
        merge(low, middle, high);
      }
    }

    private void merge(int low, int middle, int high) {

      // Copy both parts into the helper array
      for (int i = low; i <= high; i++) {
        helper.add(i, tokens.get(i));
      }

      int i = low;
      int j = middle + 1;
      int k = low;
      
      // Copy the smallest values from either the left or the right side back
      // to the original array
      while (i <= middle && j <= high) {
        if (helper.get(i).getVal() <= helper.get(j).getVal()) {
          tokens.add(k, helper.get(i));
          i++;
        } else {
          tokens.add(k, helper.get(j));
          j++;
        }
        k++;
      }
      
      // Copy the rest of the left side of the array into the target array
      while (i <= middle) {
        tokens.add(k, helper.get(i));
        k++;
        i++;
      }

    }
  }

  @Override
  public void drawSorter() {
	  int x = food.length;
	  int y = food[food.length-1].length;
	  for(int i=0;i <y; i++){
		  for(int j = 0; j<x;j++){
			  StdDraw.setPenColor(new Color(food[j][i],food[j][i],food[j][i]));
			  StdDraw.filledSquare(i, j, 0.5);
		  }
	  }
  }
  public static void main(String[] args){
	  MergeSort a = new MergeSort();
	  StdDraw.setYscale(0,0.5);
	  StdDraw.setXscale(-.5, a.food[0].length-0.5);
	  a.drawSorter();
  }
  
  
}
