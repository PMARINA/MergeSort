package org.phs.princetonk12.simran.projects.oct18.group;

public interface Token {
  // get the x cordinate of token
  public int getX();
  
  // get the y co-ordinate of token
  public int getY();
  
  // get the numeric value of the token (which is used to sort)
  public int getVal();
  
  // get the next token
  public Token next();
}
