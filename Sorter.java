package org.phs.princetonk12.simran.projects.oct18.sorter;


public interface Sorter {
  // get The HEAD of the unsorted Array
  public Token getHead();
  
  // sort the unsorted Array, given the HEAD
  public Token[] sort(Token HEAD);
}
