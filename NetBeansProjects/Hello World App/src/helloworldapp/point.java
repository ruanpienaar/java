/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package helloworldapp;

/**
 *
 * @author rp
 */
public class point {
  public static int instancecount;
  public int x;
  public int y;
  
  public point(){
    instancecount++;
  }
  
  public point(int InitX, int InitY){
    instancecount++;
    x = InitX;
    y = InitY;
  }
  
  public int getInstanceCount(){
    return instancecount;
  }
  
  public void moveCordinates(int x, int y){
    this.x = x;
    this.y = y;
  }
  
}
